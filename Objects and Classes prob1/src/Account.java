/**
 * Created by hp on 9/5/2019.
 *The Employee class discussed in the lecture is reproduced here. To create an instance of
 Account, you must pass in an Employee and a String name for an account type, and,
 optionally, the starting balance. If you do not specify a starting balance, then the default balance
 (which is defined by a constant, and initially set to the value 0.0) is used. The possible kinds of
 account type are indicated by three public static constants – CHECKING, SAVINGS, and
 RETIREMENT. These constants should always be used whenever an account type needs to be
 specified by name.

 In this assignment, do the following:

 1. Add the following methods to the Account class:
 //updates the balance field
 public void makeDeposit(double val);


 //updates the balance field and returns true, unless
 //withdrawal amount is too large; in that case,
 //it does not modify the balance field, and returns false
 public boolean makeWithdrawal(double amount)

 2. Add a public accessor method for the field acctType and balance.

 3.  Write a method to the Account class called ‘computeInterest’.
 The method returns the yearly interest amount for that account.
 If the account is a checking account then the interest  =  balance * 0.02
 If the account is a savings account then the interest  =  balance * 0.04
 If the account is a retirement account then the interest  =  balance * 0.05

 The signature and return type of the method is      double computeInterest();

 Test the method thoroughly!

 *
 */
class Account {
    public final static String CHECKING = "checking";
    public final static String SAVINGS = "savings";
    public final static String RETIREMENT = "retirement";
    private final static double DEFAULT_BALANCE = 0.0;

    private double balance;
    private String acctType;
    private Employee employee;

    Account(Employee emp, String acctType, double balance) {
        this.employee = emp;
        this.acctType = acctType;
        this.balance = balance;
    }

    Account(Employee emp, String acctType) {
        this(emp, acctType, DEFAULT_BALANCE);
    }

    public String toString() {
        return "type = " + acctType + ", balance = " + balance;
    }

    public void makeDeposit(double deposit) {
        balance += deposit;
    }

    /*updates the balance field and returns true, unless
    withdrawal amount is too large; in that case,
    it does not modify the balance field, and returns false*/

    public boolean makeWithdrawal(double amount) {

        if(amount < balance){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }

    //Accessor / getter  methods

    //acctType
    public String getAcctType(){
        return acctType;
    }

    //balance
    public double getBalance(){
        return balance;
    }

    //compute Interest method
    public double computeInterest(){

        if(acctType.equals(Account.CHECKING)){
            return (balance * 0.02);
        }else if(acctType.equals(Account.SAVINGS)){
            return ( balance * 0.04);
        }else if(acctType.equals(Account.RETIREMENT)){
            return (balance * 0.05);
        }else{
            return 0.0;
        }

    }
}
