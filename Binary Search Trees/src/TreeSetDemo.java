/**
 * Created by hp on 9/18/2019.
 */
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String args[]) {
        // Create a tree set
        TreeSet<String> ts = new TreeSet<String>();
        // Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);

        Iterator<String> it = ts.iterator();

        int countNodes = 0;
        while(it.hasNext()){
            System.out.print(it.next() + " ");
            countNodes++;
        }
        System.out.println();
        System.out.println("number of nodes = " + countNodes);
    }
}
