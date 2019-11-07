/**
 * Created by hp on 9/9/2019.
 */
public class SavingsAccount extends Account {
    public static final double INTEREST = 0.25;
    // constructor
    public SavingsAccount(Employee emp,double balance){
        super(emp,balance);
    }

    //balance
    public double getBalance(){
        double baseBalance = super.getBalance();
        double interest = baseBalance * (SavingsAccount.INTEREST/100);
        return baseBalance + interest;
    }

    //account type
    public String getAcctType(){
        return "SAVINGS";
    }
}
