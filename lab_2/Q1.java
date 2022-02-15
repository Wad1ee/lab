import java.util.*;
import java.util.Stack;


public class Q1 {

    public static void main(String[] args) {
        java.util.Stack<Object> A = new Stack();
        Stack<Object> B = new Stack();
        A.push("W");
        A.push("A");
        A.push("D");
        A.push("E");
        A.push("E");
        System.out.println("Stack A = " + A);
        System.out.println("A size = " + A.size());
        int s = A.size();

        for (int i = 0; i < s; ++i) {
            B.push(A.pop());
        }

        System.out.println("Stack B =" + B);
    }
}
