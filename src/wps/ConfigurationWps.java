/**
 */
package wps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Wps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wps.ConfigurationWps#getAppelProcess <em>Appel Process</em>}</li>
 *   <li>{@link wps.ConfigurationWps#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see wps.WpsPackage#getConfigurationWps()
 * @model
 * @generated
 */
public interface ConfigurationWps extends EObject {
	/**
	 * Returns the value of the '<em><b>Appel Process</b></em>' containment reference list.
	 * The list contents are of type {@link wps.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appel Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appel Process</em>' containment reference list.
	 * @see wps.WpsPackage#getConfigurationWps_AppelProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<wps.Process> getAppelProcess();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link wps.ServeurWps}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see wps.WpsPackage#getConfigurationWps_Process()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServeurWps> getProcess();

} // ConfigurationWps
