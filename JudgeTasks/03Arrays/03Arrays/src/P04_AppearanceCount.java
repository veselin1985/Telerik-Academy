import java.util.Scanner;

public class P04_AppearanceCount {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int nums[] = new int[n];


        for (int i = 0; i < n; i++) {
            nums[i] = console.nextInt();
        }
        int x = console.nextInt();
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == x) {
                counter++;


            }
        }
        System.out.println(counter);
    }
}