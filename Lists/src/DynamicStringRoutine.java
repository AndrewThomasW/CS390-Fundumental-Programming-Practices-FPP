/**
 * Created by hp on 9/16/2019.
 */

import java.util.Scanner;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class DynamicStringRoutine {
    public static void main(String[] args) {

        LinkedList<Character> A = new LinkedList<>();
        LinkedList<Character> B = new LinkedList<>();
        LinkedList<Character> C = new LinkedList<>();

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\n\nEnter command -> ");
            String command = sc.nextLine();


            if (command.equalsIgnoreCase("Q")) break;

            switch (command) {
                case "R":
                    System.out.println("Enter String name -> ");
                    String name = sc.nextLine();

                    if (!((name.equalsIgnoreCase("A")) || name.equalsIgnoreCase("B") || name.equalsIgnoreCase("C"))) {
                        System.out.println("Only valid names are A,B or C");
                        break;
                    }

                    System.out.println("Enter text -> ");
                    String text = sc.nextLine();

                    if (name.equalsIgnoreCase("A")) {
                        A.addAll(readString(text));
                    } else if (name.equalsIgnoreCase("B")) {
                        B.addAll(readString(text));
                    } else if (name.equalsIgnoreCase("C")) {
                        C.addAll(readString(text));
                    }
                    break;
                case "C":
                    System.out.println("Enter target -> ");
                    String target = sc.nextLine();

                    System.out.println("Enter String name -> ");
                    String name2 = sc.nextLine();

                    if (!((name2.equalsIgnoreCase("A")) || name2.equalsIgnoreCase("B") || name2.equalsIgnoreCase("C"))) {
                        System.out.println("Only valid names are A,B or C");
                        break;
                    }

                    if (target.equalsIgnoreCase("A") && name2.equalsIgnoreCase("B")) {
                        concatenate(A, B);
                    }

                    break;
                case "W":
                    System.out.println("Enter String name -> ");
                    String name3 = sc.nextLine();

                    if (!((name3.equalsIgnoreCase("A")) || name3.equalsIgnoreCase("B") || name3.equalsIgnoreCase("C"))) {
                        System.out.println("Only valid names are A,B or C");
                        break;
                    }

                    if (name3.equalsIgnoreCase("A")) {
                        writeString(A);
                    } else if (name3.equalsIgnoreCase("B")) {
                        writeString(B);
                    } else if (name3.equalsIgnoreCase("C")) {
                        writeString(C);
                    }
                    break;
            }
        }


    }


    public static List<Character> readString( String str) {

        List<Character> list = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        //System.out.println(list);
        return list;
    }
    public static void writeString(LinkedList<Character> items) {
        if(items == null || items.size() == 0) return;

        Iterator<Character> it = items.iterator();

        while (it.hasNext()) {
            System.out.print(it.next());

        }
        System.out.println();
    }
    public static void clear(LinkedList<Character> list) {

        if(list == null || list.isEmpty()) return;

       while( ! list.isEmpty() ){
           list.removeFirst();
       }

    }
    public static int Len(LinkedList<Character> list) {

        if(list == null) return 0;

        Iterator<Character> it = list.iterator();

        int length = 0;
        while (it.hasNext()) {
            length++;
            it.next();
        }
        return length;
    }
    public static boolean equal(LinkedList<Character> list1, LinkedList<Character> list2) {

        Iterator<Character> it1 = list1.iterator();
        Iterator<Character> it2 = list2.iterator();

        while (it1.hasNext() && it2.hasNext()) {
            if (it1.next() != it2.next()) return false;
        }
        return true;
    }


    public static void concatenate(List<Character> target, List<Character> concat) {

        List<Character> copy = new LinkedList<>();
        copy.addAll(concat);

        Iterator<Character> it = copy.iterator();

        while (it.hasNext()) {
            target.add(it.next());
        }
    }
    public void insert(List<Character> l1, List<Character> l2, int st) {
        if(st > l1.size())
            System.out.println("The Start pos is more than string size");
        l1.addAll(st, l2);
    }
    public int search(String s, List<Character> target, int pos) {
        int position = -1;
        String targetString = "";
        Iterator<Character> it = target.iterator();
        while(it.hasNext()) {
            it.next();
            targetString += it;
        }
        for(int i=pos; i<targetString.length();i++) {
            targetString.regionMatches(i, s,  0, s.length());
            position =targetString.indexOf(s);
        }
        return position;
    }
    public void delete(List<Character> ls, int pos, int span) {
        if(ls.isEmpty()) return;
        List<Character> sub = ls.subList(pos, span);
        ls.removeAll(sub);
    }
    public List<Character> substring(List<Character> target, List<Character> ls, int pos, int span) {
        if(ls.isEmpty()) return target;
        target = ls.subList(pos, span);
        return target;
    }
}



















