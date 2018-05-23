import java.util.Scanner;

public class P02_AplusB {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        for (int i = 0; i < n; i++) {
            int num1 = console.nextInt();
            int num2 = console.nextInt();
            System.out.println(num1 + num2);
        }
    }
}