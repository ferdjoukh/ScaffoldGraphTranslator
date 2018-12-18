/**
 */
package scaffolds.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import scaffolds.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScaffoldsFactoryImpl extends EFactoryImpl implements ScaffoldsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScaffoldsFactory init() {
		try {
			ScaffoldsFactory theScaffoldsFactory = (ScaffoldsFactory)EPackage.Registry.INSTANCE.getEFactory(ScaffoldsPackage.eNS_URI);
			if (theScaffoldsFactory != null) {
				return theScaffoldsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScaffoldsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaffoldsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScaffoldsPackage.SCAFFOLD_GRAPH: return createScaffoldGraph();
			case ScaffoldsPackage.CONTIG: return createContig();
			case ScaffoldsPackage.EDGE: return createEdge();
			case ScaffoldsPackage.VERTEX: return createVertex();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaffoldGraph createScaffoldGraph() {
		ScaffoldGraphImpl scaffoldGraph = new ScaffoldGraphImpl();
		return scaffoldGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contig createContig() {
		ContigImpl contig = new ContigImpl();
		return contig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createVertex() {
		VertexImpl vertex = new VertexImpl();
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaffoldsPackage getScaffoldsPackage() {
		return (ScaffoldsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScaffoldsPackage getPackage() {
		return ScaffoldsPackage.eINSTANCE;
	}

} //ScaffoldsFactoryImpl
