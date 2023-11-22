import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*** 
 * This class takes a sentence as an input, splits it up into individual words and counts how many times that word is present.
 * 
 * @author 123ol
 *
 */
public class WordCounter {
	
	int count = 0;
	
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();
	
	/*
	 * After the sentence has been split each word processes through this procedure.
	 * The key 'word' is checked to see if it is already present in the HashMap.
	 * If it was the value is increased by 1, if not a new key value is made.
	 */
	private void addWord(String word) {
		
		if(wordMap.containsKey(word)) {
			count = wordMap.get(word) + 1;
			wordMap.put(word, count);
		}
		else {
			wordMap.put(word, 1);
		}
	}
	
	/*
	 * Here is where the sentence is split up to be processed by the addWord method.
	 */
	public void addSentence(String sentence) {
		
		String[] splitted = sentence.split("\\s+");
		
		for(String split : splitted) {
			addWord(split);
		}
	}
	
	/*
	 * This method iterates over the key value pair extracting them individually and displaying them to the screen.
	 */
	public void outputResults() {
		
		for (Entry<String, Integer> entry : wordMap.entrySet()) {
			
			String word = entry.getKey();
			int number = entry.getValue();
			
			System.out.println(word + " : " + number);
			
		}
	}
	
	
	
	

}
