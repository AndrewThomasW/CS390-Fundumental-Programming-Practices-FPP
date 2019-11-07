package lesson3;

/**
 * Created by hp on 9/7/2019.
 * :  1)  Write an application that determines if an input sentence is a palindrome, for
 * example,  “A man, a plan, a canal, Panama!”
 * You ignore the punctuation marks, blanks, and the case (upper or lower) of the letters.
 * Test your program THOROUGHLY!
 */

import java.util.ArrayList;
import java.util.Scanner;

public class isPalindromeSentence {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input a sentence");
		String sentence = sc.nextLine();

		System.out.println(isPalindrome(sentence));
		sc.close();
	}

	// method
	public static boolean isPalindrome(String sentence) {

		if (sentence == null)
			return false;

		ArrayList<Character> forward = new ArrayList<Character>();
		ArrayList<Character> backward = new ArrayList<Character>();

		for (int i = 0; i < sentence.length(); i++) {

			Character c = sentence.charAt(i);

			if (Character.isLetter(c)) {
				c = Character.toLowerCase(c);
				forward.add(c);
			}
		}

		for (int j = sentence.length() - 1; j >= 0; j--) {

			Character c = sentence.charAt(j);

			if (Character.isLetter(c)) {
				c = Character.toLowerCase(c);
				backward.add(c);
			}
		}

		return forward.equals(backward);
	}
}
