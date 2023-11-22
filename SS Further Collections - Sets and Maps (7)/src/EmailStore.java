import java.util.HashSet;
import java.util.Set;

/**
 * 
 * This class manages a email system stored in an unordered hash set.
 * The hash set is stored in the computer as a hash table.
 * 
 * @author 123ol
 *
 */
public class EmailStore {
	
	Set<String> emailAddresses = new HashSet<String>(); // hash set.
	
	/*
	 * adds an email to the set and returns true if the email wasnt a duplicate.
	 */
	public boolean addEmail(String email) {
		
		return emailAddresses.add(email);
	}
	
	/*
	 * checks the set to see if an email is within it.
	 * This is needed as sets are unordered, using contains makes this method of approach more scalable.
	 */
	public boolean hasEmail(String email) {
		
		return emailAddresses.contains(email);
	}
	
	/*
	 * simple method to display all emails inputted into the set.
	 */
	public void displayEmails() {
		
		for(String email : emailAddresses) {
			System.out.println(email);
		}
	}

}
