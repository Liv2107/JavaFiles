
/**
 * The driver class allows me to retrieve the data from the EmailStore and WordCounter class.
 * Here is where the objects are created and methods are implemented.
 * 
 * @author 123ol
 *
 */

public class Driver {
	
	public static void main(String[] args) {
		
		EmailStore emails = new EmailStore();
		
		System.out.println(emails.addEmail("olivia@olivia.com"));  // returns true.
		emails.addEmail("isabel@notley.org");
		emails.addEmail("max@max.com");
		System.out.println(emails.addEmail("olivia@olivia.com"));  // returns false.
		
		System.out.println(emails.hasEmail("max@max.com"));        // returns true.
		
		emails.displayEmails();
		
		// WordCounter class...
		
		WordCounter words = new WordCounter();
		
		words.addSentence("This sentence has the word has in it twice");
		words.outputResults();
	}

}
