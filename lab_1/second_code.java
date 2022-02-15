import java.util.Arrays;

public class second_code {
    public static void main(String[] args) {
        int[]x={5,10,15,20,25};
        System.out.println(Arrays.toString(x));
        System.out.println("next array");
        int [] new_x=(int[])Arrays.copyOf(x,5);
        for (int j = 0; j < 1; j++) {
            System.out.println(Arrays.toString(new_x));
        }
    }

}
