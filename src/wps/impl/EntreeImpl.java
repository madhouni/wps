/**
 */
package wps.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wps.Entree;
import wps.TypeSaisie;
import wps.WpsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wps.impl.EntreeImpl#getSaisie <em>Saisie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntreeImpl extends ElementNommeImpl implements Entree {
	/**
	 * The default value of the '{@link #getSaisie() <em>Saisie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaisie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeSaisie SAISIE_EDEFAULT = TypeSaisie.PAR_DEFAUT;

	/**
	 * The cached value of the '{@link #getSaisie() <em>Saisie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaisie()
	 * @generated
	 * @ordered
	 */
	protected TypeSaisie saisie = SAISIE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WpsPackage.Literals.ENTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisie getSaisie() {
		return saisie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaisie(TypeSaisie newSaisie) {
		TypeSaisie oldSaisie = saisie;
		saisie = newSaisie == null ? SAISIE_EDEFAULT : newSaisie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WpsPackage.ENTREE__SAISIE, oldSaisie, saisie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WpsPackage.ENTREE__SAISIE:
				return getSaisie();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WpsPackage.ENTREE__SAISIE:
				setSaisie((TypeSaisie)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WpsPackage.ENTREE__SAISIE:
				setSaisie(SAISIE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WpsPackage.ENTREE__SAISIE:
				return saisie != SAISIE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (saisie: ");
		result.append(saisie);
		result.append(')');
		return result.toString();
	}

} //EntreeImpl
