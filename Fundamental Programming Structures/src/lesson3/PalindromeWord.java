package lesson3;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeWord {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a palindrome word  :");
		String word = sc.nextLine();
		
		isPalindrome(word);
		sc.close();
		
	}
	
	//isPalindrome method
	
	public static void isPalindrome(String word) {
		
		char[] foward = new char[word.length()];
		char[] backwards = new char[word.length()];
		int f = 0, b = 0;
		
		for(int i = 0; i < word.length(); i++) {
			foward[f] = word.charAt(i);
			f++;
		}
		
		for(int j = word.length() - 1 ; j >= 0; j--) {
			backwards[b] = word.charAt(j);
			b++;
		}
				
		if(Arrays.equals(foward, backwards)) {
			System.out.println("The word is Palindrome");
		}else {
			System.out.println("The word is  NOT Palindrome");
		}
		
		
	}
}
