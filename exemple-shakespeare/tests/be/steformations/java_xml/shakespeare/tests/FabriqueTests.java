package be.steformations.java_xml.shakespeare.tests;

import be.steformations.java_xml.shakespeare.MonologueSearcher;
import be.steformations.java_xml.shakespeare.SpeakerSearcher;
import be.steformations.java_xml.shakespeare.SpeechConcatenator;

public class FabriqueTests {

	public static SpeakerSearcher getSpeakerSearcher() {
		return new be.steformations.it.xml.shakespeare.SpeakerSearcherImpl();
	}
	
	public static SpeechConcatenator getSpeechConcatenator() {
		return new be.steformations.it.xml.shakespeare.SpeechConcatenatorImpl();
	}
	
	public static MonologueSearcher getMonologueSearcher() {
//		return new be.steformations.it.xml.shakespeare.MonologueSearcheDom();
//		return new be.steformations.it.xml.shakespeare.MonologueSearcheXpath();
//		return new be.steformations.it.xml.shakespeare.MonologueSearcherXSLT();
		return new be.steformations.it.xml.shakespeare.MonologueSearcherRegex();
	}
}
