import java.util.Scanner;

public class P03_DecimalToHex {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        long decimalNumber = Long.parseLong(console.nextLine());

        StringBuilder sb = new StringBuilder();

        StringBuilder binaryNumber = new StringBuilder();

        if (decimalNumber < 0) {

            decimalNumber *= -1;
            while (decimalNumber >= 1) {
                long currentNum = decimalNumber % 16;

                if (currentNum == 10) {
                    binaryNumber = sb.append("A");
                } else if (currentNum == 11) {
                    binaryNumber = sb.append("B");
                } else if (currentNum == 12) {
                    binaryNumber = sb.append("C");
                } else if (currentNum == 13) {
                    binaryNumber = sb.append("D");
                } else if (currentNum == 14) {
                    binaryNumber = sb.append("E");
                } else if (currentNum == 15) {
                    binaryNumber = sb.append("F");
                } else {
                    binaryNumber = sb.append(currentNum);

                }
                decimalNumber = decimalNumber / 16;


            } binaryNumber = sb.append("-");
        } else if (decimalNumber == 0) {
            System.out.println(0);
        } else {
            while (decimalNumber >= 1) {
                long currentNum = decimalNumber % 16;
                if (currentNum == 10) {
                    binaryNumber = sb.append("A");
                } else if (currentNum == 11) {
                    binaryNumber = sb.append("B");
                } else if (currentNum == 12) {
                    binaryNumber = sb.append("C");
                } else if (currentNum == 13) {
                    binaryNumber = sb.append("D");
                } else if (currentNum == 14) {
                    binaryNumber = sb.append("E");
                } else if (currentNum == 15) {
                    binaryNumber = sb.append("F");
                } else {
                    binaryNumber = sb.append(currentNum);

                }
                decimalNumber = decimalNumber / 16;

            }

        }
        System.out.println(binaryNumber.reverse().toString());
    }
}
