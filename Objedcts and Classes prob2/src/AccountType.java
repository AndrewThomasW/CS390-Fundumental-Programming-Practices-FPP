/**
 * Created by hp on 9/5/2019.
 *
 * Extra Credit :

 Read about enum and do the following.

 1. Refactor the Account class so that the three account types CHECKING, SAVINGS,
 RETIREMENT, are the three instances of an enumerated type called AccountType;
 like Java classes, the enum should be placed in a separate file. After defining this enum
 and removing the account types from the Account class, make the necessary changes to
 instance variables and the constructors of Account.


 */
public enum AccountType {

    CHECKING("checking"),
    SAVINGS("savings"),
    RETIREMENT("retirement");

    //fields
    private String acctName;

    //constructor
    AccountType(String type){
        this.acctName = type;
    }

    //method to get String value of enum constant
    public String getName(){
        return acctName;
    }

}
