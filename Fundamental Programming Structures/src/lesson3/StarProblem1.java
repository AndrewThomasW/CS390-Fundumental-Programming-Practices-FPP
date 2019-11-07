package lesson3;

/**
 * Created by hp on 9/7/2019.
 * Star Problems  :  a)
 Prompt the user for a number, for the length on the bottom of a picture.
 For example, say they input 6. The picture would look like :
 (Definitely do this first one for the midterm.)

 *
 **
 * *
 *   *
 *     *
 ****** */

import java.util.Scanner;

public class StarProblem1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		int length = sc.nextInt();

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i == j || j == 0 || i == (length - 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
		
		sc.close();

	}
}
