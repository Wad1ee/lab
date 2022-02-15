import java.util.Stack;

/**
 * Created by Administrator on 15/02/22.
 */
public class Q2 {

    Stack<Object> a = new Stack<>();
    Stack<Object> b = new Stack<>();
    public static void main(String[] args) {

        Q2 D= new Q2();

        D.a.push("a");  D.a.push(2);  D.a.push(3);  D.a.push(4);

        System.out.println("Stack S="+D.a);
        System.out.println("S.size ="+D.a.size());
        int t =D.a.size();
        for (int i = 0; i <t ; i++) {
            D.b.push(D.a.pop());
        }
        System.out.println("Stack T="+D.b);
    }
}
