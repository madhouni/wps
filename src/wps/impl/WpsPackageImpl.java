/**
 */
package wps.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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

import wps.util.WpsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WpsPackageImpl extends EPackageImpl implements WpsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveurWpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEntreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometrieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEntierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementNommeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationWpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appelProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeSaisieEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see wps.WpsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WpsPackageImpl() {
		super(eNS_URI, WpsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WpsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WpsPackage init() {
		if (isInited) return (WpsPackage)EPackage.Registry.INSTANCE.getEPackage(WpsPackage.eNS_URI);

		// Obtain or create and register package
		WpsPackageImpl theWpsPackage = (WpsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WpsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WpsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWpsPackage.createPackageContents();

		// Initialize created meta-data
		theWpsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWpsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WpsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWpsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WpsPackage.eNS_URI, theWpsPackage);
		return theWpsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServeurWps() {
		return serveurWpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServeurWps_Lien() {
		return (EAttribute)serveurWpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Sorties() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Serveur() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Description() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Entrees() {
		return (EReference)processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionEntree() {
		return descriptionEntreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometrie() {
		return geometrieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaster() {
		return rasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortie() {
		return sortieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionEntier() {
		return descriptionEntierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionEntier_Minimum() {
		return (EAttribute)descriptionEntierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionEntier_Maximum() {
		return (EAttribute)descriptionEntierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionEntier_Pas() {
		return (EAttribute)descriptionEntierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionEntier_ParDefaut() {
		return (EAttribute)descriptionEntierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementNomme() {
		return elementNommeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementNomme_Nom() {
		return (EAttribute)elementNommeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationWps() {
		return configurationWpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationWps_AppelProcess() {
		return (EReference)configurationWpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationWps_Process() {
		return (EReference)configurationWpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppelProcess() {
		return appelProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppelProcess_Process() {
		return (EReference)appelProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppelProcess_Entrees() {
		return (EReference)appelProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntier() {
		return entierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntier_Valeur() {
		return (EAttribute)entierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntier_Description() {
		return (EReference)entierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntree() {
		return entreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntree_Saisie() {
		return (EAttribute)entreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_LienReference() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeSaisie() {
		return typeSaisieEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WpsFactory getWpsFactory() {
		return (WpsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serveurWpsEClass = createEClass(SERVEUR_WPS);
		createEAttribute(serveurWpsEClass, SERVEUR_WPS__LIEN);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__SORTIES);
		createEReference(processEClass, PROCESS__SERVEUR);
		createEAttribute(processEClass, PROCESS__DESCRIPTION);
		createEReference(processEClass, PROCESS__ENTREES);

		literalEClass = createEClass(LITERAL);

		descriptionEntreeEClass = createEClass(DESCRIPTION_ENTREE);

		geometrieEClass = createEClass(GEOMETRIE);

		rasterEClass = createEClass(RASTER);

		sortieEClass = createEClass(SORTIE);

		descriptionEntierEClass = createEClass(DESCRIPTION_ENTIER);
		createEAttribute(descriptionEntierEClass, DESCRIPTION_ENTIER__MINIMUM);
		createEAttribute(descriptionEntierEClass, DESCRIPTION_ENTIER__MAXIMUM);
		createEAttribute(descriptionEntierEClass, DESCRIPTION_ENTIER__PAS);
		createEAttribute(descriptionEntierEClass, DESCRIPTION_ENTIER__PAR_DEFAUT);

		elementNommeEClass = createEClass(ELEMENT_NOMME);
		createEAttribute(elementNommeEClass, ELEMENT_NOMME__NOM);

		configurationWpsEClass = createEClass(CONFIGURATION_WPS);
		createEReference(configurationWpsEClass, CONFIGURATION_WPS__APPEL_PROCESS);
		createEReference(configurationWpsEClass, CONFIGURATION_WPS__PROCESS);

		appelProcessEClass = createEClass(APPEL_PROCESS);
		createEReference(appelProcessEClass, APPEL_PROCESS__PROCESS);
		createEReference(appelProcessEClass, APPEL_PROCESS__ENTREES);

		entierEClass = createEClass(ENTIER);
		createEAttribute(entierEClass, ENTIER__VALEUR);
		createEReference(entierEClass, ENTIER__DESCRIPTION);

		entreeEClass = createEClass(ENTREE);
		createEAttribute(entreeEClass, ENTREE__SAISIE);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__LIEN_REFERENCE);

		// Create enums
		typeSaisieEEnum = createEEnum(TYPE_SAISIE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processEClass.getESuperTypes().add(this.getElementNomme());
		literalEClass.getESuperTypes().add(this.getDescriptionEntree());
		descriptionEntreeEClass.getESuperTypes().add(this.getElementNomme());
		geometrieEClass.getESuperTypes().add(this.getDescriptionEntree());
		rasterEClass.getESuperTypes().add(this.getDescriptionEntree());
		sortieEClass.getESuperTypes().add(this.getElementNomme());
		descriptionEntierEClass.getESuperTypes().add(this.getLiteral());
		appelProcessEClass.getESuperTypes().add(this.getElementNomme());
		entierEClass.getESuperTypes().add(this.getEntree());
		entreeEClass.getESuperTypes().add(this.getElementNomme());
		referenceEClass.getESuperTypes().add(this.getEntree());

		// Initialize classes, features, and operations; add parameters
		initEClass(serveurWpsEClass, ServeurWps.class, "ServeurWps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServeurWps_Lien(), ecorePackage.getEString(), "lien", null, 1, 1, ServeurWps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, wps.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_Sorties(), this.getSortie(), null, "sorties", null, 1, -1, wps.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Serveur(), this.getServeurWps(), null, "serveur", null, 1, 1, wps.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Description(), ecorePackage.getEString(), "description", null, 1, 1, wps.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Entrees(), this.getDescriptionEntree(), null, "entrees", null, 1, -1, wps.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionEntreeEClass, DescriptionEntree.class, "DescriptionEntree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geometrieEClass, Geometrie.class, "Geometrie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rasterEClass, Raster.class, "Raster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortieEClass, Sortie.class, "Sortie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionEntierEClass, DescriptionEntier.class, "DescriptionEntier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptionEntier_Minimum(), ecorePackage.getEInt(), "minimum", null, 1, 1, DescriptionEntier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionEntier_Maximum(), ecorePackage.getEInt(), "maximum", "100", 1, 1, DescriptionEntier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionEntier_Pas(), ecorePackage.getEInt(), "pas", "1", 1, 1, DescriptionEntier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionEntier_ParDefaut(), ecorePackage.getEInt(), "parDefaut", "50", 1, 1, DescriptionEntier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementNommeEClass, ElementNomme.class, "ElementNomme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementNomme_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, ElementNomme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationWpsEClass, ConfigurationWps.class, "ConfigurationWps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationWps_AppelProcess(), this.getProcess(), null, "appelProcess", null, 0, -1, ConfigurationWps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationWps_Process(), this.getServeurWps(), null, "process", null, 1, -1, ConfigurationWps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appelProcessEClass, AppelProcess.class, "AppelProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppelProcess_Process(), this.getProcess(), null, "process", null, 1, 1, AppelProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppelProcess_Entrees(), this.getEntree(), null, "entrees", null, 0, -1, AppelProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entierEClass, Entier.class, "Entier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntier_Valeur(), ecorePackage.getEInt(), "valeur", null, 1, 1, Entier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntier_Description(), this.getDescriptionEntier(), null, "description", null, 1, 1, Entier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entreeEClass, Entree.class, "Entree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntree_Saisie(), this.getTypeSaisie(), "saisie", null, 1, 1, Entree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_LienReference(), ecorePackage.getEString(), "lienReference", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeSaisieEEnum, TypeSaisie.class, "TypeSaisie");
		addEEnumLiteral(typeSaisieEEnum, TypeSaisie.PAR_DEFAUT);
		addEEnumLiteral(typeSaisieEEnum, TypeSaisie.FIXE);
		addEEnumLiteral(typeSaisieEEnum, TypeSaisie.LIBRE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (descriptionEntierEClass, 
		   source, 
		   new String[] {
			 "constraints", "minInfMax estUnPas"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (serveurWpsEClass, 
		   source, 
		   new String[] {
			 null, "lien.startsWith(\'http://\')"
		   });	
		addAnnotation
		  (descriptionEntierEClass, 
		   source, 
		   new String[] {
			 "minInfMax", "minimum < maximum",
			 "estUnPas", "pas = 1"
		   });
		addAnnotation
		  (descriptionEntierEClass, 
		   new boolean[] { true },
		   "http://www.eclipse.org/emf/2002/GenModel",
		   new String[] {
			 "documentation", "Verification du pas"
		   });
	}

} //WpsPackageImpl
