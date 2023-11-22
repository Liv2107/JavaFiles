
public class WordProcessor implements Counter{
	
	String text = "Hello World";
	
	public String getText() { // getter method
		
		return text;
	}
	public String setText(String text) { // setter method
		
		return this.text = text;
	}
	public int countLetters(String sentence) {
		
		int count = 0;
		for(int i = 0; i < sentence.length(); i++) {
			if (Character.isWhitespace(sentence.charAt(i))){
				continue;
			}
			else {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	public int getLength(String sentence) {
		
		System.out.println(sentence.length());
		return sentence.length();
	}
	public int countWords(String sentence) {
		
		System.out.println(sentence.split("\\s+").length);
		return sentence.split("\\s+").length;
	}
	public boolean isEmpty(String sentence) {
		
		if(sentence == (null)) {
			return true;
		}
		else {
			return false;
		}
	}
}
