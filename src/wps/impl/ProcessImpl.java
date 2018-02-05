/**
 */
package wps.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wps.DescriptionEntree;
import wps.ServeurWps;
import wps.Sortie;
import wps.WpsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wps.impl.ProcessImpl#getSorties <em>Sorties</em>}</li>
 *   <li>{@link wps.impl.ProcessImpl#getServeur <em>Serveur</em>}</li>
 *   <li>{@link wps.impl.ProcessImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link wps.impl.ProcessImpl#getEntrees <em>Entrees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends ElementNommeImpl implements wps.Process {
	/**
	 * The cached value of the '{@link #getSorties() <em>Sorties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorties()
	 * @generated
	 * @ordered
	 */
	protected EList<Sortie> sorties;

	/**
	 * The cached value of the '{@link #getServeur() <em>Serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur()
	 * @generated
	 * @ordered
	 */
	protected ServeurWps serveur;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntrees() <em>Entrees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrees()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionEntree> entrees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WpsPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sortie> getSorties() {
		if (sorties == null) {
			sorties = new EObjectContainmentEList<Sortie>(Sortie.class, this, WpsPackage.PROCESS__SORTIES);
		}
		return sorties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurWps getServeur() {
		if (serveur != null && serveur.eIsProxy()) {
			InternalEObject oldServeur = (InternalEObject)serveur;
			serveur = (ServeurWps)eResolveProxy(oldServeur);
			if (serveur != oldServeur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WpsPackage.PROCESS__SERVEUR, oldServeur, serveur));
			}
		}
		return serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurWps basicGetServeur() {
		return serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServeur(ServeurWps newServeur) {
		ServeurWps oldServeur = serveur;
		serveur = newServeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WpsPackage.PROCESS__SERVEUR, oldServeur, serveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WpsPackage.PROCESS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionEntree> getEntrees() {
		if (entrees == null) {
			entrees = new EObjectContainmentEList<DescriptionEntree>(DescriptionEntree.class, this, WpsPackage.PROCESS__ENTREES);
		}
		return entrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WpsPackage.PROCESS__SORTIES:
				return ((InternalEList<?>)getSorties()).basicRemove(otherEnd, msgs);
			case WpsPackage.PROCESS__ENTREES:
				return ((InternalEList<?>)getEntrees()).basicRemove(otherEnd, msgs);
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
			case WpsPackage.PROCESS__SORTIES:
				return getSorties();
			case WpsPackage.PROCESS__SERVEUR:
				if (resolve) return getServeur();
				return basicGetServeur();
			case WpsPackage.PROCESS__DESCRIPTION:
				return getDescription();
			case WpsPackage.PROCESS__ENTREES:
				return getEntrees();
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
			case WpsPackage.PROCESS__SORTIES:
				getSorties().clear();
				getSorties().addAll((Collection<? extends Sortie>)newValue);
				return;
			case WpsPackage.PROCESS__SERVEUR:
				setServeur((ServeurWps)newValue);
				return;
			case WpsPackage.PROCESS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WpsPackage.PROCESS__ENTREES:
				getEntrees().clear();
				getEntrees().addAll((Collection<? extends DescriptionEntree>)newValue);
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
			case WpsPackage.PROCESS__SORTIES:
				getSorties().clear();
				return;
			case WpsPackage.PROCESS__SERVEUR:
				setServeur((ServeurWps)null);
				return;
			case WpsPackage.PROCESS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WpsPackage.PROCESS__ENTREES:
				getEntrees().clear();
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
			case WpsPackage.PROCESS__SORTIES:
				return sorties != null && !sorties.isEmpty();
			case WpsPackage.PROCESS__SERVEUR:
				return serveur != null;
			case WpsPackage.PROCESS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WpsPackage.PROCESS__ENTREES:
				return entrees != null && !entrees.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
