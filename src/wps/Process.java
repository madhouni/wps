/**
 */
package wps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wps.Process#getSorties <em>Sorties</em>}</li>
 *   <li>{@link wps.Process#getServeur <em>Serveur</em>}</li>
 *   <li>{@link wps.Process#getDescription <em>Description</em>}</li>
 *   <li>{@link wps.Process#getEntrees <em>Entrees</em>}</li>
 * </ul>
 *
 * @see wps.WpsPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Sorties</b></em>' containment reference list.
	 * The list contents are of type {@link wps.Sortie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorties</em>' containment reference list.
	 * @see wps.WpsPackage#getProcess_Sorties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sortie> getSorties();

	/**
	 * Returns the value of the '<em><b>Serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur</em>' reference.
	 * @see #setServeur(ServeurWps)
	 * @see wps.WpsPackage#getProcess_Serveur()
	 * @model required="true"
	 * @generated
	 */
	ServeurWps getServeur();

	/**
	 * Sets the value of the '{@link wps.Process#getServeur <em>Serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveur</em>' reference.
	 * @see #getServeur()
	 * @generated
	 */
	void setServeur(ServeurWps value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see wps.WpsPackage#getProcess_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wps.Process#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' containment reference list.
	 * The list contents are of type {@link wps.DescriptionEntree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entrees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' containment reference list.
	 * @see wps.WpsPackage#getProcess_Entrees()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DescriptionEntree> getEntrees();

} // Process
