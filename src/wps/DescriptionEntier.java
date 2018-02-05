/**
 */
package wps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Entier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wps.DescriptionEntier#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link wps.DescriptionEntier#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link wps.DescriptionEntier#getPas <em>Pas</em>}</li>
 *   <li>{@link wps.DescriptionEntier#getParDefaut <em>Par Defaut</em>}</li>
 * </ul>
 *
 * @see wps.WpsPackage#getDescriptionEntier()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minInfMax estUnPas'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot minInfMax='minimum < maximum' estUnPas='pas = 1'"
 * @generated
 */
public interface DescriptionEntier extends Literal {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(int)
	 * @see wps.WpsPackage#getDescriptionEntier_Minimum()
	 * @model required="true"
	 * @generated
	 */
	int getMinimum();

	/**
	 * Sets the value of the '{@link wps.DescriptionEntier#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(int)
	 * @see wps.WpsPackage#getDescriptionEntier_Maximum()
	 * @model default="100" required="true"
	 * @generated
	 */
	int getMaximum();

	/**
	 * Sets the value of the '{@link wps.DescriptionEntier#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(int value);

	/**
	 * Returns the value of the '<em><b>Pas</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pas</em>' attribute.
	 * @see #setPas(int)
	 * @see wps.WpsPackage#getDescriptionEntier_Pas()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getPas();

	/**
	 * Sets the value of the '{@link wps.DescriptionEntier#getPas <em>Pas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pas</em>' attribute.
	 * @see #getPas()
	 * @generated
	 */
	void setPas(int value);

	/**
	 * Returns the value of the '<em><b>Par Defaut</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Par Defaut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par Defaut</em>' attribute.
	 * @see #setParDefaut(int)
	 * @see wps.WpsPackage#getDescriptionEntier_ParDefaut()
	 * @model default="50" required="true"
	 * @generated
	 */
	int getParDefaut();

	/**
	 * Sets the value of the '{@link wps.DescriptionEntier#getParDefaut <em>Par Defaut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par Defaut</em>' attribute.
	 * @see #getParDefaut()
	 * @generated
	 */
	void setParDefaut(int value);

} // DescriptionEntier
