import java.util.Scanner;

public class P21_ReverseNumber {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String number = console.nextLine();

        int i = number.length();
        while (i >= 1) {


            System.out.print(number.charAt(i - 1));

            i--;

        }
    }
}
