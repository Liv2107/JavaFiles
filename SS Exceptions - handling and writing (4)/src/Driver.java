
public class Driver {
	
	public static void main(String[] args) {
		
		ArrayProcessor aProcessor = new ArrayProcessor();
		
		int len = aProcessor.getArrayLength(new String[] {"one", "two", "three"});
		
		System.out.println("Array length is: " + len);
		
		Menu menu = new Menu();
		
		try{
			menu.displayMenuOption(2);
			menu.displayMenuOption(3);
			menu.displayMenuOption(5);
			menu.displayMenuOption(7); // This wont be outputted as the exception has already happened.
		}
		catch (InvalidOptionException e) {
			System.out.println("Menu option invalid: " + e.getMessage());
		}
	}

}
