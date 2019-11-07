package lesson3;

/**
 * Created by hp on 9/7/2019.
 */

import java.util.Scanner;

public class StarProblem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter odd number : ");
        int n = sc.nextInt();

        printPattern(n);

    }

    public static void printPattern(int rows) {
        int i, space, star = 0;
               /* printing one row in every iteration */
        for (i = 1; i < rows; i++) {
        /* Printing spaces */
            for (space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
        /* Printing stars */
            while (star != (2 * i - 1)) {
                if (star == 0 || star == 2 * i - 2)
                    System.out.print(" *");
                else
                    System.out.print("  ");
                star++;
                ;
            }
            star = 0;
        /* move to next row */
            System.out.println();
        }
    /* print last row */
        for (i = 0; i < 2 * rows - 1; i++) {
            System.out.print(" *");
        }
    }

}
