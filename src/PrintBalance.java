import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Locale de = new Locale("de", "DE");
		Locale fr = new Locale("fr", "FR");
		Locale en = new Locale("en", "US");
		
		System.out.println("What language would you like?\n1 for German\n2 for French\nAnything else for English:  ");
		String input = scan.nextLine();
		if(input.contentEquals("1")){
			printBalance(de);
		}
		else if(input.contentEquals("2")){
			printBalance(fr);
		}
		else{
			printBalance(en);
		}
		}
	
	public static void printBalance(Locale locale){
		
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		Locale currentLocale;
		ResourceBundle messages;
		
		currentLocale = locale;
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		
		String msg1 = messages.getString("greeting");
		String msg2 = messages.getString("namePrompt");
		String msg3 = messages.getString("pleasedtomeet");
		String msg4 = messages.getString("asof");
		String msg5 = messages.getString("youowetheschool");
		String msg6 = messages.getString("goodbye");
		
		//Greeting
		System.out.println(msg1);
		
		//Get User's Name
		System.out.println(msg2);
		String name = scanInput.nextLine();
		System.out.println(msg3 + name);
		
		//print today's date, balance and bid goodbye
		System.out.println(msg4+ DateFormat.getDateInstance(DateFormat.SHORT, currentLocale).format(today));
		System.out.println(msg5+" "+NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21));
		System.out.print(msg6);
	}
	
	public static String getLanguageMessage(String message, Locale locale){
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", locale);
		return bundle.getString(message);
	}
}