/**
 */
package wps.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see wps.WpsPackage
 * @generated
 */
public class WpsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WpsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WpsSwitch() {
		if (modelPackage == null) {
			modelPackage = WpsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WpsPackage.SERVEUR_WPS: {
				ServeurWps serveurWps = (ServeurWps)theEObject;
				T result = caseServeurWps(serveurWps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.PROCESS: {
				wps.Process process = (wps.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseElementNomme(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseDescriptionEntree(literal);
				if (result == null) result = caseElementNomme(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.DESCRIPTION_ENTREE: {
				DescriptionEntree descriptionEntree = (DescriptionEntree)theEObject;
				T result = caseDescriptionEntree(descriptionEntree);
				if (result == null) result = caseElementNomme(descriptionEntree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.GEOMETRIE: {
				Geometrie geometrie = (Geometrie)theEObject;
				T result = caseGeometrie(geometrie);
				if (result == null) result = caseDescriptionEntree(geometrie);
				if (result == null) result = caseElementNomme(geometrie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.RASTER: {
				Raster raster = (Raster)theEObject;
				T result = caseRaster(raster);
				if (result == null) result = caseDescriptionEntree(raster);
				if (result == null) result = caseElementNomme(raster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.SORTIE: {
				Sortie sortie = (Sortie)theEObject;
				T result = caseSortie(sortie);
				if (result == null) result = caseElementNomme(sortie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.DESCRIPTION_ENTIER: {
				DescriptionEntier descriptionEntier = (DescriptionEntier)theEObject;
				T result = caseDescriptionEntier(descriptionEntier);
				if (result == null) result = caseLiteral(descriptionEntier);
				if (result == null) result = caseDescriptionEntree(descriptionEntier);
				if (result == null) result = caseElementNomme(descriptionEntier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.ELEMENT_NOMME: {
				ElementNomme elementNomme = (ElementNomme)theEObject;
				T result = caseElementNomme(elementNomme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.CONFIGURATION_WPS: {
				ConfigurationWps configurationWps = (ConfigurationWps)theEObject;
				T result = caseConfigurationWps(configurationWps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.APPEL_PROCESS: {
				AppelProcess appelProcess = (AppelProcess)theEObject;
				T result = caseAppelProcess(appelProcess);
				if (result == null) result = caseElementNomme(appelProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.ENTIER: {
				Entier entier = (Entier)theEObject;
				T result = caseEntier(entier);
				if (result == null) result = caseEntree(entier);
				if (result == null) result = caseElementNomme(entier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.ENTREE: {
				Entree entree = (Entree)theEObject;
				T result = caseEntree(entree);
				if (result == null) result = caseElementNomme(entree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WpsPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseEntree(reference);
				if (result == null) result = caseElementNomme(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Wps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Wps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeurWps(ServeurWps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(wps.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionEntree(DescriptionEntree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometrie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometrie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometrie(Geometrie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaster(Raster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sortie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortie(Sortie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Entier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Entier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionEntier(DescriptionEntier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Nomme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Nomme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementNomme(ElementNomme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Wps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Wps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationWps(ConfigurationWps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appel Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appel Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppelProcess(AppelProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntier(Entier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntree(Entree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WpsSwitch
