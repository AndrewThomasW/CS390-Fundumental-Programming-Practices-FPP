package lesson3;
import java.util.Scanner;

public class AppendByeOppositeCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word  :");	
		StringBuffer word = new StringBuffer(sc.nextLine());
	
		//(a)
		System.out.println(appendBye(word));
		
		//(b)
		oppositeCase(word);
		
		sc.close();
	}
	
	
	//(a) append bye method
	
	public static StringBuffer appendBye(StringBuffer word) {
		
		StringBuffer appended = word.append("bye");
		return appended;
	}
	
	
	//b)	oppositeCase method
	
	public static void oppositeCase(StringBuffer word) {
		
		StringBuffer changed = word;
		for(int i = 0; i < changed.length(); i++) {
			
			Character c = changed.charAt(i);
			
			if(Character.isLowerCase(c)) {
				changed.replace(i, i+1, Character.toUpperCase(c)+ "");
			}else {
				changed.replace(i, i+1, Character.toLowerCase(c) + "");
			}
		}
		
		System.out.println(changed);
	}
	
}
