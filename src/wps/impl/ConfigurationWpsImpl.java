/**
 */
package wps.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wps.ConfigurationWps;
import wps.ServeurWps;
import wps.WpsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Wps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wps.impl.ConfigurationWpsImpl#getAppelProcess <em>Appel Process</em>}</li>
 *   <li>{@link wps.impl.ConfigurationWpsImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationWpsImpl extends MinimalEObjectImpl.Container implements ConfigurationWps {
	/**
	 * The cached value of the '{@link #getAppelProcess() <em>Appel Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppelProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<wps.Process> appelProcess;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<ServeurWps> process;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationWpsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WpsPackage.Literals.CONFIGURATION_WPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<wps.Process> getAppelProcess() {
		if (appelProcess == null) {
			appelProcess = new EObjectContainmentEList<wps.Process>(wps.Process.class, this, WpsPackage.CONFIGURATION_WPS__APPEL_PROCESS);
		}
		return appelProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServeurWps> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<ServeurWps>(ServeurWps.class, this, WpsPackage.CONFIGURATION_WPS__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WpsPackage.CONFIGURATION_WPS__APPEL_PROCESS:
				return ((InternalEList<?>)getAppelProcess()).basicRemove(otherEnd, msgs);
			case WpsPackage.CONFIGURATION_WPS__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WpsPackage.CONFIGURATION_WPS__APPEL_PROCESS:
				return getAppelProcess();
			case WpsPackage.CONFIGURATION_WPS__PROCESS:
				return getProcess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WpsPackage.CONFIGURATION_WPS__APPEL_PROCESS:
				getAppelProcess().clear();
				getAppelProcess().addAll((Collection<? extends wps.Process>)newValue);
				return;
			case WpsPackage.CONFIGURATION_WPS__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ServeurWps>)newValue);
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
			case WpsPackage.CONFIGURATION_WPS__APPEL_PROCESS:
				getAppelProcess().clear();
				return;
			case WpsPackage.CONFIGURATION_WPS__PROCESS:
				getProcess().clear();
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
			case WpsPackage.CONFIGURATION_WPS__APPEL_PROCESS:
				return appelProcess != null && !appelProcess.isEmpty();
			case WpsPackage.CONFIGURATION_WPS__PROCESS:
				return process != null && !process.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationWpsImpl
