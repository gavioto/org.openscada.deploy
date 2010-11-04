package com.inavare.vims.iolist.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AbstractConfiguration
{

    private final Map<String, Set<String>> ignoreFields = new HashMap<String, Set<String>> ();

    private final Map<String, Map<String, Map<String, Object>>> data = new HashMap<String, Map<String, Map<String, Object>>> ();

    public AbstractConfiguration ()
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