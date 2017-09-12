package be.steformations.it.xml.shakespeare;

public class MonologueSearcherRegex extends MonologueSearcheDom {

	@Override
	public String getMonologue(String play, String role, String debut) {
		String monologue = null;
		
		String xml = this.getXmlFromPlay(play);
//		System.out.println(xml);
		String[] lines = this.getGoodLinesAsText(xml, role, debut);
		System.out.println(java.util.Arrays.toString(lines));
		org.w3c.dom.Node speech = this.createGoodSpeechNode(role, lines);
		monologue = this.concatenateLines(speech);
		
		return monologue;
	}

	protected org.w3c.dom.Node createGoodSpeechNode(String role, String[] lines){
		org.w3c.dom.Node speechNode = null;
		
		try{
			org.w3c.dom.Document doc = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			speechNode = doc.createElement("SPEECH");
			
			org.w3c.dom.Node speakerNode = doc.createElement("SPEAKER");
			org.w3c.dom.Node speakerValue = doc.createTextNode(role.toUpperCase());
			speakerNode.appendChild(speakerValue);
			speechNode.appendChild(speakerNode);
			
			for (int i = 0; i < lines.length; i++) {
				org.w3c.dom.Node lineNode = doc.createElement("LINE");
				org.w3c.dom.Node lineValue = doc.createTextNode(lines[i]);
				lineNode.appendChild(lineValue);
				speechNode.appendChild(lineNode);				
			}
			
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return speechNode;
	}
	
	protected String[] getGoodLinesAsText(String xml, String role, String debut){
		String[] lines = null;
		String regex = String.format("<speech><speaker>%s</speaker><line>(%s.*?)</line>(</speech>|<stagedir>|<subhead>)", role, debut);
		
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex, java.util.regex.Pattern.CASE_INSENSITIVE);
		
		java.util.regex.Matcher matcher = pattern.matcher(xml);
		
		if (matcher.find()){
//			System.out.println(matcher.group(0));
//			System.out.println(matcher.group(1));
			lines = matcher.group(1).split("</LINE><LINE>");
		}
		
		return lines;
	}
	
	protected String getXmlFromPlay(String play){
		String xml = null;
		
		org.w3c.dom.Document doc = this.getDocument(play);
		
		try{
			javax.xml.transform.Source source = new javax.xml.transform.dom.DOMSource(doc);
			
			java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
			javax.xml.transform.Result destination = new javax.xml.transform.stream.StreamResult(baos);
			
			javax.xml.transform.TransformerFactory.newInstance().newTransformer().transform(source, destination);
			
			xml= baos.toString();
		} catch (Exception e){
			e.printStackTrace();
		} 		
		return xml;
	}
	
}
