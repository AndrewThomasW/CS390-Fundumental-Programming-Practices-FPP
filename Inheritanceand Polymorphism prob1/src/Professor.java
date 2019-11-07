/**
 * Created by hp on 9/9/2019.
 */
public class Professor extends DeptEmployee {

    //fields
    private int numberOfPublications;

    //constructor
    public Professor(int numberOfPublications,String name,double salary, int year,int month,int day){
        super(name,salary,year,month,day);
        this.numberOfPublications = numberOfPublications;
    }

    //Accessor or getter methods
    public int getNumberOfPublications(){
        return numberOfPublications;
    }
        //toString() method
    public String toString(){
        return super.toString() + "\n" +
                "Number Of Publications: " + numberOfPublications;
    }

    //Mutator or setter methods
    public void setNumberOfPublications(int numberOfPublications){
        this.numberOfPublications = numberOfPublications;
    }
}
