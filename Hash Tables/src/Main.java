import java.util.Iterator;

/**
 * Created by hp on 9/19/2019.
 */
public class Main {
    public static void main(String[] args){

        MyHashTable table = new MyHashTable();

        table.put("John Smith","641-472-1111");
        table.put("Andrew","256-472-1111");
        table.put("Thomas Smith","641-472-4444");
        table.put("Gilbert","641-472-1192");
        table.put("John mitti","641-472-1131");
        table.put("Jim Smith","641-472-1561");
        table.put("lius Smith","641-472-1188");
        table.put("John lule","641-4852-1111");
        table.put("John Bosco","651-472-1111");
        table.put("John Bobi","741-472-1112");
        //table.put("John Bobi","741-472-1112");




        //printing
        //System.out.println(table.toString());
        //counting elements
        //System.out.println("mumber of elements = " + table.countElements());
        //System.out.println("number of elements in the longest LinkedList chain = " + table.sizeOfLongestChain());
        //System.out.println("number of empty array cells = " + table.numberOfEmptyArrayCells());
        //table.searchName();
    }
}
