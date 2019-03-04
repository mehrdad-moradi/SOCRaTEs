/**
 * generated by Xtext 2.17.0.M1
 */
package lu.snt.socrates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.snt.socrates.value#getExp <em>Exp</em>}</li>
 *   <li>{@link lu.snt.socrates.value#getNumber <em>Number</em>}</li>
 *   <li>{@link lu.snt.socrates.value#getRef <em>Ref</em>}</li>
 *   <li>{@link lu.snt.socrates.value#getFloat <em>Float</em>}</li>
 * </ul>
 *
 * @see lu.snt.socrates.SocratesPackage#getvalue()
 * @model
 * @generated
 */
public interface value extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(expression)
   * @see lu.snt.socrates.SocratesPackage#getvalue_Exp()
   * @model containment="true"
   * @generated
   */
  expression getExp();

  /**
   * Sets the value of the '{@link lu.snt.socrates.value#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(expression value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see lu.snt.socrates.SocratesPackage#getvalue_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link lu.snt.socrates.value#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(ConstantId)
   * @see lu.snt.socrates.SocratesPackage#getvalue_Ref()
   * @model
   * @generated
   */
  ConstantId getRef();

  /**
   * Sets the value of the '{@link lu.snt.socrates.value#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ConstantId value);

  /**
   * Returns the value of the '<em><b>Float</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Float</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Float</em>' attribute.
   * @see #setFloat(String)
   * @see lu.snt.socrates.SocratesPackage#getvalue_Float()
   * @model
   * @generated
   */
  String getFloat();

  /**
   * Sets the value of the '{@link lu.snt.socrates.value#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float</em>' attribute.
   * @see #getFloat()
   * @generated
   */
  void setFloat(String value);

} // value