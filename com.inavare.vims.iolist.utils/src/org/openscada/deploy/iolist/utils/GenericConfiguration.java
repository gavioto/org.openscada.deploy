package org.openscada.deploy.iolist.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GenericConfiguration
{

    private final Map<String, Set<String>> ignoreFields = new HashMap<String, Set<String>> ();

    private final Map<String, Map<String, Map<String, Object>>> data = new HashMap<String, Map<String, Map<String, Object>>> ();

    public GenericConfiguration ()
    {
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

    protected void addData ( final String factory, final String id, final Map<String, Object> data )
    {
        Map<String, Map<String, Object>> factoryMap = this.data.get ( factory );
        if ( factoryMap == null )
        {
            factoryMap = new HashMap<String, Map<String, Object>> ();
            this.data.put ( factory, factoryMap );
        }
        factoryMap.put ( id, new HashMap<String, Object> ( data ) );
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

        for ( final Map.Entry<String, Map<String, Map<String, Object>>> factory : this.data.entrySet () )
        {
            final Element factoryElement = doc.createElement ( "factory" );
            root.appendChild ( factoryElement );
            factoryElement.setAttribute ( "id", factory.getKey () );

            for ( final Map.Entry<String, Map<String, Object>> conf : factory.getValue ().entrySet () )
            {
                final Element configurationElement = doc.createElement ( "configuration" );
                factoryElement.appendChild ( configurationElement );
                configurationElement.setAttribute ( "id", conf.getKey () );

                for ( final Map.Entry<String, Object> entry : conf.getValue ().entrySet () )
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

    private Text makeDataNode ( final Document doc, final Map.Entry<String, Object> entry )
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

    private void writeJson ( final PrintStream dataStream ) throws FileNotFoundException
    {
        final Gson g = new GsonBuilder ().setPrettyPrinting ().create ();
        g.toJson ( this.data, dataStream );
    }

}