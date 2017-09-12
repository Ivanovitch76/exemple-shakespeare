package be.steformations.it.xml.shakespeare;

public class XmlConverter {

		public static org.w3c.dom.Node string2Node(String xml){
			org.w3c.dom.Node node = null;
			try{
				org.w3c.dom.Document doc = string2Document(xml);		
				if (doc != null){
					node = doc.getDocumentElement(); //racine
				}
			} catch(Exception e) {
				e.printStackTrace();			
			}
			return node;		
		}
		
		public static org.w3c.dom.Document string2Document(String xml){
			org.w3c.dom.Document doc = null;
			try(
				java.io.InputStream ips = new java.io.ByteArrayInputStream(xml.getBytes());	
			){
				javax.xml.parsers.DocumentBuilder builder = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();
				doc = builder.parse(ips);
			} catch(Exception e){
				e.printStackTrace();
			}
			
			return doc;
		}
}
