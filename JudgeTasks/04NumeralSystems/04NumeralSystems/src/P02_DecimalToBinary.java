import java.util.Scanner;

public class P02_DecimalToBinary {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int decimalNumber = Integer.parseInt(console.nextLine());

        StringBuilder sb = new StringBuilder();

        StringBuilder binaryNumber = new StringBuilder();

        if (decimalNumber < 0) {

            decimalNumber *= -1;
            while (decimalNumber >= 1) {
                int currentNum = decimalNumber % 2;
                binaryNumber = sb.append(currentNum);

                decimalNumber = decimalNumber  / 2;


            } binaryNumber = sb.append("-");
        } else if (decimalNumber == 0) {
            System.out.println(0);
        } else {
            while (decimalNumber >= 1) {
                int currentNum = decimalNumber % 2;
                binaryNumber = sb.append(currentNum);

                decimalNumber = decimalNumber / 2;

            }

        }System.out.println(binaryNumber.reverse().toString());
    }
}
