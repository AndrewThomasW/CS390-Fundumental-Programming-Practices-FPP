
/**
 * Created by hp on 9/20/2019.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args){


        Map<String,String> map = new HashMap<>();

        map.put("John Smith","641-472-1111");
        map.put("Andrew","256-472-1111");
        map.put("Thomas Smith","641-472-4444");
        map.put("Gilbert","641-472-1192");
        map.put("John mitti","641-472-1131");
        map.put("Jim Smith","641-472-1561");
        map.put("lius Smith","641-472-1188");
        map.put("John lule","641-4852-1111");
        map.put("John Bosco","651-472-1111");
        map.put("John Bobi","741-472-1112");

        printNamesAndPhoneNumbers(map);
        System.out.println("\nnumber of elements = " + numberOfElementsInMap(map));
    }

    public static void printNamesAndPhoneNumbers(Map<String,String> map){

        Map.Entry<String,String> e = null;

        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();

        while(it.hasNext()){
            e = it.next();
            System.out.println( e.getKey() + " -> " + e.getValue());
        }
    }
    public static int numberOfElementsInMap(Map<String,String> map){

        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();

        int count = 0;
        while(it.hasNext()){
            count++;
            it.next();
        }
        return count;
    }

}













