package be.steformations.it.xml.shakespeare;

import be.steformations.java_xml.shakespeare.MonologueSearcher;

public class MonologueSearcheDom extends SpeechConcatenatorImpl implements MonologueSearcher {

	@Override
	public String getMonologue(String play, String role, String debut) {
		String monologue = null;
		org.w3c.dom.Document doc = this.getDocument(play);
		if (doc != null){
			System.out.println(doc.getDocumentElement().getTextContent());
			org.w3c.dom.Node goodSpeech = this.getGoodSpeechNode(doc, role, debut);
			if (goodSpeech != null){
				monologue = this.concatenateLines(goodSpeech);
			}
		}
		
		return monologue;
	}
	
	protected org.w3c.dom.Node getGoodSpeechNode(org.w3c.dom.Document doc, String role, String start){
		org.w3c.dom.Node goodSpeech = null;
		org.w3c.dom.NodeList speeches = doc.getElementsByTagName("SPEECH");
		for (int i = 0; i < speeches.getLength() && goodSpeech == null; i++){
			org.w3c.dom.Element candidateSpeech = (org.w3c.dom.Element) speeches.item(i);
			org.w3c.dom.NodeList speakers = candidateSpeech.getElementsByTagName("SPEAKER");		 
			if (speakers.getLength() > 0){
				org.w3c.dom.Node candidateSpeaker = speakers.item(0);
				if (role.equalsIgnoreCase(candidateSpeaker.getTextContent())){
					org.w3c.dom.NodeList lines = candidateSpeech.getElementsByTagName("LINE");
					if (lines.getLength() > 0){
						org.w3c.dom.Node candidateLine = lines.item(0);
						if (candidateLine.getTextContent().startsWith(start)){
							goodSpeech = candidateSpeech;
						}
					}
				}
			}
		}
		
		return goodSpeech;
	}
	
	protected org.w3c.dom.Document getDocument(String title){
		org.w3c.dom.Document doc = null;
		String path = String.format("/xml/%s.xml", title); 
		
		try(
			java.io.InputStream ips = this.getClass().getResourceAsStream(path); // recherche le fichier dans le classpath			
		){
		//regex	
			javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
			factory.setIgnoringElementContentWhitespace(true);
			javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
		//Xpath	
			//javax.xml.parsers.DocumentBuilder builder = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();
			doc = builder.parse(ips);
		} catch(Exception e){
			e.printStackTrace();
		}
		return doc;		
	}

}
