/**
 */
package wps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import wps.TypeSaisie;
import wps.WpsFactory;
import wps.WpsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WpsFactoryImpl extends EFactoryImpl implements WpsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WpsFactory init() {
		try {
			WpsFactory theWpsFactory = (WpsFactory)EPackage.Registry.INSTANCE.getEFactory(WpsPackage.eNS_URI);
			if (theWpsFactory != null) {
				return theWpsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WpsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WpsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WpsPackage.SERVEUR_WPS: return createServeurWps();
			case WpsPackage.PROCESS: return createProcess();
			case WpsPackage.LITERAL: return createLiteral();
			case WpsPackage.DESCRIPTION_ENTREE: return createDescriptionEntree();
			case WpsPackage.GEOMETRIE: return createGeometrie();
			case WpsPackage.RASTER: return createRaster();
			case WpsPackage.SORTIE: return createSortie();
			case WpsPackage.DESCRIPTION_ENTIER: return createDescriptionEntier();
			case WpsPackage.ELEMENT_NOMME: return createElementNomme();
			case WpsPackage.CONFIGURATION_WPS: return createConfigurationWps();
			case WpsPackage.APPEL_PROCESS: return createAppelProcess();
			case WpsPackage.ENTIER: return createEntier();
			case WpsPackage.ENTREE: return createEntree();
			case WpsPackage.REFERENCE: return createReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WpsPackage.TYPE_SAISIE:
				return createTypeSaisieFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WpsPackage.TYPE_SAISIE:
				return convertTypeSaisieToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurWps createServeurWps() {
		ServeurWpsImpl serveurWps = new ServeurWpsImpl();
		return serveurWps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wps.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionEntree createDescriptionEntree() {
		DescriptionEntreeImpl descriptionEntree = new DescriptionEntreeImpl();
		return descriptionEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometrie createGeometrie() {
		GeometrieImpl geometrie = new GeometrieImpl();
		return geometrie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Raster createRaster() {
		RasterImpl raster = new RasterImpl();
		return raster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sortie createSortie() {
		SortieImpl sortie = new SortieImpl();
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionEntier createDescriptionEntier() {
		DescriptionEntierImpl descriptionEntier = new DescriptionEntierImpl();
		return descriptionEntier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementNomme createElementNomme() {
		ElementNommeImpl elementNomme = new ElementNommeImpl();
		return elementNomme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationWps createConfigurationWps() {
		ConfigurationWpsImpl configurationWps = new ConfigurationWpsImpl();
		return configurationWps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppelProcess createAppelProcess() {
		AppelProcessImpl appelProcess = new AppelProcessImpl();
		return appelProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entier createEntier() {
		EntierImpl entier = new EntierImpl();
		return entier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entree createEntree() {
		EntreeImpl entree = new EntreeImpl();
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisie createTypeSaisieFromString(EDataType eDataType, String initialValue) {
		TypeSaisie result = TypeSaisie.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeSaisieToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WpsPackage getWpsPackage() {
		return (WpsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WpsPackage getPackage() {
		return WpsPackage.eINSTANCE;
	}

} //WpsFactoryImpl
