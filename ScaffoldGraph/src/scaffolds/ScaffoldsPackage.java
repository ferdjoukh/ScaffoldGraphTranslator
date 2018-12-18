/**
 */
package scaffolds;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scaffolds.ScaffoldsFactory
 * @model kind="package"
 * @generated
 */
public interface ScaffoldsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scaffolds";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "scaffolds";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scaffolds";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScaffoldsPackage eINSTANCE = scaffolds.impl.ScaffoldsPackageImpl.init();

	/**
	 * The meta object id for the '{@link scaffolds.impl.ScaffoldGraphImpl <em>Scaffold Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scaffolds.impl.ScaffoldGraphImpl
	 * @see scaffolds.impl.ScaffoldsPackageImpl#getScaffoldGraph()
	 * @generated
	 */
	int SCAFFOLD_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Contigs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLD_GRAPH__CONTIGS = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLD_GRAPH__EDGES = 1;

	/**
	 * The number of structural features of the '<em>Scaffold Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLD_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scaffold Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLD_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scaffolds.impl.ContigImpl <em>Contig</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scaffolds.impl.ContigImpl
	 * @see scaffolds.impl.ScaffoldsPackageImpl#getContig()
	 * @generated
	 */
	int CONTIG = 1;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTIG__VERTICES = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTIG__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTIG__MULTIPLICITY = 2;

	/**
	 * The number of structural features of the '<em>Contig</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contig</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scaffolds.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scaffolds.impl.EdgeImpl
	 * @see scaffolds.impl.ScaffoldsPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__VERTICES = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DISTANCE = 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scaffolds.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scaffolds.impl.VertexImpl
	 * @see scaffolds.impl.ScaffoldsPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 3;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__EDGES = 0;

	/**
	 * The feature id for the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NUM = 1;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link scaffolds.ScaffoldGraph <em>Scaffold Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaffold Graph</em>'.
	 * @see scaffolds.ScaffoldGraph
	 * @generated
	 */
	EClass getScaffoldGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link scaffolds.ScaffoldGraph#getContigs <em>Contigs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contigs</em>'.
	 * @see scaffolds.ScaffoldGraph#getContigs()
	 * @see #getScaffoldGraph()
	 * @generated
	 */
	EReference getScaffoldGraph_Contigs();

	/**
	 * Returns the meta object for the containment reference list '{@link scaffolds.ScaffoldGraph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see scaffolds.ScaffoldGraph#getEdges()
	 * @see #getScaffoldGraph()
	 * @generated
	 */
	EReference getScaffoldGraph_Edges();

	/**
	 * Returns the meta object for class '{@link scaffolds.Contig <em>Contig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contig</em>'.
	 * @see scaffolds.Contig
	 * @generated
	 */
	EClass getContig();

	/**
	 * Returns the meta object for the containment reference list '{@link scaffolds.Contig#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertices</em>'.
	 * @see scaffolds.Contig#getVertices()
	 * @see #getContig()
	 * @generated
	 */
	EReference getContig_Vertices();

	/**
	 * Returns the meta object for the attribute '{@link scaffolds.Contig#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see scaffolds.Contig#getLength()
	 * @see #getContig()
	 * @generated
	 */
	EAttribute getContig_Length();

	/**
	 * Returns the meta object for the attribute '{@link scaffolds.Contig#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see scaffolds.Contig#getMultiplicity()
	 * @see #getContig()
	 * @generated
	 */
	EAttribute getContig_Multiplicity();

	/**
	 * Returns the meta object for class '{@link scaffolds.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see scaffolds.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference list '{@link scaffolds.Edge#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vertices</em>'.
	 * @see scaffolds.Edge#getVertices()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Vertices();

	/**
	 * Returns the meta object for the attribute '{@link scaffolds.Edge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see scaffolds.Edge#getWeight()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Weight();

	/**
	 * Returns the meta object for the attribute '{@link scaffolds.Edge#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see scaffolds.Edge#getDistance()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Distance();

	/**
	 * Returns the meta object for class '{@link scaffolds.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see scaffolds.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link scaffolds.Vertex#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see scaffolds.Vertex#getEdges()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Edges();

	/**
	 * Returns the meta object for the attribute '{@link scaffolds.Vertex#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num</em>'.
	 * @see scaffolds.Vertex#getNum()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Num();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScaffoldsFactory getScaffoldsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scaffolds.impl.ScaffoldGraphImpl <em>Scaffold Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scaffolds.impl.ScaffoldGraphImpl
		 * @see scaffolds.impl.ScaffoldsPackageImpl#getScaffoldGraph()
		 * @generated
		 */
		EClass SCAFFOLD_GRAPH = eINSTANCE.getScaffoldGraph();

		/**
		 * The meta object literal for the '<em><b>Contigs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAFFOLD_GRAPH__CONTIGS = eINSTANCE.getScaffoldGraph_Contigs();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAFFOLD_GRAPH__EDGES = eINSTANCE.getScaffoldGraph_Edges();

		/**
		 * The meta object literal for the '{@link scaffolds.impl.ContigImpl <em>Contig</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scaffolds.impl.ContigImpl
		 * @see scaffolds.impl.ScaffoldsPackageImpl#getContig()
		 * @generated
		 */
		EClass CONTIG = eINSTANCE.getContig();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTIG__VERTICES = eINSTANCE.getContig_Vertices();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTIG__LENGTH = eINSTANCE.getContig_Length();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTIG__MULTIPLICITY = eINSTANCE.getContig_Multiplicity();

		/**
		 * The meta object literal for the '{@link scaffolds.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scaffolds.impl.EdgeImpl
		 * @see scaffolds.impl.ScaffoldsPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__VERTICES = eINSTANCE.getEdge_Vertices();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__WEIGHT = eINSTANCE.getEdge_Weight();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__DISTANCE = eINSTANCE.getEdge_Distance();

		/**
		 * The meta object literal for the '{@link scaffolds.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scaffolds.impl.VertexImpl
		 * @see scaffolds.impl.ScaffoldsPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__EDGES = eINSTANCE.getVertex_Edges();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__NUM = eINSTANCE.getVertex_Num();

	}

} //ScaffoldsPackage
