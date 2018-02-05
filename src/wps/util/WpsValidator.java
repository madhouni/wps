/**
 */
package wps.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

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
import wps.WpsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see wps.WpsPackage
 * @generated
 */
public class WpsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WpsValidator INSTANCE = new WpsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "wps";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WpsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WpsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WpsPackage.SERVEUR_WPS:
				return validateServeurWps((ServeurWps)value, diagnostics, context);
			case WpsPackage.PROCESS:
				return validateProcess((wps.Process)value, diagnostics, context);
			case WpsPackage.LITERAL:
				return validateLiteral((Literal)value, diagnostics, context);
			case WpsPackage.DESCRIPTION_ENTREE:
				return validateDescriptionEntree((DescriptionEntree)value, diagnostics, context);
			case WpsPackage.GEOMETRIE:
				return validateGeometrie((Geometrie)value, diagnostics, context);
			case WpsPackage.RASTER:
				return validateRaster((Raster)value, diagnostics, context);
			case WpsPackage.SORTIE:
				return validateSortie((Sortie)value, diagnostics, context);
			case WpsPackage.DESCRIPTION_ENTIER:
				return validateDescriptionEntier((DescriptionEntier)value, diagnostics, context);
			case WpsPackage.ELEMENT_NOMME:
				return validateElementNomme((ElementNomme)value, diagnostics, context);
			case WpsPackage.CONFIGURATION_WPS:
				return validateConfigurationWps((ConfigurationWps)value, diagnostics, context);
			case WpsPackage.APPEL_PROCESS:
				return validateAppelProcess((AppelProcess)value, diagnostics, context);
			case WpsPackage.ENTIER:
				return validateEntier((Entier)value, diagnostics, context);
			case WpsPackage.ENTREE:
				return validateEntree((Entree)value, diagnostics, context);
			case WpsPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case WpsPackage.TYPE_SAISIE:
				return validateTypeSaisie((TypeSaisie)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServeurWps(ServeurWps serveurWps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serveurWps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(wps.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(process, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionEntree(DescriptionEntree descriptionEntree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionEntree, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometrie(Geometrie geometrie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometrie, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaster(Raster raster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raster, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortie(Sortie sortie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortie, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionEntier(DescriptionEntier descriptionEntier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(descriptionEntier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(descriptionEntier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(descriptionEntier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(descriptionEntier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(descriptionEntier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(descriptionEntier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(descriptionEntier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(descriptionEntier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(descriptionEntier, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescriptionEntier_minInfMax(descriptionEntier, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescriptionEntier_estUnPas(descriptionEntier, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the minInfMax constraint of '<em>Description Entier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIPTION_ENTIER__MIN_INF_MAX__EEXPRESSION = "minimum < maximum";

	/**
	 * Validates the minInfMax constraint of '<em>Description Entier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionEntier_minInfMax(DescriptionEntier descriptionEntier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WpsPackage.Literals.DESCRIPTION_ENTIER,
				 descriptionEntier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minInfMax",
				 DESCRIPTION_ENTIER__MIN_INF_MAX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the estUnPas constraint of '<em>Description Entier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIPTION_ENTIER__EST_UN_PAS__EEXPRESSION = "pas = 1";

	/**
	 * Validates the estUnPas constraint of '<em>Description Entier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionEntier_estUnPas(DescriptionEntier descriptionEntier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WpsPackage.Literals.DESCRIPTION_ENTIER,
				 descriptionEntier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "estUnPas",
				 DESCRIPTION_ENTIER__EST_UN_PAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementNomme(ElementNomme elementNomme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementNomme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationWps(ConfigurationWps configurationWps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationWps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppelProcess(AppelProcess appelProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appelProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntier(Entier entier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntree(Entree entree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entree, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeSaisie(TypeSaisie typeSaisie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WpsValidator
