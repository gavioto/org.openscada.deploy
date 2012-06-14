/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openscada.deploy.iolist.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.deploy.iolist.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelAdapterFactory()
    {
        if (modelPackage == null)
        {
            modelPackage = ModelPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object)
    {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelSwitch<Adapter> modelSwitch =
        new ModelSwitch<Adapter>()
        {
            @Override
            public Adapter caseItem(Item object)
            {
                return createItemAdapter();
            }
            @Override
            public Adapter caseSummaryGroup(SummaryGroup object)
            {
                return createSummaryGroupAdapter();
            }
            @Override
            public Adapter caseSummaryItem(SummaryItem object)
            {
                return createSummaryItemAdapter();
            }
            @Override
            public Adapter caseFormulaItem(FormulaItem object)
            {
                return createFormulaItemAdapter();
            }
            @Override
            public Adapter caseFormulaInput(FormulaInput object)
            {
                return createFormulaInputAdapter();
            }
            @Override
            public Adapter caseScriptModule(ScriptModule object)
            {
                return createScriptModuleAdapter();
            }
            @Override
            public Adapter caseModel(Model object)
            {
                return createModelAdapter();
            }
            @Override
            public Adapter caseScriptItem(ScriptItem object)
            {
                return createScriptItemAdapter();
            }
            @Override
            public Adapter caseScriptOutput(ScriptOutput object)
            {
                return createScriptOutputAdapter();
            }
            @Override
            public Adapter caseMapper(Mapper object)
            {
                return createMapperAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object)
            {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target)
    {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.Item <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.Item
     * @generated
     */
    public Adapter createItemAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.SummaryGroup <em>Summary Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.SummaryGroup
     * @generated
     */
    public Adapter createSummaryGroupAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.SummaryItem <em>Summary Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.SummaryItem
     * @generated
     */
    public Adapter createSummaryItemAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.FormulaItem <em>Formula Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.FormulaItem
     * @generated
     */
    public Adapter createFormulaItemAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.FormulaInput <em>Formula Input</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.FormulaInput
     * @generated
     */
    public Adapter createFormulaInputAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.ScriptModule <em>Script Module</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.ScriptModule
     * @generated
     */
    public Adapter createScriptModuleAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.Model
     * @generated
     */
    public Adapter createModelAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.ScriptItem <em>Script Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.ScriptItem
     * @generated
     */
    public Adapter createScriptItemAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.ScriptOutput <em>Script Output</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.ScriptOutput
     * @generated
     */
    public Adapter createScriptOutputAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.deploy.iolist.model.Mapper <em>Mapper</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.deploy.iolist.model.Mapper
     * @generated
     */
    public Adapter createMapperAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter()
    {
        return null;
    }

} //ModelAdapterFactory