
/**
 * Created by hp on 9/19/2019.
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MyHashTable {
    //fields
    private static final int INITIAL_SIZE;

    static {
        INITIAL_SIZE = 19;
    }

    private int tableSize;
    private LinkedList[] table;

    //constructors
    public MyHashTable() {
        this(INITIAL_SIZE);
    }
    public MyHashTable(int tableSize) {
        this.tableSize = tableSize;
        table = new LinkedList[tableSize];
    }      // an array of LinkedList objects.

    //methods
    public void put(Object key, Object value)
    {
        //disallow null keys
        if (key == null) return;

        //IDENTIFYING DUPLICATES

        for(int i = 0; i < table.length; i++){
            if(table[i] != null){

                Entry e = null;
                Iterator<Entry> it = table[i].iterator();

                while(it.hasNext()){
                    e = it.next();
                    if(e.key.equals(key)){
                        System.err.println("Duplicate name found");
                    }
                }
            }
        }

        //get the "big" integer corresponding to the object
        //assumes key is not null
        int hashcode = key.hashCode();

        //compress down to a table slot
        int hash = hashM(hashcode);

        //put the value and the key into an Entry object
        //which will be placed in the table in the
        //slot ( namely, hash)


        //allows a null value
        Entry e = new Entry(key, value);

        // now place it in the table
        if (table[hash] == null) {
            table[hash] = new LinkedList();
        }
        //this allows duplicate keys
        table[hash].add(e);
    }
    public Object get(Object key) {
        //null key not allowed
        if (key == null) return null;
        //get the "big" integer corresponding to the object
        int hashcode = key.hashCode();

        //compress down to a table slot
        int hash = hashM(hashcode);

        //now look for the desired Entry
        Entry e = null;


        //First we should make sure that table[hash]
        //is Not null.  If it is null, then the
        //Entry is Not there.      (JL 11-2009).

        Iterator it = table[hash].iterator();
        while (it.hasNext()) {
            e = (Entry) it.next();
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null; // Not found.

    }
    public String toString() {
        String n = System.getProperty("line.separator");//a new line
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < table.length; ++i) {
            if (table[i] != null) {
                Iterator it = table[i].iterator();//For the
                //LinkedList at table[i]

                Entry next = null;
                while (it.hasNext()) {
                    next = (Entry) it.next();
                    sb.append(next + "\n");
                }
            }
        }
        return sb.toString();
    }
    //In the java file this method might be called hash
    private int hashM(int bigNum) {
        return bigNum % tableSize;
    }

    public int countElements() {

        if (tableSize == 0) return 0;

        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {

                Iterator<Entry> it = table[i].iterator();
                while (it.hasNext()) {
                    count++;
                    it.next();
                }
            }
        }
        return count;
    }
    public int sizeOfLongestChain() {

        if (tableSize == 0) return 0;

        int maxSize = Integer.MIN_VALUE;

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                if (table[i].size() > maxSize) {
                    maxSize = table[i].size();
                }
            }
        }

        //System.out.println(Arrays.toString(table));
        return maxSize;

    }
    public int numberOfEmptyArrayCells(){

        if(tableSize == 0) return 0;

        int count = 0;
        for(int i = 0; i < table.length; i++){
            if(table[i] == null) count++;
        }
        //System.out.println(Arrays.toString(table));
        return count;
    }
    public void searchName(){
        while(true){

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter name to search : \n" +
                    "Otherwise Enter Q to quit program : ");

            String key = sc.nextLine();
            if(key.equalsIgnoreCase("Q")) return;

            boolean found = false;
            for(int i = 0; i < table.length;i++){
                if(table[i] != null){

                    Entry e = null;
                    Iterator<Entry> it = table[i].iterator();

                    while(it.hasNext()){
                        e = it.next();
                        if(e.key.equals(key)){
                            found = true;
                            System.out.println( "\n" + e.key + " -> " + e.value + "\n" );
                        }
                    }

                }
            }
            if( !found ) System.out.println("\nNot Found\n");

        }
    }

    //entry class
    private class Entry {
        private Object key;
        private Object value;

        Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return key.toString() + " -> " + value.toString();
        }

    }
}


































