import java.util.Random;

/**
 * Adds random values to the {@link Stats.java} array and displays all values to the console.
 * 
 * @author 123ol
 *
 */

public class Driver {
	
	
	public static void main(String[] args) {
		
		final int VALUES = 10;

		Stats stats = new Stats(VALUES);
		Random random = new Random();
		
		for (int i = 0; i < VALUES; i++) {
			
			stats.addValue(random.nextInt(100));
		}

		System.out.println("Numbers stored : " + stats);
		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getLength());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMin());
		System.out.println("Maximum value = " + stats.getMax());
	}}