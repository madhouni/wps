/**
 */
package wps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wps.WpsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface WpsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.ubo.mde.massi/wps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WpsPackage eINSTANCE = wps.impl.WpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link wps.impl.ServeurWpsImpl <em>Serveur Wps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.ServeurWpsImpl
	 * @see wps.impl.WpsPackageImpl#getServeurWps()
	 * @generated
	 */
	int SERVEUR_WPS = 0;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_WPS__LIEN = 0;

	/**
	 * The number of structural features of the '<em>Serveur Wps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_WPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Serveur Wps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_WPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wps.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.ElementNommeImpl
	 * @see wps.impl.WpsPackageImpl#getElementNomme()
	 * @generated
	 */
	int ELEMENT_NOMME = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME__NOM = 0;

	/**
	 * The number of structural features of the '<em>Element Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wps.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.ProcessImpl
	 * @see wps.impl.WpsPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Sorties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SORTIES = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SERVEUR = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ENTREES = ELEMENT_NOMME_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.DescriptionEntreeImpl <em>Description Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.DescriptionEntreeImpl
	 * @see wps.impl.WpsPackageImpl#getDescriptionEntree()
	 * @generated
	 */
	int DESCRIPTION_ENTREE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTREE__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The number of structural features of the '<em>Description Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTREE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Description Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTREE_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.LiteralImpl
	 * @see wps.impl.WpsPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NOM = DESCRIPTION_ENTREE__NOM;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = DESCRIPTION_ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = DESCRIPTION_ENTREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.GeometrieImpl <em>Geometrie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.GeometrieImpl
	 * @see wps.impl.WpsPackageImpl#getGeometrie()
	 * @generated
	 */
	int GEOMETRIE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIE__NOM = DESCRIPTION_ENTREE__NOM;

	/**
	 * The number of structural features of the '<em>Geometrie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIE_FEATURE_COUNT = DESCRIPTION_ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geometrie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIE_OPERATION_COUNT = DESCRIPTION_ENTREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.RasterImpl <em>Raster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.RasterImpl
	 * @see wps.impl.WpsPackageImpl#getRaster()
	 * @generated
	 */
	int RASTER = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER__NOM = DESCRIPTION_ENTREE__NOM;

	/**
	 * The number of structural features of the '<em>Raster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_FEATURE_COUNT = DESCRIPTION_ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Raster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_OPERATION_COUNT = DESCRIPTION_ENTREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.SortieImpl
	 * @see wps.impl.WpsPackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.DescriptionEntierImpl <em>Description Entier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.DescriptionEntierImpl
	 * @see wps.impl.WpsPackageImpl#getDescriptionEntier()
	 * @generated
	 */
	int DESCRIPTION_ENTIER = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTIER__NOM = LITERAL__NOM;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTIER__MINIMUM = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTIER__MAXIMUM = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTIER__PAS = LITERAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Par Defaut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTIER__PAR_DEFAUT = LITERAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Description Entier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTIER_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Description Entier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTIER_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.ConfigurationWpsImpl <em>Configuration Wps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.ConfigurationWpsImpl
	 * @see wps.impl.WpsPackageImpl#getConfigurationWps()
	 * @generated
	 */
	int CONFIGURATION_WPS = 9;

	/**
	 * The feature id for the '<em><b>Appel Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_WPS__APPEL_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_WPS__PROCESS = 1;

	/**
	 * The number of structural features of the '<em>Configuration Wps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_WPS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration Wps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_WPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wps.impl.AppelProcessImpl <em>Appel Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.AppelProcessImpl
	 * @see wps.impl.WpsPackageImpl#getAppelProcess()
	 * @generated
	 */
	int APPEL_PROCESS = 10;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_PROCESS__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_PROCESS__PROCESS = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_PROCESS__ENTREES = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Appel Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_PROCESS_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Appel Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_PROCESS_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.EntreeImpl
	 * @see wps.impl.WpsPackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 12;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Saisie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__SAISIE = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.EntierImpl <em>Entier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.EntierImpl
	 * @see wps.impl.WpsPackageImpl#getEntier()
	 * @generated
	 */
	int ENTIER = 11;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIER__NOM = ENTREE__NOM;

	/**
	 * The feature id for the '<em><b>Saisie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIER__SAISIE = ENTREE__SAISIE;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIER__VALEUR = ENTREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIER__DESCRIPTION = ENTREE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIER_FEATURE_COUNT = ENTREE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIER_OPERATION_COUNT = ENTREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.impl.ReferenceImpl
	 * @see wps.impl.WpsPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NOM = ENTREE__NOM;

	/**
	 * The feature id for the '<em><b>Saisie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SAISIE = ENTREE__SAISIE;

	/**
	 * The feature id for the '<em><b>Lien Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LIEN_REFERENCE = ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = ENTREE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = ENTREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wps.TypeSaisie <em>Type Saisie</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wps.TypeSaisie
	 * @see wps.impl.WpsPackageImpl#getTypeSaisie()
	 * @generated
	 */
	int TYPE_SAISIE = 14;


	/**
	 * Returns the meta object for class '{@link wps.ServeurWps <em>Serveur Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Wps</em>'.
	 * @see wps.ServeurWps
	 * @generated
	 */
	EClass getServeurWps();

	/**
	 * Returns the meta object for the attribute '{@link wps.ServeurWps#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien</em>'.
	 * @see wps.ServeurWps#getLien()
	 * @see #getServeurWps()
	 * @generated
	 */
	EAttribute getServeurWps_Lien();

	/**
	 * Returns the meta object for class '{@link wps.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see wps.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link wps.Process#getSorties <em>Sorties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorties</em>'.
	 * @see wps.Process#getSorties()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Sorties();

	/**
	 * Returns the meta object for the reference '{@link wps.Process#getServeur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serveur</em>'.
	 * @see wps.Process#getServeur()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Serveur();

	/**
	 * Returns the meta object for the attribute '{@link wps.Process#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see wps.Process#getDescription()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link wps.Process#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entrees</em>'.
	 * @see wps.Process#getEntrees()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Entrees();

	/**
	 * Returns the meta object for class '{@link wps.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see wps.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link wps.DescriptionEntree <em>Description Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Entree</em>'.
	 * @see wps.DescriptionEntree
	 * @generated
	 */
	EClass getDescriptionEntree();

	/**
	 * Returns the meta object for class '{@link wps.Geometrie <em>Geometrie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometrie</em>'.
	 * @see wps.Geometrie
	 * @generated
	 */
	EClass getGeometrie();

	/**
	 * Returns the meta object for class '{@link wps.Raster <em>Raster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster</em>'.
	 * @see wps.Raster
	 * @generated
	 */
	EClass getRaster();

	/**
	 * Returns the meta object for class '{@link wps.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie</em>'.
	 * @see wps.Sortie
	 * @generated
	 */
	EClass getSortie();

	/**
	 * Returns the meta object for class '{@link wps.DescriptionEntier <em>Description Entier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Entier</em>'.
	 * @see wps.DescriptionEntier
	 * @generated
	 */
	EClass getDescriptionEntier();

	/**
	 * Returns the meta object for the attribute '{@link wps.DescriptionEntier#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see wps.DescriptionEntier#getMinimum()
	 * @see #getDescriptionEntier()
	 * @generated
	 */
	EAttribute getDescriptionEntier_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link wps.DescriptionEntier#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see wps.DescriptionEntier#getMaximum()
	 * @see #getDescriptionEntier()
	 * @generated
	 */
	EAttribute getDescriptionEntier_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link wps.DescriptionEntier#getPas <em>Pas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pas</em>'.
	 * @see wps.DescriptionEntier#getPas()
	 * @see #getDescriptionEntier()
	 * @generated
	 */
	EAttribute getDescriptionEntier_Pas();

	/**
	 * Returns the meta object for the attribute '{@link wps.DescriptionEntier#getParDefaut <em>Par Defaut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Par Defaut</em>'.
	 * @see wps.DescriptionEntier#getParDefaut()
	 * @see #getDescriptionEntier()
	 * @generated
	 */
	EAttribute getDescriptionEntier_ParDefaut();

	/**
	 * Returns the meta object for class '{@link wps.ElementNomme <em>Element Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Nomme</em>'.
	 * @see wps.ElementNomme
	 * @generated
	 */
	EClass getElementNomme();

	/**
	 * Returns the meta object for the attribute '{@link wps.ElementNomme#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see wps.ElementNomme#getNom()
	 * @see #getElementNomme()
	 * @generated
	 */
	EAttribute getElementNomme_Nom();

	/**
	 * Returns the meta object for class '{@link wps.ConfigurationWps <em>Configuration Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Wps</em>'.
	 * @see wps.ConfigurationWps
	 * @generated
	 */
	EClass getConfigurationWps();

	/**
	 * Returns the meta object for the containment reference list '{@link wps.ConfigurationWps#getAppelProcess <em>Appel Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appel Process</em>'.
	 * @see wps.ConfigurationWps#getAppelProcess()
	 * @see #getConfigurationWps()
	 * @generated
	 */
	EReference getConfigurationWps_AppelProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link wps.ConfigurationWps#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see wps.ConfigurationWps#getProcess()
	 * @see #getConfigurationWps()
	 * @generated
	 */
	EReference getConfigurationWps_Process();

	/**
	 * Returns the meta object for class '{@link wps.AppelProcess <em>Appel Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appel Process</em>'.
	 * @see wps.AppelProcess
	 * @generated
	 */
	EClass getAppelProcess();

	/**
	 * Returns the meta object for the reference '{@link wps.AppelProcess#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see wps.AppelProcess#getProcess()
	 * @see #getAppelProcess()
	 * @generated
	 */
	EReference getAppelProcess_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link wps.AppelProcess#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entrees</em>'.
	 * @see wps.AppelProcess#getEntrees()
	 * @see #getAppelProcess()
	 * @generated
	 */
	EReference getAppelProcess_Entrees();

	/**
	 * Returns the meta object for class '{@link wps.Entier <em>Entier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entier</em>'.
	 * @see wps.Entier
	 * @generated
	 */
	EClass getEntier();

	/**
	 * Returns the meta object for the attribute '{@link wps.Entier#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see wps.Entier#getValeur()
	 * @see #getEntier()
	 * @generated
	 */
	EAttribute getEntier_Valeur();

	/**
	 * Returns the meta object for the reference '{@link wps.Entier#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see wps.Entier#getDescription()
	 * @see #getEntier()
	 * @generated
	 */
	EReference getEntier_Description();

	/**
	 * Returns the meta object for class '{@link wps.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see wps.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for the attribute '{@link wps.Entree#getSaisie <em>Saisie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saisie</em>'.
	 * @see wps.Entree#getSaisie()
	 * @see #getEntree()
	 * @generated
	 */
	EAttribute getEntree_Saisie();

	/**
	 * Returns the meta object for class '{@link wps.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see wps.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link wps.Reference#getLienReference <em>Lien Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien Reference</em>'.
	 * @see wps.Reference#getLienReference()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_LienReference();

	/**
	 * Returns the meta object for enum '{@link wps.TypeSaisie <em>Type Saisie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Saisie</em>'.
	 * @see wps.TypeSaisie
	 * @generated
	 */
	EEnum getTypeSaisie();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WpsFactory getWpsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wps.impl.ServeurWpsImpl <em>Serveur Wps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.ServeurWpsImpl
		 * @see wps.impl.WpsPackageImpl#getServeurWps()
		 * @generated
		 */
		EClass SERVEUR_WPS = eINSTANCE.getServeurWps();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVEUR_WPS__LIEN = eINSTANCE.getServeurWps_Lien();

		/**
		 * The meta object literal for the '{@link wps.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.ProcessImpl
		 * @see wps.impl.WpsPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Sorties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SORTIES = eINSTANCE.getProcess_Sorties();

		/**
		 * The meta object literal for the '<em><b>Serveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SERVEUR = eINSTANCE.getProcess_Serveur();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__DESCRIPTION = eINSTANCE.getProcess_Description();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ENTREES = eINSTANCE.getProcess_Entrees();

		/**
		 * The meta object literal for the '{@link wps.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.LiteralImpl
		 * @see wps.impl.WpsPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link wps.impl.DescriptionEntreeImpl <em>Description Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.DescriptionEntreeImpl
		 * @see wps.impl.WpsPackageImpl#getDescriptionEntree()
		 * @generated
		 */
		EClass DESCRIPTION_ENTREE = eINSTANCE.getDescriptionEntree();

		/**
		 * The meta object literal for the '{@link wps.impl.GeometrieImpl <em>Geometrie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.GeometrieImpl
		 * @see wps.impl.WpsPackageImpl#getGeometrie()
		 * @generated
		 */
		EClass GEOMETRIE = eINSTANCE.getGeometrie();

		/**
		 * The meta object literal for the '{@link wps.impl.RasterImpl <em>Raster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.RasterImpl
		 * @see wps.impl.WpsPackageImpl#getRaster()
		 * @generated
		 */
		EClass RASTER = eINSTANCE.getRaster();

		/**
		 * The meta object literal for the '{@link wps.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.SortieImpl
		 * @see wps.impl.WpsPackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

		/**
		 * The meta object literal for the '{@link wps.impl.DescriptionEntierImpl <em>Description Entier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.DescriptionEntierImpl
		 * @see wps.impl.WpsPackageImpl#getDescriptionEntier()
		 * @generated
		 */
		EClass DESCRIPTION_ENTIER = eINSTANCE.getDescriptionEntier();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ENTIER__MINIMUM = eINSTANCE.getDescriptionEntier_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ENTIER__MAXIMUM = eINSTANCE.getDescriptionEntier_Maximum();

		/**
		 * The meta object literal for the '<em><b>Pas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ENTIER__PAS = eINSTANCE.getDescriptionEntier_Pas();

		/**
		 * The meta object literal for the '<em><b>Par Defaut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ENTIER__PAR_DEFAUT = eINSTANCE.getDescriptionEntier_ParDefaut();

		/**
		 * The meta object literal for the '{@link wps.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.ElementNommeImpl
		 * @see wps.impl.WpsPackageImpl#getElementNomme()
		 * @generated
		 */
		EClass ELEMENT_NOMME = eINSTANCE.getElementNomme();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_NOMME__NOM = eINSTANCE.getElementNomme_Nom();

		/**
		 * The meta object literal for the '{@link wps.impl.ConfigurationWpsImpl <em>Configuration Wps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.ConfigurationWpsImpl
		 * @see wps.impl.WpsPackageImpl#getConfigurationWps()
		 * @generated
		 */
		EClass CONFIGURATION_WPS = eINSTANCE.getConfigurationWps();

		/**
		 * The meta object literal for the '<em><b>Appel Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_WPS__APPEL_PROCESS = eINSTANCE.getConfigurationWps_AppelProcess();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_WPS__PROCESS = eINSTANCE.getConfigurationWps_Process();

		/**
		 * The meta object literal for the '{@link wps.impl.AppelProcessImpl <em>Appel Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.AppelProcessImpl
		 * @see wps.impl.WpsPackageImpl#getAppelProcess()
		 * @generated
		 */
		EClass APPEL_PROCESS = eINSTANCE.getAppelProcess();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEL_PROCESS__PROCESS = eINSTANCE.getAppelProcess_Process();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEL_PROCESS__ENTREES = eINSTANCE.getAppelProcess_Entrees();

		/**
		 * The meta object literal for the '{@link wps.impl.EntierImpl <em>Entier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.EntierImpl
		 * @see wps.impl.WpsPackageImpl#getEntier()
		 * @generated
		 */
		EClass ENTIER = eINSTANCE.getEntier();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIER__VALEUR = eINSTANCE.getEntier_Valeur();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIER__DESCRIPTION = eINSTANCE.getEntier_Description();

		/**
		 * The meta object literal for the '{@link wps.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.EntreeImpl
		 * @see wps.impl.WpsPackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '<em><b>Saisie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE__SAISIE = eINSTANCE.getEntree_Saisie();

		/**
		 * The meta object literal for the '{@link wps.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.impl.ReferenceImpl
		 * @see wps.impl.WpsPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Lien Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__LIEN_REFERENCE = eINSTANCE.getReference_LienReference();

		/**
		 * The meta object literal for the '{@link wps.TypeSaisie <em>Type Saisie</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wps.TypeSaisie
		 * @see wps.impl.WpsPackageImpl#getTypeSaisie()
		 * @generated
		 */
		EEnum TYPE_SAISIE = eINSTANCE.getTypeSaisie();

	}

} //WpsPackage
