/**
 */
package wps.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wps.DescriptionEntier;
import wps.WpsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Entier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wps.impl.DescriptionEntierImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link wps.impl.DescriptionEntierImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link wps.impl.DescriptionEntierImpl#getPas <em>Pas</em>}</li>
 *   <li>{@link wps.impl.DescriptionEntierImpl#getParDefaut <em>Par Defaut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionEntierImpl extends LiteralImpl implements DescriptionEntier {
	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected int minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected int maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPas() <em>Pas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPas()
	 * @generated
	 * @ordered
	 */
	protected static final int PAS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPas() <em>Pas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPas()
	 * @generated
	 * @ordered
	 */
	protected int pas = PAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getParDefaut() <em>Par Defaut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParDefaut()
	 * @generated
	 * @ordered
	 */
	protected static final int PAR_DEFAUT_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getParDefaut() <em>Par Defaut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParDefaut()
	 * @generated
	 * @ordered
	 */
	protected int parDefaut = PAR_DEFAUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionEntierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WpsPackage.Literals.DESCRIPTION_ENTIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(int newMinimum) {
		int oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WpsPackage.DESCRIPTION_ENTIER__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(int newMaximum) {
		int oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WpsPackage.DESCRIPTION_ENTIER__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPas() {
		return pas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPas(int newPas) {
		int oldPas = pas;
		pas = newPas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WpsPackage.DESCRIPTION_ENTIER__PAS, oldPas, pas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParDefaut() {
		return parDefaut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParDefaut(int newParDefaut) {
		int oldParDefaut = parDefaut;
		parDefaut = newParDefaut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WpsPackage.DESCRIPTION_ENTIER__PAR_DEFAUT, oldParDefaut, parDefaut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WpsPackage.DESCRIPTION_ENTIER__MINIMUM:
				return getMinimum();
			case WpsPackage.DESCRIPTION_ENTIER__MAXIMUM:
				return getMaximum();
			case WpsPackage.DESCRIPTION_ENTIER__PAS:
				return getPas();
			case WpsPackage.DESCRIPTION_ENTIER__PAR_DEFAUT:
				return getParDefaut();
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
			case WpsPackage.DESCRIPTION_ENTIER__MINIMUM:
				setMinimum((Integer)newValue);
				return;
			case WpsPackage.DESCRIPTION_ENTIER__MAXIMUM:
				setMaximum((Integer)newValue);
				return;
			case WpsPackage.DESCRIPTION_ENTIER__PAS:
				setPas((Integer)newValue);
				return;
			case WpsPackage.DESCRIPTION_ENTIER__PAR_DEFAUT:
				setParDefaut((Integer)newValue);
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
			case WpsPackage.DESCRIPTION_ENTIER__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case WpsPackage.DESCRIPTION_ENTIER__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case WpsPackage.DESCRIPTION_ENTIER__PAS:
				setPas(PAS_EDEFAULT);
				return;
			case WpsPackage.DESCRIPTION_ENTIER__PAR_DEFAUT:
				setParDefaut(PAR_DEFAUT_EDEFAULT);
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
			case WpsPackage.DESCRIPTION_ENTIER__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case WpsPackage.DESCRIPTION_ENTIER__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case WpsPackage.DESCRIPTION_ENTIER__PAS:
				return pas != PAS_EDEFAULT;
			case WpsPackage.DESCRIPTION_ENTIER__PAR_DEFAUT:
				return parDefaut != PAR_DEFAUT_EDEFAULT;
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
		result.append(" (minimum: ");
		result.append(minimum);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", pas: ");
		result.append(pas);
		result.append(", parDefaut: ");
		result.append(parDefaut);
		result.append(')');
		return result.toString();
	}

} //DescriptionEntierImpl
