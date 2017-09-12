package be.steformations.java_xml.shakespeare.tests;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import be.steformations.java_xml.shakespeare.MonologueSearcher;
import be.steformations.java_xml.shakespeare.tests.data.TestsData;

public class _3_TestMonologueSearcher {

	private MonologueSearcher searchMonologue;
	
	@Before
	public void init() {
		try {
			searchMonologue = FabriqueTests.getMonologueSearcher();
			assertNotNull("FabriqueTests.getMonologueSearcher() != null", searchMonologue);
		} catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testGetMonologue() {
		for (Map<String,String> test : TestsData.TestGetMonologueData) {
			testOk(test.get("PLAY"), test.get("SPEAKER"), test.get("START"), test.get("MONOLOGUE"));
		}
	}
	
	public void testOk(String play, String speaker, String start, String expected) {
		try {
			String monologue = searchMonologue.getMonologue(play, speaker, start);
			assertNotNull(String.format("FabriqueTests.getMonologueSearcher().getMonologue(\"%s\", \"%s\", \"%s\") != null", play, speaker, start), monologue);
			assertEquals(String.format("FabriqueTests.getMonologueSearcher().getMonologue(\"%s\", \"%s\", \"%s\")", play, speaker, start), expected, monologue);
		} catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
