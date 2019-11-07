package lesson3;

/**
 * Created by hp on 9/7/2019.
 */

import java.util.Scanner;

public class StarProblem2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int length = sc.nextInt();

		for (int i = length - 1; i >= 0; i--) {
			for (int j = 0; j < length; j++) {
				if (i == j || i == 0 || j == length - 1) {
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
