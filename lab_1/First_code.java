
import java.util.Arrays;

public class First_code {
    public static void main(String[] args) {
    int[]x={5,10,15,20,25};
    System.out.println(Arrays.toString(x));
    System.out.println("AFTER INVERT ");
    System.out.println(Arrays.toString(invert(x)));
}
    public static int[] invert(int[]x){
        int t=x.length-1;
        for (int i = 0; i < x.length/2; i++) {
            int temp=x[i];
            x[i]=x[t];
            x[t]=temp;
            t--;
        }
        return x;
    }

}
