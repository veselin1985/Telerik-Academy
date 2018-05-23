import java.util.Arrays;
import java.util.Scanner;

public class P01_MaxSumOf_K_Elements {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int nums [] = new int [n];

        for (int i = 0; i <n ; i++) {

            nums[i] = Integer.parseInt(console.nextLine());
        }
        System.out.println(Arrays.toString(nums));
    }
}
