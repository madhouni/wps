/**
 */
package wps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wps.WpsPackage
 * @generated
 */
public interface WpsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WpsFactory eINSTANCE = wps.impl.WpsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Serveur Wps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur Wps</em>'.
	 * @generated
	 */
	ServeurWps createServeurWps();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Description Entree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Entree</em>'.
	 * @generated
	 */
	DescriptionEntree createDescriptionEntree();

	/**
	 * Returns a new object of class '<em>Geometrie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometrie</em>'.
	 * @generated
	 */
	Geometrie createGeometrie();

	/**
	 * Returns a new object of class '<em>Raster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster</em>'.
	 * @generated
	 */
	Raster createRaster();

	/**
	 * Returns a new object of class '<em>Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sortie</em>'.
	 * @generated
	 */
	Sortie createSortie();

	/**
	 * Returns a new object of class '<em>Description Entier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Entier</em>'.
	 * @generated
	 */
	DescriptionEntier createDescriptionEntier();

	/**
	 * Returns a new object of class '<em>Element Nomme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Nomme</em>'.
	 * @generated
	 */
	ElementNomme createElementNomme();

	/**
	 * Returns a new object of class '<em>Configuration Wps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Wps</em>'.
	 * @generated
	 */
	ConfigurationWps createConfigurationWps();

	/**
	 * Returns a new object of class '<em>Appel Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appel Process</em>'.
	 * @generated
	 */
	AppelProcess createAppelProcess();

	/**
	 * Returns a new object of class '<em>Entier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entier</em>'.
	 * @generated
	 */
	Entier createEntier();

	/**
	 * Returns a new object of class '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entree</em>'.
	 * @generated
	 */
	Entree createEntree();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WpsPackage getWpsPackage();

} //WpsFactory
