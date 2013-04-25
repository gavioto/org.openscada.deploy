package org.openscada.configurator.project.wizard.processor;

import org.openscada.configurator.project.wizard.CreationResult.Processor;

public abstract class AbstractProcessor implements Processor
{
    private final int priority;

    public AbstractProcessor ( final int priority )
    {
        this.priority = priority;
    }

    @Override
    public int getPriority ()
    {
        return this.priority;
    }

    @Override
    public int compareTo ( final Processor o )
    {
        return Integer.valueOf ( getPriority () ).compareTo ( o.getPriority () );
    }
}
