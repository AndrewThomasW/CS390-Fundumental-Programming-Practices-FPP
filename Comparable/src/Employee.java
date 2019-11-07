/**
 * Created by hp on 9/20/2019.
 */
public class Employee implements Comparable{
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
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
    public int compareTo(Object arg0) {

        Integer age1 = ((Employee)arg0).getAge();

        Integer myAge = age;
        
        return myAge.compareTo(age1);



    }
}
