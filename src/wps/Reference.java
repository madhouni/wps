/**
 */
package wps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wps.Reference#getLienReference <em>Lien Reference</em>}</li>
 * </ul>
 *
 * @see wps.WpsPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Entree {
	/**
	 * Returns the value of the '<em><b>Lien Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Reference</em>' attribute.
	 * @see #setLienReference(String)
	 * @see wps.WpsPackage#getReference_LienReference()
	 * @model required="true"
	 * @generated
	 */
	String getLienReference();

	/**
	 * Sets the value of the '{@link wps.Reference#getLienReference <em>Lien Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien Reference</em>' attribute.
	 * @see #getLienReference()
	 * @generated
	 */
	void setLienReference(String value);

} // Reference
