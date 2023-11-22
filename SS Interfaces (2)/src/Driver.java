
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		
		WordProcessor obj = new WordProcessor();
		// Counter obj = new WordProcessor();      This can also be used as WordProcessor implements counter.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input some text...");
		String input = scan.nextLine();
		
		if(obj.isEmpty(input) == false){
			System.out.println("You havent inputted a value.\nThe new sentence = Hello World");
			input = obj.getText();

		}
		
		obj.countLetters(input);
		obj.getLength(input);
		obj.countWords(input);
	}

}
