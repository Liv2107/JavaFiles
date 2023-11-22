/**
 * Creating a new exception - creating a class that extends the exception class.
 * 
 * @author 123ol
 *
 */
public class InvalidOptionException extends Exception {
	
	/*
	 * This method returns a message after the exception has been thrown.
	 * @param returns a message showing why the exception has been thrown.
	 */
	InvalidOptionException(String msg){
		
		super(msg);
	}
}
