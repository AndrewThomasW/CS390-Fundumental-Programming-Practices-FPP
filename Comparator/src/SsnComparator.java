import java.util.Comparator;

/**
 * Created by hp on 9/20/2019.
 */
public class SsnComparator implements Comparator<Employee> {

    //compare method
    public int compare(Employee e1, Employee e2) {

        return e1.getSsn().compareTo(e2.getSsn());

    }


}
