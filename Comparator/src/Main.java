/**
 * Created by hp on 9/20/2019.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Employee e1 = new Employee("BBB", 5, "321-45-6548");
        Employee e2 = new Employee("AAA", 1, "569-78-6543");
        Employee e3 = new Employee("CCC", 3, "125-64-5589");


        list.add(e1);
        list.add(e2);
        list.add(e3);

        System.out.println("Before sort: ");
        for (int i = 0; i < list.size(); i++) {
            Employee e = (Employee) list.get(i);
            System.out.println(e.getName());
        }

        // ssn comparator

        SsnComparator comparator = new SsnComparator();

        Collections.sort(list, comparator);

        System.out.println("After sort by Social Security Number (ssn): ");
        for (int i = 0; i < list.size(); i++) {
            Employee e = (Employee) list.get(i);
            System.out.println(e.getName());
        }


        Collections.sort(list, Employee.NAME);

        System.out.println("After sort by Name: ");
        for (int i = 0; i < list.size(); i++) {
            Employee e = (Employee) list.get(i);
            System.out.println(e.getName());
        }

        Collections.sort(list, Employee.AGE);

        System.out.println("After sort by Age: ");
        for (int i = 0; i < list.size(); i++) {
            Employee e = (Employee) list.get(i);
            System.out.println(e.getName());
        }


    }

}


/*  The ouput looks like the following with some minor changes to the text
    Every time it compares 2 items the comparator method is called!!    JL 07-2011

Before sort:
BBB
AAA
CCC
Name comparator is Employee$1
class Employee$1
Name comparator is Employee$1
class Employee$1
After sort by Name:
AAA
BBB
CCC
Age Comparator is  class Employee$2
Age Comparator is __ Employee$2
Age Comparator is  class Employee$2
Age Comparator is __ Employee$2
Age Comparator is  class Employee$2
Age Comparator is __ Employee$2
After sort by Age:
AAA
CCC
BBB

*/