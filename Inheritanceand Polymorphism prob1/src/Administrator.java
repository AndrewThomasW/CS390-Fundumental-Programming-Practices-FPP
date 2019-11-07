/**
 * Created by hp on 9/9/2019.
 */
public class Administrator extends DeptEmployee {
    //fields
    private int numberOfHoursWorked;

    //constructor
    public Administrator(int numberOfHoursWorked,String name, double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    //compute Salary
    public double computeSalary(){
        return (numberOfHoursWorked * 20);
    }
    //toString() method
    public String toString(){
        return super.toString() + "\n" +
                "Number Of Hours Worked: " + numberOfHoursWorked;
    }
}
