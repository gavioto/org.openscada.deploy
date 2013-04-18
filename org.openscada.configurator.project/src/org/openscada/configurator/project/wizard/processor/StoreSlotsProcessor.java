package org.openscada.configurator.project.wizard.processor;

import java.util.LinkedList;
import java.util.List;

import org.openscada.configuration.model.ConfigurationSlot;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.processor.common.CommonFactory;
import org.openscada.configurator.processor.common.StoreConfigurationSlotProcessor;
import org.openscada.configurator.project.wizard.CreationResult;

public class StoreSlotsProcessor extends AbstractProcessor
{

    public static final int PRIORITY = 1000;

    private final List<ConfigurationSlot> slots = new LinkedList<ConfigurationSlot> ();

    public StoreSlotsProcessor ()
    {
        super ( PRIORITY );
    }

    public List<ConfigurationSlot> getSlots ()
    {
        return this.slots;
    }

    @Override
    public void process ( final CreationResult result )
    {
        if ( this.slots.isEmpty () )
        {
            return;
        }

        final Project project = result.getObject ( "project", Project.class );

        final StoreConfigurationSlotProcessor storeSlots = CommonFactory.eINSTANCE.createStoreConfigurationSlotProcessor ();

        storeSlots.getSlots ().addAll ( this.slots );

        project.getProcessors ().add ( storeSlots );
    }

}
