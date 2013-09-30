/*
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2006-2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
 * Copyright (C) 2013 Jens Reimann (ctron@dentrassi.de)
 * Copyright (C) 2013 Jürgen Rose (cptmauli@googlemail.com)
 *
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 *
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 */

package org.openscada.configurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.scada.ca.oscar.OscarLoader;
import org.openscada.configurator.data.ConfigurationTarget;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GenericConfiguration implements ConfigurationTarget
{

    private final Map<String, Set<String>> ignoreFields = new HashMap<String, Set<String>> ();

    protected final Map<String, Map<String, Map<String, String>>> data = new HashMap<String, Map<String, Map<String, String>>> ();

    public GenericConfiguration ()
    {
    }

    public Map<String, Map<String, Map<String, String>>> getData ()
    {
        return this.data;
    }

    protected void addIgnoreFields ( final String factoryId, final String... field )
    {
        Set<String> fields = this.ignoreFields.get ( factoryId );
        if ( fields == null )
        {
            fields = new HashSet<String> ();
            this.ignoreFields.put ( factoryId, fields );
        }
        fields.addAll ( Arrays.asList ( field ) );
    }

    @Override
    public void addData ( final String factory, final String id, final Map<String, String> sourceData )
    {
        if ( factory == null || id == null || factory.isEmpty () || id.isEmpty () )
        {
            throw new NullPointerException ( String.format ( "Must not be null (%s - %s)", factory, id ) );
        }

        for ( final Map.Entry<String, String> entry : sourceData.entrySet () )
        {
            if ( entry.getKey () == null || entry.getKey ().isEmpty () )
            {
                throw new NullPointerException ( String.format ( "Key must not be null (%s - %s): %s", factory, id, this.data ) );
            }
        }

        final Map<String, String> data = new HashMap<String, String> ();
        for ( final Map.Entry<String, String> entry : sourceData.entrySet () )
        {
            if ( entry.getValue () == null )
            {
                continue;
            }

            data.put ( entry.getKey (), entry.getValue () );
        }

        Map<String, Map<String, String>> factoryMap = this.data.get ( factory );
        if ( factoryMap == null )
        {
            factoryMap = new HashMap<String, Map<String, String>> ();
            this.data.put ( factory, factoryMap );
        }
        factoryMap.put ( id, new HashMap<String, String> ( data ) );
    }

    public void write ( final File baseDir ) throws Exception
    {
        if ( !baseDir.exists () )
        {
            baseDir.mkdirs ();
        }

        File dataFile;
        final PrintStream dataStream = new PrintStream ( dataFile = new File ( baseDir, "data.json" ) );

        writeJson ( dataStream );
        dataStream.close ();

        File ignoreFieldsFile;
        final PrintStream ignoreStream = new PrintStream ( ignoreFieldsFile = new File ( baseDir, "ignoreFields.json" ) );
        final Gson g = new GsonBuilder ().setPrettyPrinting ().create ();
        g.toJson ( this.ignoreFields, ignoreStream );
        ignoreStream.close ();

        makeOscar ( dataFile, ignoreFieldsFile, new File ( baseDir, "configuration.oscar" ) );

        makeCa ( new File ( baseDir, "ca.zip" ) );

        writeXml ( new File ( baseDir, "objects.xml" ) );
    }

    private void writeXml ( final File file ) throws Exception
    {
        final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance ();
        final DocumentBuilder db = dbf.newDocumentBuilder ();
        final Document doc = db.newDocument ();

        doc.setNodeValue ( "root" );

        final Element root = doc.createElement ( "root" );
        doc.appendChild ( root );

        for ( final Map.Entry<String, Map<String, Map<String, String>>> factory : this.data.entrySet () )
        {
            final Element factoryElement = doc.createElement ( "factory" );
            root.appendChild ( factoryElement );
            factoryElement.setAttribute ( "id", factory.getKey () );

            for ( final Map.Entry<String, Map<String, String>> conf : factory.getValue ().entrySet () )
            {
                final Element configurationElement = doc.createElement ( "configuration" );
                factoryElement.appendChild ( configurationElement );
                configurationElement.setAttribute ( "id", conf.getKey () );

                for ( final Map.Entry<String, String> entry : conf.getValue ().entrySet () )
                {
                    final Element entryElement = doc.createElement ( "entry" );
                    configurationElement.appendChild ( entryElement );
                    entryElement.setAttribute ( "name", entry.getKey () );
                    final Node dataNode = makeDataNode ( doc, entry );
                    entryElement.appendChild ( dataNode );
                }
            }
        }

        final TransformerFactory tf = TransformerFactory.newInstance ();
        final Transformer transformer = tf.newTransformer ();
        transformer.setOutputProperty ( OutputKeys.INDENT, "yes" );
        transformer.setOutputProperty ( OutputKeys.ENCODING, "UTF-8" );
        transformer.setOutputProperty ( "{http://xml.apache.org/xslt}indent-amount", String.valueOf ( 3 ) );

        //initialize StreamResult with File object to save to file
        final FileWriter writer = new FileWriter ( file );
        try
        {
            final StreamResult result = new StreamResult ( writer );
            final DOMSource source = new DOMSource ( doc );
            transformer.transform ( source, result );
        }
        finally
        {
            writer.close ();
        }

    }

    private Text makeDataNode ( final Document doc, final Map.Entry<String, String> entry )
    {
        final String data = "" + entry.getValue ();
        if ( data.matches ( "[\\p{Alnum}\\p{Space}_\\+-\\+\\/=()@\\.\\:]+" ) )
        {
            return doc.createTextNode ( data );
        }
        else
        {
            return doc.createCDATASection ( data );
        }
    }

    private void makeOscar ( final File dataFile, final File ignoreFieldsFile, final File oscarFile ) throws IOException
    {
        final ZipOutputStream zout = new ZipOutputStream ( new FileOutputStream ( oscarFile ) );

        storeFile ( dataFile, zout, "data.json" );

        if ( ignoreFieldsFile != null )
        {
            storeFile ( ignoreFieldsFile, zout, "ignoreFields.json" );
        }

        zout.close ();
    }

    private void makeCa ( final File caFile ) throws IOException
    {
        final ZipOutputStream zout = new ZipOutputStream ( new FileOutputStream ( caFile ) );
        for ( final Map.Entry<String, Map<String, Map<String, String>>> factory : this.data.entrySet () )
        {
            final String factoryId = factory.getKey ();
            zout.putNextEntry ( new ZipEntry ( factoryId + File.separator ) );
            zout.putNextEntry ( new ZipEntry ( factoryId + File.separator + ".meta" ) );
            Properties p = new Properties ();
            p.put ( "id", factoryId );
            p.store ( zout, "" );
            for ( final Map.Entry<String, Map<String, String>> conf : factory.getValue ().entrySet () )
            {
                final String confId = URLEncoder.encode ( conf.getKey (), "UTF-8" );
                zout.putNextEntry ( new ZipEntry ( factoryId + File.separator + confId ) );
                p = new Properties ();
                for ( final Map.Entry<String, String> entry : conf.getValue ().entrySet () )
                {
                    p.put ( entry.getKey (), entry.getValue () );
                }
                p.store ( zout, "" );
            }
        }
        zout.close ();
    }

    private void storeFile ( final File dataFile, final ZipOutputStream zout, final String name ) throws IOException, FileNotFoundException
    {
        final ZipEntry entry = new ZipEntry ( name );
        zout.putNextEntry ( entry );

        final byte[] buf = new byte[8 * 1024];
        final FileInputStream in = new FileInputStream ( dataFile );
        int len;
        while ( ( len = in.read ( buf ) ) > 0 )
        {
            zout.write ( buf, 0, len );
        }
        in.close ();
        zout.closeEntry ();
    }

    public void writeJson ( final PrintStream dataStream ) throws FileNotFoundException
    {
        final Gson g = new GsonBuilder ().setPrettyPrinting ().create ();
        g.toJson ( this.data, dataStream );
    }

    public void loadData ( final String uri )
    {
        Map<String, Map<String, Map<String, String>>> baseData;
        try
        {
            baseData = OscarLoader.loadJsonData ( new URL ( uri ).openStream () );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }

        for ( final Map.Entry<String, Map<String, Map<String, String>>> entry1 : baseData.entrySet () )
        {
            for ( final Map.Entry<String, Map<String, String>> entry2 : entry1.getValue ().entrySet () )
            {
                addData ( entry1.getKey (), entry2.getKey (), entry2.getValue () );
            }
        }
    }
}