package lesson3;

/**
 * Created by hp on 9/7/2019.
 *
 * On page 99, there is table 3-8. We will only use the top three rows. Create a
 * two dimensional table with 3 rows and 6 columns. Put the data from the top 3
 * rows of table 3-8 into your table.
 * 
 * a) Print out the average of each row. b) Print out the average of each column
 * 
 */

public class MultiDimensionalArrays {
	public static void main(String[] args) {

		// creating 2 dimensional table
		double[][] balances = new double[3][6];

		// putting data

		for (int i = 0; i < balances[0].length; i++) {
			balances[0][i] = 10000.00;
		}

		for (int i = 1; i < balances.length; i++) {
			double rate = 10;
			for (int j = 0; j < balances[i].length; j++) {
				double oldBal = balances[i - 1][j];
				double interest = oldBal * (rate / 100);
				balances[i][j] = oldBal + interest;
				rate++;
			}
		}

		// (a) print out the average of each row
		double sumRow = 0;
		for (int i = 0; i < balances.length; i++) {
			sumRow = 0;
			for (int j = 0; j < balances[i].length; j++) {
				sumRow += balances[i][j];
			}
			System.out.println("Average of row " + (i + 1) + " = " + sumRow / balances[0].length);
		}

		System.out.println();

		// (b) printing the average of each column
		double sumCol = 0;
		for (int i = 0; i < balances[0].length; i++) {
			sumCol = 0;
			for (int j = 0; j < balances.length; j++) {
				sumCol += balances[j][i];
			}
			System.out.println("Average of column " + (i + 1) + "=" + sumCol / balances.length);
		}

	}
}
