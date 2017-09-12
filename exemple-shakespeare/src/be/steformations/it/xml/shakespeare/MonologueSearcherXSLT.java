package be.steformations.it.xml.shakespeare;

public class MonologueSearcherXSLT extends MonologueSearcheDom {
	
	@Override
	public String concatenateLines(org.w3c.dom.Node speechNode){
		String concat = null;
		try(
			java.io.InputStream ips = this.getClass().getResourceAsStream("/xml/monologue.xsl");	
		){
			javax.xml.transform.Source xml = new javax.xml.transform.dom.DOMSource(speechNode);
			javax.xml.transform.Source xsl = new javax.xml.transform.stream.StreamSource(ips);
			java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
			javax.xml.transform.Result out = new javax.xml.transform.stream.StreamResult(baos);
			
			javax.xml.transform.Transformer transformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer(xsl);
			
			transformer.transform(xml,  out);
			
			concat = baos.toString();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return concat;
	}

}
