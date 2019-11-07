/**
 * Created by hp on 9/9/2019.
 */
public class Secretary extends DeptEmployee {
    //fields
    private double overtimeHours;

    //constructor
    public Secretary(double overtimeHours,String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        this.overtimeHours = overtimeHours;
    }

    //Accessor or getter methods
    public double getOvertimeHours(){
        return overtimeHours;
    }
        //compute salary method
    public double computeSalary(){
        return super.computeSalary() + (12 * overtimeHours);
    }
        //toString() method
    public String toString(){
        return super.toString() + "\n" +
                "Overtime Hours: " + overtimeHours;
    }

    //Mutator or setter methods
    public void setOvertimeHours(double overtimeHours){
        this.overtimeHours = overtimeHours;
    }
}
