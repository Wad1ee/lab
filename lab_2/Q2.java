import java.util.*;
import java.util.Stack;

/**
 * Created by Administrator on 15/02/22.
 */
public class Q2 {

    static int counter=0;
    static java.util.Stack<Object> Stack2=new Stack<>();
    public static String pop(){
        while (!Stack2.isEmpty()) {

            System.out.println("deleted = " + Stack2.pop());
            System.out.println("size=" + Stack2.size());
            System.out.println("is the stack empty ? " + Stack2.isEmpty());
        }
        return "No Stack is  Empty \n Stack = "+Stack2;
    }

    public static void main(String[] args) {
        Stack2.push("W");
        Stack2.push("A");
        Stack2.push("D");
        Stack2.push("E");
        Stack2.push("E");
        System.out.println("Element pushed to Stack ");
        System.out.println("Stack = "+Stack2);
        System.out.println(pop());

    }
}
