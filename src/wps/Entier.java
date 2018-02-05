/**
 */
package wps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wps.Entier#getValeur <em>Valeur</em>}</li>
 *   <li>{@link wps.Entier#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see wps.WpsPackage#getEntier()
 * @model
 * @generated
 */
public interface Entier extends Entree {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(int)
	 * @see wps.WpsPackage#getEntier_Valeur()
	 * @model required="true"
	 * @generated
	 */
	int getValeur();

	/**
	 * Sets the value of the '{@link wps.Entier#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(DescriptionEntier)
	 * @see wps.WpsPackage#getEntier_Description()
	 * @model required="true"
	 * @generated
	 */
	DescriptionEntier getDescription();

	/**
	 * Sets the value of the '{@link wps.Entier#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionEntier value);

} // Entier
