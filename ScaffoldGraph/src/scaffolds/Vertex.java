/**
 */
package scaffolds;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scaffolds.Vertex#getEdges <em>Edges</em>}</li>
 *   <li>{@link scaffolds.Vertex#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see scaffolds.ScaffoldsPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link scaffolds.Edge}.
	 * It is bidirectional and its opposite is '{@link scaffolds.Edge#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see scaffolds.ScaffoldsPackage#getVertex_Edges()
	 * @see scaffolds.Edge#getVertices
	 * @model opposite="vertices"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' attribute.
	 * @see #setNum(int)
	 * @see scaffolds.ScaffoldsPackage#getVertex_Num()
	 * @model
	 * @generated
	 */
	int getNum();

	/**
	 * Sets the value of the '{@link scaffolds.Vertex#getNum <em>Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' attribute.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(int value);

} // Vertex
