/**
 * Created by hp on 9/5/2019.
 * <p/>
 * 4. Create a class Main having a main method that does the following:
 * a. It creates a new Employee object employee (you can invent your own
 * arguments for the constructor)
 * b. Then it creates a checking account, savings account and retirement account for
 * employee, each with a starting balance of $300.
 * c. Then it prints to the console the account data for each of these accounts (making
 * use of the toString() method that has been provided in Account)
 * <p/>
 * 5. Correct the implementation of getHireDay() in Employee, as discussed in the lecture.
 * (Use a  GregorianCalendar  object to hold the data.)
 */
public class Main {
    public static void main(String[] args) {

        // employee object
        Employee employee = new Employee("Andrew Walugembe", 100000, 2020, 05, 01);

        // Account Objects
        Account checking = new Account(employee,Account.CHECKING, 300);
        Account savings = new Account(employee,Account.SAVINGS, 300);
        Account retirement = new Account(employee,Account.RETIREMENT, 300);

        //printing account data
        System.out.println(checking.toString());
        System.out.println(savings.toString());
        System.out.println(retirement.toString());

        System.out.println(employee.getHireDay());

        System.out.println(savings.computeInterest());
    }
}
