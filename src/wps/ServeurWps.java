/**
 */
package wps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur Wps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wps.ServeurWps#getLien <em>Lien</em>}</li>
 * </ul>
 *
 * @see wps.WpsPackage#getServeurWps()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot null='lien.startsWith(\'http://\')'"
 * @generated
 */
public interface ServeurWps extends EObject {
	/**
	 * Returns the value of the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' attribute.
	 * @see #setLien(String)
	 * @see wps.WpsPackage#getServeurWps_Lien()
	 * @model required="true"
	 * @generated
	 */
	String getLien();

	/**
	 * Sets the value of the '{@link wps.ServeurWps#getLien <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien</em>' attribute.
	 * @see #getLien()
	 * @generated
	 */
	void setLien(String value);

} // ServeurWps
