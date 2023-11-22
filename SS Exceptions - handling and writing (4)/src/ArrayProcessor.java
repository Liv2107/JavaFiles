/**
 * ArrayProcessor takes in an array and iterates it through a while loop to count how many elements it holds.
 * 
 * @author 123ol
 *
 */
public class ArrayProcessor {
	
	/*
	 * getArrayLength is the only method in this class that carries out the iterating and count.
	 */
	public int getArrayLength(Object[] elements) {
		
		int count = 0;
		
		while(true) {
			
			try{
				Object element = elements[count];
				count++;
				
			}catch(ArrayIndexOutOfBoundsException e) {  // dealing with possible exception.
				break;
			}					
		}
		return count;
	}
}

// Why is this not the appropriate use of exception handling.

// Things like counting through arrays can be done more simpily using code already created in libaries.
// a.length
