import java.util.Scanner;

public class P17_BiggestPrimeNumber {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int num = console.nextInt();

        int j = 2;
        while (true) {
            if (num % j == 0) {
                if (j == num) {
                    System.out.println(j);
                    break;
                } else {
                    num--;
                    j = 2;

                }
            } else j++;

        }
    }
}




