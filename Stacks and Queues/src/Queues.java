import java.util.*;

/**
 * Created by hp on 9/18/2019.
 */
public class Queues {
    public static void main(String[] args){

        Stack<Integer> s1 = new Stack<>();
        Queue<Integer> q = new LinkedList<>();


        Stack<Integer> s2 = new Stack<>();



        NLRDS();



        /* TESTING Stack2 Onto Stack1
        s1.push(1);
        s1.push(2);
        s1.push(3);

        s2.push(4);
        s2.push(5);
        s2.push(6);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        stack2OntoStack1(s1, s2);
        System.out.println(s1);
        System.out.println(s2);*/



        /* TESTING Stack Vs Queues

        q.add(1);
        q.add(2);
        q.add(3);

        s1.push(6);
        s1.push(5);
        s1.push(4);

        System.out.println(q);
        System.out.println(s1);
        System.out.println();
        stackIntoQueue(s1, q);
        System.out.println(q);
        System.out.println(s1);
        System.out.println();
        queueIntoStack(q, s1);
        System.out.println(q);
        System.out.println(s1);*/

    }


    //Move all the entries from a stack into a queue
    public static  void stackIntoQueue(Stack<Integer> s, Queue<Integer> q ){

        Iterator<Integer> it = s.iterator();
        while(it.hasNext()){
            q.add( s.pop() );
        }
    }
    //Move all the entries from a queue onto a stack.
    public static void queueIntoStack(Queue<Integer> q, Stack<Integer> s){

        Iterator<Integer> it = q.iterator();
        while(it.hasNext()){
            s.push(q.remove());
        }
    }
    //Empty one stack onto the top of another stack
    public static void stack2OntoStack1(Stack<Integer> s1,Stack<Integer> s2){

        List<Integer> temp = new LinkedList<>();

        Iterator<Integer> it = s2.iterator();
        while(it.hasNext()){
            temp.add(s2.pop());
        }

        for(int i = temp.size() - 1 ; i >= 0 ; i--){
            s1.push( temp.get(i) );
        }
    }

    public static void NLRDS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = sc.nextLine();

        //N      No colon on the line

        int countColon = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ':') countColon++;
        }
        if (countColon == 0) {
            System.out.println("N");
            return;
        }

        //L      The left part (before the colon) is longer than the right.
        //R      The right part (after the colon) is longer than the left.

        String[] tempArray;
        tempArray = sentence.split(":");

        String leftString = tempArray[0];
        String rightString = tempArray[1];

        Queue<Character> leftStringQueue = new LinkedList<>();

        for (int i = 0; i < leftString.length(); i++) {
            leftStringQueue.add(leftString.charAt(i));
        }

        if (leftStringQueue.size() > rightString.length()) {
            System.out.println("L");
            return;
        }

        if (leftStringQueue.size() < rightString.length()) {
            System.out.println("R");
            return;
        }



        //D      The left and right parts have the same length but are different.
        //S      The left and right parts are exactly the same

        if(leftStringQueue.size() == rightString.length()){
            Queue<Character> tempQueue = new LinkedList<>();
            tempQueue.addAll(leftStringQueue);

            for(int i = 0; i < rightString.length(); i++){
                if( ! (tempQueue.remove().equals(rightString.charAt(i))) ){
                    System.out.println("D");
                    return;
                }
            }
            System.out.println("S");
        }

    }
}


