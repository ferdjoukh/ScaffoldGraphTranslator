/**
 */
package scaffolds.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scaffolds.Contig;
import scaffolds.Edge;
import scaffolds.ScaffoldGraph;
import scaffolds.ScaffoldsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaffold Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scaffolds.impl.ScaffoldGraphImpl#getContigs <em>Contigs</em>}</li>
 *   <li>{@link scaffolds.impl.ScaffoldGraphImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScaffoldGraphImpl extends MinimalEObjectImpl.Container implements ScaffoldGraph {
	/**
	 * The cached value of the '{@link #getContigs() <em>Contigs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContigs()
	 * @generated
	 * @ordered
	 */
	protected EList<Contig> contigs;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScaffoldGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaffoldsPackage.Literals.SCAFFOLD_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contig> getContigs() {
		if (contigs == null) {
			contigs = new EObjectContainmentEList<Contig>(Contig.class, this, ScaffoldsPackage.SCAFFOLD_GRAPH__CONTIGS);
		}
		return contigs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, ScaffoldsPackage.SCAFFOLD_GRAPH__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaffoldsPackage.SCAFFOLD_GRAPH__CONTIGS:
				return ((InternalEList<?>)getContigs()).basicRemove(otherEnd, msgs);
			case ScaffoldsPackage.SCAFFOLD_GRAPH__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
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
			case ScaffoldsPackage.SCAFFOLD_GRAPH__CONTIGS:
				return getContigs();
			case ScaffoldsPackage.SCAFFOLD_GRAPH__EDGES:
				return getEdges();
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
			case ScaffoldsPackage.SCAFFOLD_GRAPH__CONTIGS:
				getContigs().clear();
				getContigs().addAll((Collection<? extends Contig>)newValue);
				return;
			case ScaffoldsPackage.SCAFFOLD_GRAPH__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
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
			case ScaffoldsPackage.SCAFFOLD_GRAPH__CONTIGS:
				getContigs().clear();
				return;
			case ScaffoldsPackage.SCAFFOLD_GRAPH__EDGES:
				getEdges().clear();
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
			case ScaffoldsPackage.SCAFFOLD_GRAPH__CONTIGS:
				return contigs != null && !contigs.isEmpty();
			case ScaffoldsPackage.SCAFFOLD_GRAPH__EDGES:
				return edges != null && !edges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScaffoldGraphImpl
