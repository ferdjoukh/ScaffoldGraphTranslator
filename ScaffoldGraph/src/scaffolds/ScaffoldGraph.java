/**
 */
package scaffolds;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaffold Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scaffolds.ScaffoldGraph#getContigs <em>Contigs</em>}</li>
 *   <li>{@link scaffolds.ScaffoldGraph#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see scaffolds.ScaffoldsPackage#getScaffoldGraph()
 * @model
 * @generated
 */
public interface ScaffoldGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Contigs</b></em>' containment reference list.
	 * The list contents are of type {@link scaffolds.Contig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contigs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contigs</em>' containment reference list.
	 * @see scaffolds.ScaffoldsPackage#getScaffoldGraph_Contigs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contig> getContigs();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link scaffolds.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see scaffolds.ScaffoldsPackage#getScaffoldGraph_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // ScaffoldGraph
