/**
 * Created by hp on 9/6/2019.
 * <p/>
 * In this exercise, you will extend the functionality of the Employee class that
 * was mentioned in the book and lecture slides. For this exercise, we imagine that
 * the bank (a "credit union") provides services to employees of our (imaginary)
 * company for three kinds of accounts: savings, checking, and retirement.
 * We will therefore equip our Employee class with one instance field for each type
 * of account. (In a real application, we would implement multiple accounts by
 * storing them in some kind of List container – more on this later.)
 * You will use the Account class that you developed in Lab 4-1 in conjunction
 * with this version of Employee.
 */

import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;

public class Employee {

    private Account savingsAcct;
    private Account checkingAcct;
    private Account retirementAcct;

    private String name;
    private AccountType acctType;
    private Date hireDate;
    //private LocalDate hireDay;

    public Employee(String name, int yearOfHire,
                    int monthOfHire, int dayOfHire) {
        this.name = name;
        GregorianCalendar cal =
                new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
        hireDate = cal.getTime();
        //this.hireDate = LocalDate.of(yearOfHire,monthOfHire,dayOfHire);
    }

    public void createNewChecking(double startAmount) {
        this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
    }

    public void createNewSavings(double startAmount) {
        Account newAcct = new Account(this, AccountType.SAVINGS, startAmount);
        this.savingsAcct = newAcct;

    }

    public void createNewRetirement(double startAmount) {
        this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

    }

    public void deposit(AccountType acctType, double amt) {

        //if()
        //AccountType.valueOf("Checking");
        switch (acctType) {
            case CHECKING:
                this.checkingAcct.makeDeposit(amt);
                break;
            case SAVINGS:
                this.savingsAcct.makeDeposit(amt);
                break;
            case RETIREMENT:
                this.retirementAcct.makeDeposit(amt);
                break;
            default:
                System.err.println("Invalid AccountType");
        }
    }

    public boolean withdraw(AccountType acctType, double amt) {

        switch (acctType) {
            case CHECKING:
                this.checkingAcct.makeWithdrawal(amt);
                break;
            case SAVINGS:
                this.savingsAcct.makeWithdrawal(amt);
                break;
            case RETIREMENT:
                retirementAcct.makeWithdrawal(amt);
                break;
            default:
                System.err.println("Invalid AccountType");

        }
        return false;
    }

    public String getFormattedAcctInfo() {

        StringBuffer acctInfo = new StringBuffer();
        acctInfo.append("\n ACCOUNT INFO FOR " + name + " :\n\n");

        if (this.checkingAcct != null) acctInfo.append(checkingAcct.toString());
        if (this.savingsAcct != null) acctInfo.append(savingsAcct.toString());
        if ((this.retirementAcct != null)) acctInfo.append(retirementAcct.toString());

        return acctInfo.toString();
    }

}