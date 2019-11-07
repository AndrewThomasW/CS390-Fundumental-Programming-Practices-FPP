package lesson3;

/*2)  Do the same as above but instead of the minimum find the average of the numbers in the array.  Test it.*/

public class Average {
	public static void main(String[] args) {
		
		int[] array = {2,-21,3,45,0,12,18,6,3,1,0,-22};
		
		System.out.println("Average = " + avg(array));
	}
			

	
	// method to obtain average of an array of ints
	public static double avg(int[] arrayOfInts) {
		
		double sum = 0;
		double average = 0.0;
		
		for(int element :arrayOfInts) {
			sum += element;
		}
		
		average = sum / arrayOfInts.length;
		return average;
	}
	
}
