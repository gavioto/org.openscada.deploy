package org.openscada.deploy.iolist.utils;

import java.util.Collection;

import org.openscada.deploy.iolist.model.Item;

public class DuplicateItemsException extends RuntimeException
{

    private static final long serialVersionUID = 1L;

    private final Collection<Item> items;

    public DuplicateItemsException ( final Collection<Item> items )
    {
        this.items = items;
    }

    public Collection<Item> getItems ()
    {
        return this.items;
    }
}
