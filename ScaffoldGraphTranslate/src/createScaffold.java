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
			System.out.println("ScaffoldGraphTranslator");
			System.out.println("");
			System.out.println("  This tool translates Scaffold graphs from xmi format to the "
					+ "\n  Scaffold graph format");
			System.out.println("");
			System.out.println("");
			System.out.println("USE IT");
			System.out.println("  with pdf: java -jar ScaffoldGraphTranslator.jar ScaffoldGraphsFolder outputfolder yes");
			System.out.println("  without pdf: java -jar ScaffoldGraphTranslator.jar ScaffoldGraphsFolder outputfolder no");
			System.out.println("");
			System.out.println("OUTPUT");
			System.out.println("  .dot files representing the scaffold graph");
			System.out.println("  .pdf files representing the scaffold graph (if dot is installed)");
			
		}else if(args.length == 3) {
			
			File dir = new File(args[0]);
			
			if(dir.isDirectory()) {
				File[] allFiles= dir.listFiles();
				
				for(File f: allFiles) {
						
					if(f.getName().endsWith(".xmi")) {
						ScaffoldGraph root = loadRootPackage(f.getPath());
						
						File outdir = new File(args[1]);
						if(!outdir.isDirectory()) {
							outdir.mkdir();
						}
						generateScaffold(root,f.getPath(),args[1]+"/"+f.getName(),args[2]);
					}
				}
			}else {
				System.out.println(args[0] + " is not a directory");
			}
		}else {
			System.out.println("[Problem] incorrect number of parameters ! Please retry !");
		}
	}
	
	public static void generateScaffold(ScaffoldGraph graph,String inputModelPath, String outputModelPath, String pdf) throws IOException {
		
		String modelName = outputModelPath.substring(0, outputModelPath.lastIndexOf("."));
		String outputModel = modelName;
		
		PrintWriter ecrivain;
		
		ecrivain =  new PrintWriter(new BufferedWriter(new FileWriter(outputModel+".dot")));
		
		ecrivain.write("Graph g{ \n");
		
		int cnumber=0;
		
		for(Contig contig: graph.getContigs()) {
			if(contig.getVertices().size()==2) {
				Vertex vertex1 = contig.getVertices().get(0);
				Vertex vertex2 = contig.getVertices().get(1);
				
				ecrivain.write(vertex1.getNum() + " [label="+ vertex1.getNum() +"];\n");
				ecrivain.write(vertex2.getNum() + " [label="+ vertex2.getNum() +"];\n");
				
				ecrivain.write(vertex1.getNum() + "--"+ vertex2.getNum()+ " [cname=\""+cnumber+"__len__"+contig.getLength()+"\",length="+contig.getLength()+","
																		+ "style=bold,mult="+contig.getMultiplicity()+"];\n");
			}else {
				//System.out.println("contig: "+ contig.getLength());
			}
			
			cnumber++;
		}
		
		for(Edge edge: graph.getEdges()) {
			if(edge.getVertices().size()==2) {
				Vertex vertex1 = edge.getVertices().get(0);
				Vertex vertex2 = edge.getVertices().get(1);
				ecrivain.write(vertex1.getNum() + "--"+ vertex2.getNum()+ " [label="+edge.getWeight()+",meandist="+edge.getDistance()+",fontsize=20];\n");
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
		
		if(pdf.equals("yes")) {
		
			try {
				Process p = Runtime.getRuntime().exec(cmd);
				System.out.println("OK ["+ inputModelPath +"] was translated to ["+outputModel+".pdf]");
			}
			catch(Exception e){
				System.out.println("OK ["+ inputModelPath +"] was translated to ["+outputModel+".dot]");
			}
		}
		else {
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
