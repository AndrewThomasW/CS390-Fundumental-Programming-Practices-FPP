/**
 * Created by hp on 9/9/2019.
 */
public class CheckingAccount extends Account{

    //constructor
    public CheckingAccount(Employee emp,double balance){
        super(emp,balance);
    }

    //balance
    public double getBalance(){
        double baseBalance = super.getBalance();
        baseBalance -= 5;
        return baseBalance;
    }

    //balance
    public String getAcctType(){
        return "CHECKING";
    }

}
