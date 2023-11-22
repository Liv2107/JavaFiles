/**
 * Contains the displayMenuOption and contains thrown exceptions.
 * 
 * @author 123ol
 *
 */
public class Menu {
	
	/*
	 * displayMenuOption parses an integer, checks its range (1-3).
	 * If the @param doesnt fall between 1 and 3 then an exception is @throws.
	 * The exceptions are handled in another class 'InvalidOptionException'.
	 */
	void displayMenuOption(int opt) throws InvalidOptionException{
		
		if(opt > 0 & opt <= 3) {
			System.out.println("Menu option "+ opt + " selected");
		}
		else {
			throw new InvalidOptionException("The option must be between 1 and 3");
		}
	}
	
	
}
