import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by hp on 9/5/2019.
 * <p/>
 * The Employee class from the lecture is given below.  Use that class and add a method to it called  yearlyFederalTax  which computes the yearly federal tax on the salary.
 * <p/>
 * The first line looks like   double  yearlyFederalTax ()
 * <p/>
 * Write the method.
 * <p/>
 * If the salary is greater than $80,000 then the tax is 28% of the salary.
 * If the salary is greater than $50,000 and  <=  $80,000  then the tax is 24% of the salary.
 * If the salary is greater than $26,000  and  <=  $50,000  then the tax is 20% of the salary.
 * If the salary is  <=  $26,000  then there is no tax.
 */

//same as the Employee class defined in the lecture
class Employee {

    //instance fields
    private String name;
    private double salary;
    private Date hireDay;

    //constructor
    Employee(String aName, double aSalary, int aYear,
             int aMonth, int aDay) {
        name = aName;
        salary = aSalary;
        GregorianCalendar cal =
                new GregorianCalendar(aYear, aMonth - 1, aDay);
        hireDay = cal.getTime();
    }

    // instance methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    //needs to be improved!!
    public Date getHireDay() {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(hireDay);   // takes date object

        return cal.getTime(); // returns date object
    }

    // computing yearly federal tax
    public double yearlyFederalTax(){

        double sal = salary;

        if(sal > 80000){
            return (0.28 * sal);
        }else if(sal > 50000 && sal <= 80000){
            return (0.24 * sal);
        }else if(sal > 26000 && sal <= 50000){
            return (0.2 * sal);
        }else{
            return 0;
        }
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    // main method
    public static void main (String[] args){

        //creating objects
        Employee emp1 = new Employee("Andrew",100000,2019,10,31 );
        Employee emp2 = new Employee("Gilbert",60000,2019,10,31 );
        Employee emp3 = new Employee("Gilbert",40000,2019,10,31 );
        Employee emp4 = new Employee("Joseph",20000,2019,10,31 );


        System.out.println("Federal Tax is " + emp1.yearlyFederalTax() + " which is 28 % of $" + emp1.getSalary());
        System.out.println("Federal Tax is " + emp2.yearlyFederalTax() + " which is 24 % of $" + emp2.getSalary());
        System.out.println("Federal Tax is " + emp3.yearlyFederalTax() + " which is 20 % of $" + emp3.getSalary());
        System.out.println("Federal Tax is " + emp4.yearlyFederalTax() + " which is  0 % of $" + emp4.getSalary());
    }


}

