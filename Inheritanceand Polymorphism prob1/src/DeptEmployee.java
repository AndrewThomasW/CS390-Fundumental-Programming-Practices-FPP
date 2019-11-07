/**
 * Created by hp on 9/9/2019.
 *
 * Programming Assignment 5-1

 A university department consists of professors and secretaries. Each professor and each secretary has a name, a salary, and a hire date. Use inheritance and polymorphism to create an application that represents the department and its professors and secretaries as objects, and provides a test class that creates 3 professors and 2 secretaries, and then outputs the combined total of all of their salaries.

 Start by creating classes

 Professor
 Secretary
 DeptEmployee

 having the following relationship:










 Place instance fields and corresponding accessor/mutator methods in DeptEmployee to represent name and hire date (do not create accessors or mutators for salary). Do not put these fields in either the Professor or Secretary class. Also place in the Professor class an int field numberOfPublications, with corresponding accessor and mutator methods. Place in the Secretary class a double field overtimeHours, also with corresponding accessor and mutator methods.

 Place a computeSalary method in DeptEmployee which simply returns the value stored in salary. Override the computeSalary method in Secretary so that the return value is the sum of the value of salary plus 12 times the number of overtime hours.

 Then in the main method of a class named MainClass, create three instances of  Professor and two instances of Secretary (you can invent the values to pass into the constructor). In each of the Professor instances, set the value of numPublications to 10. And in each of the Secretary instances, set overtimeHours to 200. Finally, create an array of department employees:

 DeptEmployee[ ] department = new DeptEmployee [5];

 and then populate the array with the Professor and Secretary instances you have just created. Then ask the user if he/she wishes to see the sum of all salaries in the department. If the user responds "Y", then loop through the department array and polymorphically read, and sum, all salaries, and output the result to the console.


 2)  Add an  Administrator  class to the above class diagram and implement this class with the appropriate  computeSalary method.  Their salary is number of hours worked times 20.


 3)  Ask the user if he/she would like to search for the details of an employee.
 If  they say yes, find the person by going through the array, and output all of the
 data for that person.  Use the ‘name’ to find the person.  Assume that the name is
 always unique for this very small application.



 */

import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee {
    //fields
    private String name;
    private double salary;
    private Date hireDate;

    //constructor
    public DeptEmployee(String name,double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        GregorianCalendar cal = new GregorianCalendar(year,month,day);
        this.hireDate = cal.getTime();
    }

    //Accessor or getter methods
    public String getName(){
        return name;
    }

    public Date getDHireDate(){
        return hireDate;
    }
        //compute salary method
    public double computeSalary(){
        return salary;
    }
        //toString method
    public String toString(){

        StringBuffer data = new StringBuffer();

        data.append("\nEMPLOYEE DETAILS FOR " + name + "\n\n");
        data.append("Name:       " + name + "\n");
        data.append("Salary:     " + salary +"\n");
        data.append("Hire date:  " + hireDate);

        return data.toString();
    }

    //Mutator or Setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setDate(Date hireDate){
        this.hireDate = hireDate;
    }



}
