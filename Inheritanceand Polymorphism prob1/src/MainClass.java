/**
 * Created by hp on 9/9/2019.
 */

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){

        //instances of Professor
        Professor prof1 = new Professor(10,"Joseph Lerman",100000,2010,05,01);
        Professor prof2 = new Professor(10,"Anne McCollum",100000,2017,07,01);
        Professor prof3 = new Professor(10,"Renuka Mohanraj",100000,2018,06,05);

        //instances of secretary
        Secretary sec1 = new Secretary(200,"Tracy Susan",100000,2009,05,03);
        Secretary sec2 = new Secretary(200,"Ungaro Marilyn",100000,2012,06,03);

        //creating an array of department employees
        DeptEmployee[] employees = new DeptEmployee[5];

        //populating the array
        employees[0] = prof1;
        employees[1] = prof2;
        employees[2] = prof3;
        employees[3] = sec1;
        employees[4] = sec2;

        //QUESTION1 TO USER
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to see the sum of all salaries" + " in the department?  (y/n) :");

        String response = sc.nextLine();

        if(response.equals("y")){

            double sum = 0;
            for(DeptEmployee employee : employees){
                sum += employee.computeSalary();
            }

            System.out.println("The sum of all department employee salaries is $ " + sum );
        }

        System.out.println();

        //QUESTION2 TO USER
        System.out.println("Would you like to search for details of an Employee?, Enter their Name: ");
        String name = sc.nextLine();

        for(DeptEmployee employee : employees){
            String employeeName = employee.getName();

            if(employeeName.equals(name)){
                System.out.println(employee.toString());
            }
        }




    }
}
