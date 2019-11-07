package lesson3;

/*3)  Write a program that reads a sentence and prints out the sentence with all uppercase letters changed to lowercase and all lowercase letters changed to uppercase.

      Hint :  Look at the API documentation for the  Character  class to see which methods 
      you can use.
*/
import java.util.Scanner;

public class oppositeCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence  :");
		System.out.println();
		
		StringBuffer sentence = new StringBuffer(sc.nextLine());
		
		opositeCase(sentence);
		sc.close();
	}
	
	//oppositeCase method
	public static void opositeCase(StringBuffer sentence) {
		
		StringBuffer changed = sentence;
		
		for(int i = 0; i < changed.length(); i++) {
			Character  c = changed.charAt(i);
			if(Character.isLowerCase(c)) {
				changed.replace(i,i+1,Character.toUpperCase(c) +"");
			}else {
				changed.replace(i,i+1,Character.toLowerCase(c) + "");
			}
		}
		
		System.out.println(changed);
		
	}
}
