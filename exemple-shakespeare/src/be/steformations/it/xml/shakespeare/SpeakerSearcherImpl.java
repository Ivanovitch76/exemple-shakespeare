package be.steformations.it.xml.shakespeare;

import be.steformations.java_xml.shakespeare.SpeakerSearcher;

public class SpeakerSearcherImpl implements SpeakerSearcher{

	@Override
	public String getSpeaker(String xml) {
		String speaker = null;
		
		org.w3c.dom.Node speechNode = XmlConverter.string2Node(xml);
		if (speechNode != null){
			org.w3c.dom.Node speakerNode = speechNode.getFirstChild();
			while (speakerNode.getNodeType() != org.w3c.dom.Node.ELEMENT_NODE){
				speakerNode = speakerNode.getNextSibling(); //noeud frere
			}
			speaker=speakerNode.getTextContent(); //contenu entre balise ouvrante et fermante
		}
		
		return speaker;
	}

}
