/* 1)  Create a Java method

static int min(int[] arrayOfInts)

that outputs the minimum of an array of ints. Create a main method that tests your
method on the following input array

[2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22]

Test your method and make sure it works!
*/

package lesson3;

public class Minimum {
	public static void main(String[] args) {
		
		int[] array = {2,-21,3,45,0,12,18,6,3,1,0,-22};
		
		System.out.println("Minimum = " + min(array));
	}
	
	// method to obtain minimum of an array of ints
	public static int min(int[] arrayOfInts) {
		
		int min = arrayOfInts[0];
		
		for(int element : arrayOfInts ) {
			if(element < min) min = element;
		}
		
		return min;
	}
}
