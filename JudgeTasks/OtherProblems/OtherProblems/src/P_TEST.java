import java.math.BigInteger;
import java.util.Scanner;

public class P_TEST {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());

        boolean isPrime = isPrimeNumber(a);

        if (isPrime) {
            System.out.println("YES");
        } else System.out.println("NO");

    }


    public static boolean isPrimeNumber(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
