/**
 */
package wps.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wps.Reference;
import wps.WpsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wps.impl.ReferenceImpl#getLienReference <em>Lien Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends EntreeImpl implements Reference {
	/**
	 * The default value of the '{@link #getLienReference() <em>Lien Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LIEN_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLienReference() <em>Lien Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienReference()
	 * @generated
	 * @ordered
	 */
	protected String lienReference = LIEN_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WpsPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLienReference() {
		return lienReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienReference(String newLienReference) {
		String oldLienReference = lienReference;
		lienReference = newLienReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WpsPackage.REFERENCE__LIEN_REFERENCE, oldLienReference, lienReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WpsPackage.REFERENCE__LIEN_REFERENCE:
				return getLienReference();
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
			case WpsPackage.REFERENCE__LIEN_REFERENCE:
				setLienReference((String)newValue);
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
			case WpsPackage.REFERENCE__LIEN_REFERENCE:
				setLienReference(LIEN_REFERENCE_EDEFAULT);
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
			case WpsPackage.REFERENCE__LIEN_REFERENCE:
				return LIEN_REFERENCE_EDEFAULT == null ? lienReference != null : !LIEN_REFERENCE_EDEFAULT.equals(lienReference);
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
		result.append(" (lienReference: ");
		result.append(lienReference);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl
