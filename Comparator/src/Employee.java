/**
 * Created by hp on 9/20/2019.
 */

import java.util.Comparator;


public class Employee {
    private String name;
    private int age;
    private String ssn;

    public Employee(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }


    public static final Comparator NAME = new Comparator() {
        public int compare(Object o1, Object o2) {

            System.out.println("Name comparator is " + NAME.getClass().getName());

            System.out.println(NAME.getClass());

            String name1 = ((Employee) o1).getName();
            String name2 = ((Employee) o2).getName();
            return name1.compareTo(name2);
        }
    };

    public static final Comparator AGE = new Comparator() {
        public int compare(Object o1, Object o2) {

            System.out.println("Age Comparator is  " + AGE.getClass());

            Integer age1 = new Integer(((Employee) o1).getAge());
            Integer age2 = new Integer(((Employee) o2).getAge());
            return age1.compareTo(age2);
        }
    };

}
