import java.util.Scanner;

public class P03_NotDivisableNumber {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int num = 0;
        for (int i = 0; i < n; i++) {
            num++;
            if (num%3 == 0) {
                continue;
            }
            if (num % 7 == 0) {

                continue;
            } else {
                System.out.print(num + " ");
            }
        }
    }
}
