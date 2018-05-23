import java.util.Scanner;

public class P15_Password {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number = console.nextInt();
        int k = console.nextInt();

        int num6 = number % 10;
        int num5 = (number / 10) % 10;
        int num4 = (number / 100) % 10;
        int num3 = (number / 1000) % 10;
        int num2 = (number / 10000) % 10;
        int num1 = (number / 100000) % 10;

        String newNumber = Integer.toString(num6) + Integer.toString(num5) + Integer.toString(num4) + Integer.toString(num3) + Integer.toString(num2) + Integer.toString(num1);

        int finalNum = Integer.parseInt(newNumber);

        int full = finalNum / k;
        int left = finalNum % k;

        int result = full + left;
        System.out.println(result);
    }


}
