package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.common.util.EList;
import org.openscada.deploy.iolist.model.Item;

public class LevelColumnReader extends TextColumnReader
{

    private final int levelIndex;

    public LevelColumnReader ( final int levelIndex )
    {
        this.levelIndex = levelIndex;
    }

    @Override
    public void setValue ( final Item item, final String value )
    {
        final EList<String> h = item.getHierarchy ();

        while ( h.size () < this.levelIndex )
        {
            h.add ( null );
        }
        if ( h.size () == this.levelIndex )
        {
            h.add ( value );
        }
        else
        {
            h.set ( this.levelIndex, value );
        }
    }
}
