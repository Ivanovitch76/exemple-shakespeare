package be.steformations.java_xml.shakespeare.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import be.steformations.java_xml.shakespeare.SpeechConcatenator;
import be.steformations.java_xml.shakespeare.tests.data.TestsData;

public class _2_TestSpeechConcatenator {

	private SpeechConcatenator speechConcatenator;
	
	@Before
	public void init() {
		try {
			speechConcatenator = FabriqueTests.getSpeechConcatenator();
			assertNotNull("FabriqueTests.getSpeechConcatenator() != null", speechConcatenator);
		} catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void test() {
		for (Map<String,String> test : TestsData.TestConcatenationLinesData) {
			testOk(test.get("XML"), test.get("LINES"));
		}
	}
	
	public void testOk(String xml, String expected) {
		try {
			String concatenation = speechConcatenator.concatenateLines(xml);
			assertNotNull(String.format("FabriqueTests.getSpeechConcatenator().concatenateLines(\"%s\") != null", xml), concatenation);
			assertEquals(String.format("FabriqueTests.getSpeechConcatenator().concatenateLines(\"%s\")", xml), expected, concatenation);
		} catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
