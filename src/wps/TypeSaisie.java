/**
 */
package wps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Saisie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see wps.WpsPackage#getTypeSaisie()
 * @model
 * @generated
 */
public enum TypeSaisie implements Enumerator {
	/**
	 * The '<em><b>Par Defaut</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAR_DEFAUT_VALUE
	 * @generated
	 * @ordered
	 */
	PAR_DEFAUT(0, "parDefaut", "parDefaut"),

	/**
	 * The '<em><b>Fixe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXE_VALUE
	 * @generated
	 * @ordered
	 */
	FIXE(1, "fixe", "fixe"),

	/**
	 * The '<em><b>Libre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRE_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRE(0, "libre", "libre");

	/**
	 * The '<em><b>Par Defaut</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Par Defaut</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAR_DEFAUT
	 * @model name="parDefaut"
	 * @generated
	 * @ordered
	 */
	public static final int PAR_DEFAUT_VALUE = 0;

	/**
	 * The '<em><b>Fixe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fixe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXE
	 * @model name="fixe"
	 * @generated
	 * @ordered
	 */
	public static final int FIXE_VALUE = 1;

	/**
	 * The '<em><b>Libre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Libre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIBRE
	 * @model name="libre"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Type Saisie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeSaisie[] VALUES_ARRAY =
		new TypeSaisie[] {
			PAR_DEFAUT,
			FIXE,
			LIBRE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Saisie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeSaisie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Saisie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSaisie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeSaisie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Saisie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSaisie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeSaisie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Saisie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSaisie get(int value) {
		switch (value) {
			case PAR_DEFAUT_VALUE: return PAR_DEFAUT;
			case FIXE_VALUE: return FIXE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeSaisie(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeSaisie
