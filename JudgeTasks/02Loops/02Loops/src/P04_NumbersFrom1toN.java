import java.util.Scanner;

public class P04_NumbersFrom1toN {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {

            if (i == n) {
                System.out.print(i);

            } else System.out.print(i + " ");
        }

    }

}

