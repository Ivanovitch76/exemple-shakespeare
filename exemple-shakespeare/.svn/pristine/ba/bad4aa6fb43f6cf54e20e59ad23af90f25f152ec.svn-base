package be.steformations.java_xml.shakespeare.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import be.steformations.java_xml.shakespeare.SpeakerSearcher;
import be.steformations.java_xml.shakespeare.tests.data.TestsData;

public class _1_TestSpeakerSearcher {

	private SpeakerSearcher searchSpeaker;
	
	@Before
	public void init() {
		try {
			searchSpeaker = FabriqueTests.getSpeakerSearcher();
			assertNotNull("FabriqueTests.getSpeakerSearcher() != null", searchSpeaker);
		} catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void test() {
		for (Map<String,String> test : TestsData.TestGetSpeakerData) {
			testOk(test.get("XML"), test.get("SPEAKER"));
		}
	}
	
	public void testOk(String xml, String expected) {
		try {
			String speaker = searchSpeaker.getSpeaker(xml);
			assertNotNull(String.format("FabriqueTests.getSpeakerSearcher().getSpeaker(\"%s\") != null", xml), speaker);
			assertEquals(String.format("FabriqueTests.getSpeakerSearcher().getSpeaker(\"%s\")", xml), expected, speaker);
		} catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
