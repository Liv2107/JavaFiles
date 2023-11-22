
public interface Counter {
	
	public int countWords(String sentence);       // how many words?
	public int countLetters(String sentence);     // how many letters?
	public int getLength(String sentence);        // how long is the whole sentence?
	
	
	Counter wordProcessor = new WordProcessor();

}
