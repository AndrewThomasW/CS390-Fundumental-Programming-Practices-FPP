/**
 * Created by hp on 9/17/2019.
 */
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some integers for me to reverse");
        int integer = 0;


        while (true) {
            integer = sc.nextInt();
            if(integer == -1) break;
            myStack.push(integer);
        }

        System.out.print("\nThe integers reversed are :  ");

        for(int i = myStack.size() - 1 ; i >= 0; i--){

            if(i == 0){
                System.out.print("and " + myStack.get(i) + ".");
            }else{
                System.out.print(myStack.get(i) + ", ");
            }
        }

    }

}

