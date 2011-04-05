import java.util.Locale;

import org.junit.Test;

import junit.framework.TestCase;


public class PrintBalanceTest extends TestCase {
	@Test
	public void testEnglishGreeing(){
		assertEquals("Hello World", PrintBalance.getLanguageMessage("greeting", new Locale("en", "US")));
	}
	
	@Test
	public void testEnglishNamePrompt(){
		assertEquals("What's your name? ", PrintBalance.getLanguageMessage("namePrompt", new Locale("en", "US")));
	}
	
	@Test
	public void testEnglishPleasedToMeet(){
		assertEquals("Pleased to meet you, ", PrintBalance.getLanguageMessage("pleasedtomeet", new Locale("en", "US")));
	}
	
	@Test
	public void testEnglishAsOf(){
		assertEquals("As of: ", PrintBalance.getLanguageMessage("asof", new Locale("en", "US")));
	}
	
	@Test
	public void testEnglishYouOwe(){
		assertEquals("You owe the school", PrintBalance.getLanguageMessage("youowetheschool", new Locale("en", "US")));
	}
	
	@Test
	public void testEnglishGoodbye(){
		assertEquals("Goodbye!", PrintBalance.getLanguageMessage("goodbye", new Locale("en", "US")));
	}
	
	@Test
	public void testGermanGreeing(){
		assertEquals("Hallo Welt!", PrintBalance.getLanguageMessage("greeting", new Locale("de", "DE")));
	}
	
	@Test
	public void testGermanNamePrompt(){
		assertEquals("Wie hieﬂen Sie?", PrintBalance.getLanguageMessage("namePrompt", new Locale("de", "DE")));
	}
	
	@Test
	public void testGermanPleasedToMeet(){
		assertEquals("Es gef‰llt mir Sie kennen, ", PrintBalance.getLanguageMessage("pleasedtomeet", new Locale("de", "DE")));
	}
	
	@Test
	public void testGermanAsOf(){
		assertEquals("Ab sofort : ", PrintBalance.getLanguageMessage("asof", new Locale("de", "DE")));
	}
	
	@Test
	public void testGermanYouOwe(){
		assertEquals("Sie schulden der Schule", PrintBalance.getLanguageMessage("youowetheschool", new Locale("de", "DE")));
	}
	
	@Test
	public void testGermanGoodbye(){
		assertEquals("Aufweidersehen!", PrintBalance.getLanguageMessage("goodbye", new Locale("de", "DE")));
	}
	
	@Test
	public void testFrenchGreeing(){
		assertEquals("Bonjour!", PrintBalance.getLanguageMessage("greeting", new Locale("fr", "FR")));
	}
	
	@Test
	public void testFrenchNamePrompt(){
		assertEquals("Vous appellez-vou?", PrintBalance.getLanguageMessage("namePrompt", new Locale("fr", "FR")));
	}
	
	@Test
	public void testFrenchPleasedToMeet(){
		assertEquals("Enchante, ", PrintBalance.getLanguageMessage("pleasedtomeet", new Locale("fr", "FR")));
	}
	
	@Test
	public void testFrenchAsOf(){
		assertEquals("Du : ", PrintBalance.getLanguageMessage("asof", new Locale("fr", "FR")));
	}
	
	@Test
	public void testFrenchYouOwe(){
		assertEquals("Vous devez l'ecole", PrintBalance.getLanguageMessage("youowetheschool", new Locale("fr", "FR")));
	}
	
	@Test
	public void testFrenchGoodbye(){
		assertEquals("Au revoir", PrintBalance.getLanguageMessage("goodbye", new Locale("fr", "FR")));
	}
}
