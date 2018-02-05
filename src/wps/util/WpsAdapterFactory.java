/**
 */
package wps.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import wps.AppelProcess;
import wps.ConfigurationWps;
import wps.DescriptionEntier;
import wps.DescriptionEntree;
import wps.ElementNomme;
import wps.Entier;
import wps.Entree;
import wps.Geometrie;
import wps.Literal;
import wps.Raster;
import wps.Reference;
import wps.ServeurWps;
import wps.Sortie;
import wps.WpsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wps.WpsPackage
 * @generated
 */
public class WpsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WpsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WpsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WpsPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected WpsSwitch<Adapter> modelSwitch =
		new WpsSwitch<Adapter>() {
			@Override
			public Adapter caseServeurWps(ServeurWps object) {
				return createServeurWpsAdapter();
			}
			@Override
			public Adapter caseProcess(wps.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseDescriptionEntree(DescriptionEntree object) {
				return createDescriptionEntreeAdapter();
			}
			@Override
			public Adapter caseGeometrie(Geometrie object) {
				return createGeometrieAdapter();
			}
			@Override
			public Adapter caseRaster(Raster object) {
				return createRasterAdapter();
			}
			@Override
			public Adapter caseSortie(Sortie object) {
				return createSortieAdapter();
			}
			@Override
			public Adapter caseDescriptionEntier(DescriptionEntier object) {
				return createDescriptionEntierAdapter();
			}
			@Override
			public Adapter caseElementNomme(ElementNomme object) {
				return createElementNommeAdapter();
			}
			@Override
			public Adapter caseConfigurationWps(ConfigurationWps object) {
				return createConfigurationWpsAdapter();
			}
			@Override
			public Adapter caseAppelProcess(AppelProcess object) {
				return createAppelProcessAdapter();
			}
			@Override
			public Adapter caseEntier(Entier object) {
				return createEntierAdapter();
			}
			@Override
			public Adapter caseEntree(Entree object) {
				return createEntreeAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link wps.ServeurWps <em>Serveur Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.ServeurWps
	 * @generated
	 */
	public Adapter createServeurWpsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.DescriptionEntree <em>Description Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.DescriptionEntree
	 * @generated
	 */
	public Adapter createDescriptionEntreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.Geometrie <em>Geometrie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.Geometrie
	 * @generated
	 */
	public Adapter createGeometrieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.Raster <em>Raster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.Raster
	 * @generated
	 */
	public Adapter createRasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.Sortie
	 * @generated
	 */
	public Adapter createSortieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.DescriptionEntier <em>Description Entier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.DescriptionEntier
	 * @generated
	 */
	public Adapter createDescriptionEntierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.ElementNomme <em>Element Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.ElementNomme
	 * @generated
	 */
	public Adapter createElementNommeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.ConfigurationWps <em>Configuration Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.ConfigurationWps
	 * @generated
	 */
	public Adapter createConfigurationWpsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.AppelProcess <em>Appel Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.AppelProcess
	 * @generated
	 */
	public Adapter createAppelProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.Entier <em>Entier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.Entier
	 * @generated
	 */
	public Adapter createEntierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.Entree
	 * @generated
	 */
	public Adapter createEntreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wps.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wps.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WpsAdapterFactory
