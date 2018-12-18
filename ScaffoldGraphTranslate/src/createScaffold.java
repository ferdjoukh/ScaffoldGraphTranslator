import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import scaffolds.Contig;
import scaffolds.Edge;
import scaffolds.ScaffoldGraph;
import scaffolds.ScaffoldsPackage;
import scaffolds.Vertex;

public class createScaffold {

	public static void main(String[] args) throws IOException {
				
		if(args.length==0){
			System.out.println("xmi2scaffold");
			System.out.println("  This tool translates Scaffold graphs from xmi format to the "
					+ "\n  Scaffold graph format");
			System.out.println("");
			System.out.println("");
			System.out.println("USE IT");
			System.out.println("  java -jar ScaffoldGraphTranslator.jar ScaffoldGraphsFolder");
			System.out.println("");
			System.out.println("OUTPUT");
			System.out.println("  .dot files representing the scaffold graph");
			System.out.println("  .pdf files representing the scaffold graph (if dot is installed)");
			
		}else {
			
			File dir = new File(args[0]);
			
			File outdir = new File("output");
			outdir.mkdir();
			
			if(dir.isDirectory()) {
				File[] allFiles= dir.listFiles();
				
				for(File f: allFiles) {
						
					if(f.getName().endsWith(".xmi")) {
						ScaffoldGraph root = loadRootPackage(f.getPath());
						generateScaffold(root,f.getPath(),"output/"+f.getName());
					}
				}
			}else {
				System.out.println(args[0] + " is not a directory");
			}
		}
	}
	
	public static void generateScaffold(ScaffoldGraph graph,String inputModelPath, String outputModelPath) throws IOException {
		
		String modelName = outputModelPath.substring(0, outputModelPath.lastIndexOf("."));
		String outputModel = modelName;
		
		PrintWriter ecrivain;
		
		ecrivain =  new PrintWriter(new BufferedWriter(new FileWriter(outputModel+".dot")));
		
		ecrivain.write("Graph g{ \n");
		
		for(Contig contig: graph.getContigs()) {
			if(contig.getVertices().size()==2) {
				Vertex vertex1 = contig.getVertices().get(0);
				Vertex vertex2 = contig.getVertices().get(1);
				ecrivain.write(vertex1.getNum() + "--"+ vertex2.getNum()+ " [penwidth=10];\n");
			}else {
				//System.out.println("contig: "+ contig.getLength());
			}
		}
		
		for(Edge edge: graph.getEdges()) {
			if(edge.getVertices().size()==2) {
				Vertex vertex1 = edge.getVertices().get(0);
				Vertex vertex2 = edge.getVertices().get(1);
				ecrivain.write(vertex1.getNum() + "--"+ vertex2.getNum()+ " [label="+edge.getWeight()+"];\n");
			}else {
				//System.out.println("edge: "+ edge.getWeight());
			}
		}
				
		ecrivain.write("} \n");
		ecrivain.close();
		
		/////////////////////////////////////////////////////
		// Call graphViz in order to generate 
		// an object diagram in pdf file
		/////////////////////////////////////////////////////
		String cmd = "dot -Tpdf "+outputModel+".dot -o "+outputModel+".pdf";
		
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			System.out.println("OK ["+ inputModelPath +"] was translated to ["+outputModel+".pdf]");
		}
		catch(Exception e){
			System.out.println("OK ["+ inputModelPath +"] was translated to ["+outputModel+".dot]");
		}
	}
	
	public static ScaffoldGraph loadRootPackage(String model) {
		
		EPackage.Registry.INSTANCE.put(ScaffoldsPackage.eNS_URI, ScaffoldsPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource.Factory.Registry reg=Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi",new XMIResourceFactoryImpl());
		ResourceSet resourceSet=new ResourceSetImpl();
		URI fileURI=URI.createFileURI(model);
		Resource resource=resourceSet.getResource(fileURI,true);
		ScaffoldGraph rootpackage= (ScaffoldGraph) resource.getContents().get(0);
		return rootpackage;
	}

}
