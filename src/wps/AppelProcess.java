/**
 */
package wps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appel Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wps.AppelProcess#getProcess <em>Process</em>}</li>
 *   <li>{@link wps.AppelProcess#getEntrees <em>Entrees</em>}</li>
 * </ul>
 *
 * @see wps.WpsPackage#getAppelProcess()
 * @model
 * @generated
 */
public interface AppelProcess extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(wps.Process)
	 * @see wps.WpsPackage#getAppelProcess_Process()
	 * @model required="true"
	 * @generated
	 */
	wps.Process getProcess();

	/**
	 * Sets the value of the '{@link wps.AppelProcess#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(wps.Process value);

	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' containment reference list.
	 * The list contents are of type {@link wps.Entree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entrees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' containment reference list.
	 * @see wps.WpsPackage#getAppelProcess_Entrees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entree> getEntrees();

} // AppelProcess
