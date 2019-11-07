/**
 * Created by hp on 9/9/2019.
 */
public class RetirementAccount extends Account {

    //field
    private double balance;

    //constructor
    public RetirementAccount(Employee emp, double balance) {
        super(emp,balance);
    }

    //withdraw
    @Override
    public boolean makeWithdrawal(double amount){

        double baseBalance = super.getBalance();
        double penalty = baseBalance * 0.02;
        double withdrawAmount = amount + penalty;

        if(withdrawAmount < baseBalance ){
            baseBalance -= withdrawAmount;
            return true;
        }else{
            System.out.println("Insufficient Funds");
        }
        return false;
    }


    public double makingWithdrawal(double amount){

        double baseBalance = super.getBalance();
        double penalty = balance * 0.02;
        double withdrawAmount = amount + penalty;

        if(withdrawAmount < balance ){
            baseBalance -= withdrawAmount;
            return baseBalance;
        }else{
            System.out.println("Insufficient Funds");
        }
        return 0.0;
    }

    //account Type
    public String getAcctType(){
        return "RETIREMENT";
    }


}
