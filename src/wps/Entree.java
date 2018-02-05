/**
 */
package wps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wps.Entree#getSaisie <em>Saisie</em>}</li>
 * </ul>
 *
 * @see wps.WpsPackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Saisie</b></em>' attribute.
	 * The literals are from the enumeration {@link wps.TypeSaisie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saisie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saisie</em>' attribute.
	 * @see wps.TypeSaisie
	 * @see #setSaisie(TypeSaisie)
	 * @see wps.WpsPackage#getEntree_Saisie()
	 * @model required="true"
	 * @generated
	 */
	TypeSaisie getSaisie();

	/**
	 * Sets the value of the '{@link wps.Entree#getSaisie <em>Saisie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saisie</em>' attribute.
	 * @see wps.TypeSaisie
	 * @see #getSaisie()
	 * @generated
	 */
	void setSaisie(TypeSaisie value);

} // Entree
