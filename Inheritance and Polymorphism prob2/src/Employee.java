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

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;

public class Employee {

    //fields

    private ArrayList<Account> accounts;
    private String name;
    private Date hireDate;
    //private LocalDate hireDay;

    public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
        this.name = name;
        GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
        this.hireDate = cal.getTime();
        //this.hireDate = LocalDate.of(yearOfHire,monthOfHire,dayOfHire);

        accounts = new ArrayList<Account>();
    }

    public void createNewChecking(double startAmount) {
        CheckingAccount checking = new CheckingAccount(this,startAmount);
        accounts.add(checking);
    }

    public void createNewSavings(double startAmount) {
        SavingsAccount save = new SavingsAccount(this,startAmount);
        accounts.add(save);
    }

    public void createNewRetirement(double startAmount) {
        RetirementAccount retire = new RetirementAccount(this,startAmount);
        accounts.add(retire);
    }

    public void deposit(String acctType, double amt) {

        for(Account account : accounts){
            if(acctType.equals(account.getAcctType()))
            account.makeDeposit(amt);
        }
    }

    public boolean withdraw(String acctType, double amt) {
        for(Account account : accounts){
            if(acctType.equals(account.getAcctType()))
                account.makeWithdrawal(amt);
        }
        return false;
    }

    public String getFormattedAcctInfo() {

        StringBuffer acctInfo = new StringBuffer();
        acctInfo.append("\n ACCOUNT INFO FOR " + name + " :\n\n");

        for(Account account : accounts){
            String info = account.toString();
            acctInfo.append(info);
        }

        return acctInfo.toString();
    }

    //getName method
    public String getName(){
        return name;
    }
    //totalOfAllBalances
    public double totalOfAllBalances(){

        double total = 0;
        for(Account account : accounts){
            total += account.getBalance();
        }
        return total;
    }

}

