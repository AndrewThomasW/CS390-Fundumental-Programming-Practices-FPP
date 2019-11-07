/**
 * Created by hp on 9/27/2019.
 */
import java.util.*;

public class preferences_delimiters {

    public static void main(String[] args) {

        Stack<Character> bracket = new Stack<Character>();
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an arithematic expression: ");
        input = sc.nextLine();
        boolean check = true;
        Character c;
        for(int i = 0;i<input.length();i++) {
            c = input.charAt(i);
            if(c == '(' || c == '[') {
                bracket.push(c);
            }else if(c == ')') {
                c = bracket.pop();
                if(c != '(') {
                    check = false;
                }
            }else if(c == ']') {
                c = bracket.pop();
                if(c != '[') {
                    check = false;
                }
            }
        }
        if(check && bracket.isEmpty()) {
            System.out.println("OKAY");
        }else{
            System.out.println("NO");
        }
    }

}

