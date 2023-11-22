
import java.util.Arrays;

/**
 * Adds values to an array and finds different values including array length, total,
 * average, max and min values.
 * 
 * @author 123ol
 *
 */

public class Stats {

	private int[] numbers;
	private int count;

	/**
	 * Adding values to the array.
	 * 
	 * @param value is a random value as we can @see Stats.java
	 */
	public void addValue(int value) {
		
		numbers[count] = value; // Adds a value to the end of the array.
		count++;
		}

	/**
	 * @return the length of the array.
	 */
	public int getLength() {
		
		return numbers.length;
	}

	/**
	 * @return the maximum value in the array.
	 */
	public int getMax() {

		int max = numbers[0];	

		for (int i = 1; i < numbers.length; i++) { 
			if (numbers[i] > max)				
				max = numbers[i];		
			}
		return max;
	}

	/**
	 * @return the minimum value of the array.
	 */
	public int getMin() {
		
		int min = numbers[0]; 

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min)
				min = numbers[i];
			}
			return min;
		}
	
	/**
	 * All values added together.
	 * 
	 * @return the total of the array.
	 */
	public int getTotal() {
		
		int total = 0;
		
		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}		
		return total;
	}
	
	/**
	 * total/count = average
	 * 
	 * @return the average of the array.
	 */
	public double getAverage() {
		
		int count = 0;
				
		for (int i = 0; i < numbers.length; i++) {
			count += numbers[i];
		}
		double total = count/(double)numbers.length;
		
		return total;
	}

	/**
	 * Prints each value in the array as a string.
	 */
	@Override
	public String toString() {
		
		return Arrays.toString(numbers);
	}

	/**
	 * Changes the capacity of the array.
	 * @param capacity creates the bounds of the array.
	 */
	public Stats(int capacity) {
		
		numbers = new int[capacity];
	}
}