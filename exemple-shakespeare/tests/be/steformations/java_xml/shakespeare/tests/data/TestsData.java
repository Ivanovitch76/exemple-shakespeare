package be.steformations.java_xml.shakespeare.tests.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestsData {

	public static final List<Map<String, String>> TestGetSpeakerData = getTestGetSpeakerData(); 
	public static final List<Map<String, String>> TestConcatenationLinesData = getTestConcatenationLinesData();
	public static final List<Map<String, String>> TestGetMonologueData = getTestMonologueData();
	
	
	@SuppressWarnings("serial")
	private static List<Map<String, String>> getTestGetSpeakerData() {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		
		data.add( new HashMap<String, String>() {{
			put("SPEAKER", "HAMLET");
			put("XML",  "<SPEECH><SPEAKER>HAMLET</SPEAKER><LINE>To be, or not to be: that is the question:</LINE><LINE>Whether 'tis nobler in the mind to suffer</LINE><LINE>The slings and arrows of outrageous fortune,</LINE><LINE>Or to take arms against a sea of troubles,</LINE><LINE>And by opposing end them? To die: to sleep;</LINE><LINE>No more; and by a sleep to say we end</LINE><LINE>The heart-ache and the thousand natural shocks</LINE><LINE>That flesh is heir to, 'tis a consummation</LINE><LINE>Devoutly to be wish'd. To die, to sleep;</LINE><LINE>To sleep: perchance to dream: ay, there's the rub;</LINE><LINE>For in that sleep of death what dreams may come</LINE><LINE>When we have shuffled off this mortal coil,</LINE><LINE>Must give us pause: there's the respect</LINE><LINE>That makes calamity of so long life;</LINE><LINE>For who would bear the whips and scorns of time,</LINE><LINE>The oppressor's wrong, the proud man's contumely,</LINE><LINE>The pangs of despised love, the law's delay,</LINE><LINE>The insolence of office and the spurns</LINE><LINE>That patient merit of the unworthy takes,</LINE><LINE>When he himself might his quietus make</LINE><LINE>With a bare bodkin? who would fardels bear,</LINE><LINE>To grunt and sweat under a weary life,</LINE><LINE>But that the dread of something after death,</LINE><LINE>The undiscover'd country from whose bourn</LINE><LINE>No traveller returns, puzzles the will</LINE><LINE>And makes us rather bear those ills we have</LINE><LINE>Than fly to others that we know not of?</LINE><LINE>Thus conscience does make cowards of us all;</LINE><LINE>And thus the native hue of resolution</LINE><LINE>Is sicklied o'er with the pale cast of thought,</LINE><LINE>And enterprises of great pith and moment</LINE><LINE>With this regard their currents turn awry,</LINE><LINE>And lose the name of action.--Soft you now!</LINE><LINE>The fair Ophelia! Nymph, in thy orisons</LINE><LINE>Be all my sins remember'd.</LINE></SPEECH>");
		}});
		
		data.add( new HashMap<String, String>() {{
			put("SPEAKER", "MACBETH");
			put("XML",  "<SPEECH><SPEAKER>MACBETH</SPEAKER><LINE>She should have died hereafter;</LINE><LINE>There would have been a time for such a word.</LINE><LINE>To-morrow, and to-morrow, and to-morrow,</LINE><LINE>Creeps in this petty pace from day to day</LINE><LINE>To the last syllable of recorded time,</LINE><LINE>And all our yesterdays have lighted fools</LINE><LINE>The way to dusty death. Out, out, brief candle!</LINE><LINE>Life's but a walking shadow, a poor player</LINE><LINE>That struts and frets his hour upon the stage</LINE><LINE>And then is heard no more: it is a tale</LINE><LINE>Told by an idiot, full of sound and fury,</LINE><LINE>Signifying nothing.</LINE></SPEECH>");
		}});

		data.add( new HashMap<String, String>() {{
			put("SPEAKER", "BENEDICK");
			put("XML",  "<SPEECH><SPEAKER>BENEDICK</SPEAKER><LINE>That a woman conceived me, I thank her; that she</LINE><LINE>brought me up, I likewise give her most humble</LINE><LINE>thanks: but that I will have a recheat winded in my</LINE><LINE>forehead, or hang my bugle in an invisible baldrick,</LINE><LINE>all women shall pardon me. Because I will not do</LINE><LINE>them the wrong to mistrust any, I will do myself the</LINE><LINE>right to trust none; and the fine is, for the which</LINE><LINE>I may go the finer, I will live a bachelor.</LINE></SPEECH>");
		}});
		
		return data;
	}
	
	@SuppressWarnings("serial")
	private static List<Map<String, String>> getTestConcatenationLinesData() {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
	
		data.add( new HashMap<String, String>() {{
			put("LINES", "To be, or not to be: that is the question:"+ System.lineSeparator() +"Whether 'tis nobler in the mind to suffer"+ System.lineSeparator() +"The slings and arrows of outrageous fortune,"+ System.lineSeparator() +"Or to take arms against a sea of troubles,"+ System.lineSeparator() +"And by opposing end them? To die: to sleep;"+ System.lineSeparator() +"No more; and by a sleep to say we end"+ System.lineSeparator() +"The heart-ache and the thousand natural shocks"+ System.lineSeparator() +"That flesh is heir to, 'tis a consummation"+ System.lineSeparator() +"Devoutly to be wish'd. To die, to sleep;"+ System.lineSeparator() +"To sleep: perchance to dream: ay, there's the rub;"+ System.lineSeparator() +"For in that sleep of death what dreams may come"+ System.lineSeparator() +"When we have shuffled off this mortal coil,"+ System.lineSeparator() +"Must give us pause: there's the respect"+ System.lineSeparator() +"That makes calamity of so long life;"+ System.lineSeparator() +"For who would bear the whips and scorns of time,"+ System.lineSeparator() +"The oppressor's wrong, the proud man's contumely,"+ System.lineSeparator() +"The pangs of despised love, the law's delay,"+ System.lineSeparator() +"The insolence of office and the spurns"+ System.lineSeparator() +"That patient merit of the unworthy takes,"+ System.lineSeparator() +"When he himself might his quietus make"+ System.lineSeparator() +"With a bare bodkin? who would fardels bear,"+ System.lineSeparator() +"To grunt and sweat under a weary life,"+ System.lineSeparator() +"But that the dread of something after death,"+ System.lineSeparator() +"The undiscover'd country from whose bourn"+ System.lineSeparator() +"No traveller returns, puzzles the will"+ System.lineSeparator() +"And makes us rather bear those ills we have"+ System.lineSeparator() +"Than fly to others that we know not of?"+ System.lineSeparator() +"Thus conscience does make cowards of us all;"+ System.lineSeparator() +"And thus the native hue of resolution"+ System.lineSeparator() +"Is sicklied o'er with the pale cast of thought,"+ System.lineSeparator() +"And enterprises of great pith and moment"+ System.lineSeparator() +"With this regard their currents turn awry,"+ System.lineSeparator() +"And lose the name of action.--Soft you now!"+ System.lineSeparator() +"The fair Ophelia! Nymph, in thy orisons"+ System.lineSeparator() +"Be all my sins remember'd."+ System.lineSeparator() +"");
			put("XML",  "<SPEECH><SPEAKER>HAMLET</SPEAKER><LINE>To be, or not to be: that is the question:</LINE><LINE>Whether 'tis nobler in the mind to suffer</LINE><LINE>The slings and arrows of outrageous fortune,</LINE><LINE>Or to take arms against a sea of troubles,</LINE><LINE>And by opposing end them? To die: to sleep;</LINE><LINE>No more; and by a sleep to say we end</LINE><LINE>The heart-ache and the thousand natural shocks</LINE><LINE>That flesh is heir to, 'tis a consummation</LINE><LINE>Devoutly to be wish'd. To die, to sleep;</LINE><LINE>To sleep: perchance to dream: ay, there's the rub;</LINE><LINE>For in that sleep of death what dreams may come</LINE><LINE>When we have shuffled off this mortal coil,</LINE><LINE>Must give us pause: there's the respect</LINE><LINE>That makes calamity of so long life;</LINE><LINE>For who would bear the whips and scorns of time,</LINE><LINE>The oppressor's wrong, the proud man's contumely,</LINE><LINE>The pangs of despised love, the law's delay,</LINE><LINE>The insolence of office and the spurns</LINE><LINE>That patient merit of the unworthy takes,</LINE><LINE>When he himself might his quietus make</LINE><LINE>With a bare bodkin? who would fardels bear,</LINE><LINE>To grunt and sweat under a weary life,</LINE><LINE>But that the dread of something after death,</LINE><LINE>The undiscover'd country from whose bourn</LINE><LINE>No traveller returns, puzzles the will</LINE><LINE>And makes us rather bear those ills we have</LINE><LINE>Than fly to others that we know not of?</LINE><LINE>Thus conscience does make cowards of us all;</LINE><LINE>And thus the native hue of resolution</LINE><LINE>Is sicklied o'er with the pale cast of thought,</LINE><LINE>And enterprises of great pith and moment</LINE><LINE>With this regard their currents turn awry,</LINE><LINE>And lose the name of action.--Soft you now!</LINE><LINE>The fair Ophelia! Nymph, in thy orisons</LINE><LINE>Be all my sins remember'd.</LINE></SPEECH>");
		}});
		
		data.add( new HashMap<String, String>() {{
			put("LINES", "She should have died hereafter;"+ System.lineSeparator() +"There would have been a time for such a word."+ System.lineSeparator() +"To-morrow, and to-morrow, and to-morrow,"+ System.lineSeparator() +"Creeps in this petty pace from day to day"+ System.lineSeparator() +"To the last syllable of recorded time,"+ System.lineSeparator() +"And all our yesterdays have lighted fools"+ System.lineSeparator() +"The way to dusty death. Out, out, brief candle!"+ System.lineSeparator() +"Life's but a walking shadow, a poor player"+ System.lineSeparator() +"That struts and frets his hour upon the stage"+ System.lineSeparator() +"And then is heard no more: it is a tale"+ System.lineSeparator() +"Told by an idiot, full of sound and fury,"+ System.lineSeparator() +"Signifying nothing."+ System.lineSeparator() +"");
			put("XML",  "<SPEECH><SPEAKER>MACBETH</SPEAKER><LINE>She should have died hereafter;</LINE><LINE>There would have been a time for such a word.</LINE><LINE>To-morrow, and to-morrow, and to-morrow,</LINE><LINE>Creeps in this petty pace from day to day</LINE><LINE>To the last syllable of recorded time,</LINE><LINE>And all our yesterdays have lighted fools</LINE><LINE>The way to dusty death. Out, out, brief candle!</LINE><LINE>Life's but a walking shadow, a poor player</LINE><LINE>That struts and frets his hour upon the stage</LINE><LINE>And then is heard no more: it is a tale</LINE><LINE>Told by an idiot, full of sound and fury,</LINE><LINE>Signifying nothing.</LINE></SPEECH>");
		}});

		data.add( new HashMap<String, String>() {{
			put("LINES", "That a woman conceived me, I thank her; that she"+ System.lineSeparator() +"brought me up, I likewise give her most humble"+ System.lineSeparator() +"thanks: but that I will have a recheat winded in my"+ System.lineSeparator() +"forehead, or hang my bugle in an invisible baldrick,"+ System.lineSeparator() +"all women shall pardon me. Because I will not do"+ System.lineSeparator() +"them the wrong to mistrust any, I will do myself the"+ System.lineSeparator() +"right to trust none; and the fine is, for the which"+ System.lineSeparator() +"I may go the finer, I will live a bachelor."+ System.lineSeparator() +"");
			put("XML",  "<SPEECH><SPEAKER>BENEDICK</SPEAKER><LINE>That a woman conceived me, I thank her; that she</LINE><LINE>brought me up, I likewise give her most humble</LINE><LINE>thanks: but that I will have a recheat winded in my</LINE><LINE>forehead, or hang my bugle in an invisible baldrick,</LINE><LINE>all women shall pardon me. Because I will not do</LINE><LINE>them the wrong to mistrust any, I will do myself the</LINE><LINE>right to trust none; and the fine is, for the which</LINE><LINE>I may go the finer, I will live a bachelor.</LINE></SPEECH>");
		}});
		
		return data;
	}
	
	@SuppressWarnings("serial")
	private static List<Map<String, String>> getTestMonologueData() {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
	
		data.add( new HashMap<String, String>() {{
			put("MONOLOGUE", "To be, or not to be: that is the question:"+ System.lineSeparator() +"Whether 'tis nobler in the mind to suffer"+ System.lineSeparator() +"The slings and arrows of outrageous fortune,"+ System.lineSeparator() +"Or to take arms against a sea of troubles,"+ System.lineSeparator() +"And by opposing end them? To die: to sleep;"+ System.lineSeparator() +"No more; and by a sleep to say we end"+ System.lineSeparator() +"The heart-ache and the thousand natural shocks"+ System.lineSeparator() +"That flesh is heir to, 'tis a consummation"+ System.lineSeparator() +"Devoutly to be wish'd. To die, to sleep;"+ System.lineSeparator() +"To sleep: perchance to dream: ay, there's the rub;"+ System.lineSeparator() +"For in that sleep of death what dreams may come"+ System.lineSeparator() +"When we have shuffled off this mortal coil,"+ System.lineSeparator() +"Must give us pause: there's the respect"+ System.lineSeparator() +"That makes calamity of so long life;"+ System.lineSeparator() +"For who would bear the whips and scorns of time,"+ System.lineSeparator() +"The oppressor's wrong, the proud man's contumely,"+ System.lineSeparator() +"The pangs of despised love, the law's delay,"+ System.lineSeparator() +"The insolence of office and the spurns"+ System.lineSeparator() +"That patient merit of the unworthy takes,"+ System.lineSeparator() +"When he himself might his quietus make"+ System.lineSeparator() +"With a bare bodkin? who would fardels bear,"+ System.lineSeparator() +"To grunt and sweat under a weary life,"+ System.lineSeparator() +"But that the dread of something after death,"+ System.lineSeparator() +"The undiscover'd country from whose bourn"+ System.lineSeparator() +"No traveller returns, puzzles the will"+ System.lineSeparator() +"And makes us rather bear those ills we have"+ System.lineSeparator() +"Than fly to others that we know not of?"+ System.lineSeparator() +"Thus conscience does make cowards of us all;"+ System.lineSeparator() +"And thus the native hue of resolution"+ System.lineSeparator() +"Is sicklied o'er with the pale cast of thought,"+ System.lineSeparator() +"And enterprises of great pith and moment"+ System.lineSeparator() +"With this regard their currents turn awry,"+ System.lineSeparator() +"And lose the name of action.--Soft you now!"+ System.lineSeparator() +"The fair Ophelia! Nymph, in thy orisons"+ System.lineSeparator() +"Be all my sins remember'd."+ System.lineSeparator() +"");
			put("PLAY", "hamlet");
			put("SPEAKER", "hamlet");
			put("START", "To be, or not to be");
		}});
		
		data.add( new HashMap<String, String>() {{
			put("MONOLOGUE", "She should have died hereafter;"+ System.lineSeparator() +"There would have been a time for such a word."+ System.lineSeparator() +"To-morrow, and to-morrow, and to-morrow,"+ System.lineSeparator() +"Creeps in this petty pace from day to day"+ System.lineSeparator() +"To the last syllable of recorded time,"+ System.lineSeparator() +"And all our yesterdays have lighted fools"+ System.lineSeparator() +"The way to dusty death. Out, out, brief candle!"+ System.lineSeparator() +"Life's but a walking shadow, a poor player"+ System.lineSeparator() +"That struts and frets his hour upon the stage"+ System.lineSeparator() +"And then is heard no more: it is a tale"+ System.lineSeparator() +"Told by an idiot, full of sound and fury,"+ System.lineSeparator() +"Signifying nothing."+ System.lineSeparator() +"");
			put("PLAY", "macbeth");
			put("SPEAKER", "macbeth");
			put("START", "She should have died hereafter");			
		}});

		data.add( new HashMap<String, String>() {{
			put("MONOLOGUE", "That a woman conceived me, I thank her; that she"+ System.lineSeparator() +"brought me up, I likewise give her most humble"+ System.lineSeparator() +"thanks: but that I will have a recheat winded in my"+ System.lineSeparator() +"forehead, or hang my bugle in an invisible baldrick,"+ System.lineSeparator() +"all women shall pardon me. Because I will not do"+ System.lineSeparator() +"them the wrong to mistrust any, I will do myself the"+ System.lineSeparator() +"right to trust none; and the fine is, for the which"+ System.lineSeparator() +"I may go the finer, I will live a bachelor."+ System.lineSeparator() +"");
			put("PLAY", "much_ado");
			put("SPEAKER", "benedick");
			put("START", "That a woman conceived me, I thank her");			
		}});
		
		return data;
	}	
	
}
