/**
 * Created by hp on 9/5/2019.
 * <p/>
 * In this exercise, you will extend the functionality of the Employee class that was
 * mentioned in the book and lecture slides. For this exercise, we imagine that the bank
 * (a "credit union") provides services to employees of our (imaginary) company for three
 * kinds of accounts: savings, checking, and retirement. We will therefore equip our
 * Employee class with one instance field for each type of account. (In a real application,
 * we would implement multiple accounts by storing them in some kind of List container
 * – more on this later.)  You will use the Account class that you developed in Lab 4-1
 * in conjunction with this version of Employee.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Employee[] emps = null;

    public static void main(String[] args) {

        new Main();
    }

    Main() {
        emps = new Employee[3];
        emps[0] = new Employee("Jim Daley", 2000, 9, 4);
        emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
        emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

        emps[0].createNewChecking(10500);
        emps[0].createNewSavings(1000);
        emps[0].createNewRetirement(9300);
        emps[1].createNewChecking(34000);
        emps[1].createNewSavings(27000);
        emps[2].createNewChecking(10038);
        emps[2].createNewSavings(12600);
        emps[2].createNewRetirement(9000);


        ArrayList<Employee> arr2 = new ArrayList<>();

        for(Employee e :emps){
            arr2.add(e);

            //System.out.println( e.getName() + " : " + e.totalOfAllBalances());
        }

        System.out.println();
        System.out.println( "Total for All Employees = " + forAllEmployeesTotalOfBalances(arr2));








        /*while(true){

            // for phase I – console output
            Scanner sc = new Scanner(System.in);

            System.out.print("A. See a report of all accounts.\n" +
                    "B. Make a deposit.\n" +
                    "C. Make a withdrawal.\n" +
                    "Make a selection (A/B/C):\n");

            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("A")) {

                String info = getFormattedAccountInfo();
                System.out.println(info);

            } else if (answer.equals("B")) {

                for(int i = 0; i < emps.length ; i++){
                    System.out.println(i + ". " + emps[i].getName() );
                }
                System.out.println("Select an employee: (type a number) \n");

                int answer2 = sc.nextInt();
                Employee employee = null;

                if (answer2 == 0) employee = emps[0];
                if (answer2 == 1) employee = emps[1];
                if (answer2 == 2) employee = emps[2];

                System.out.println("0. checking\n" +
                        "1. savings\n" +
                        "2. retirement\n" +
                        "Select an account: (type a number) 1\n");

                int answer3 = sc.nextInt();

                System.out.println("Deposit amount: 300.00 \n");
                String acctType = "";

                if (answer3 == 0) acctType = "CHECKING";
                if (answer3 == 1) acctType = "SAVINGS";
                if (answer3 == 2) acctType = "RETIREMENT";

                employee.deposit(acctType, 300);

                System.out.println("$300.0 has been deposited in the \n" +
                        "savings account of " + employee.getName() + "\n");

            } else if (answer.equals("C")) {

                for(int i = 0; i < emps.length ; i++){
                    System.out.println(i + ". " + emps[i].getName() );
                }
                System.out.println("Select an employee: (type a number) \n");

                int answer4 = sc.nextInt();
                Employee employee = null;

                if (answer4 == 0) employee = emps[0];
                if (answer4 == 1) employee = emps[1];
                if (answer4 == 2) employee = emps[2];

                System.out.println("0. checking\n" +
                        "1. savings\n" +
                        "2. retirement\n" +
                        "Select an account: (type a number) 1\n");

                int answer5 = sc.nextInt();

                System.out.println("Withdraw amount: 300.00 \n");
                String acctType = "";

                if (answer5 == 0) acctType = "CHECKING";
                if (answer5 == 1) acctType = "SAVINGS";
                if (answer5 == 2) acctType = "RETIREMENT";

                employee.withdraw(acctType, 300);

                System.out.println("$300.0 has been withdrawn in the \n" +
                        "savings account of " + employee.getName() + "\n");

            }

        }*/
            /*String info = getFormattedAccountInfo();
            System.out.println(info);*/

    }


    String getFormattedAccountInfo() {

        StringBuffer accountInfo = new StringBuffer();

        for (Employee employee : emps) {
            accountInfo.append(employee.getFormattedAcctInfo());
        }

        return accountInfo.toString();
    }

    public static double forAllEmployeesTotalOfBalances(ArrayList<Employee> arr2){

        double total = 0;
        for(Employee e : arr2){
            total += e.totalOfAllBalances();
        }
        return total;
    }

}


