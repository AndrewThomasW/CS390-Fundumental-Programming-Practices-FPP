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
import java.util.Scanner;
    public class Main {
        //fields

        Employee[] emps = null;
        public static void main(String[] args) {

            new Main();
        }

        Main(){
            emps = new Employee[3];
            emps[0] = new Employee("Jim Daley", 2000, 9, 4);
            emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
            emps[2] = new Employee("Susan Randolph", 1997, 2,13);

            emps[0].createNewChecking(10500);
            emps[0].createNewSavings(1000);
            emps[0].createNewRetirement(9300);
            emps[1].createNewChecking(34000);
            emps[1].createNewSavings(27000);
            emps[2].createNewChecking(10038);
            emps[2].createNewSavings(12600);
            emps[2].createNewRetirement(9000);

            // for phase I – console output
            Scanner sc = new Scanner(System.in);
            System.out.print("See a report of all account balances? (y/n) ");
            String answer = sc.next();
            if(answer.equalsIgnoreCase("y")){
                String info = getFormattedAccountInfo();
                System.out.println(info);
            }
        }


        String getFormattedAccountInfo() {

            StringBuffer accountInfo = new StringBuffer();

            for(Employee employee : emps){
                accountInfo.append(employee.getFormattedAcctInfo());
            }

            return accountInfo.toString();
        }
    }


