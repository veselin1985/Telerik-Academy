import java.math.BigInteger;
import java.util.Scanner;

public class P25_TribonacciTriangle {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        BigInteger firstNum = BigInteger.valueOf(Long.parseLong(console.nextLine()));
        BigInteger secondNum = BigInteger.valueOf(Long.parseLong(console.nextLine()));
        BigInteger thirdNum = BigInteger.valueOf(Long.parseLong(console.nextLine()));
        int lines = Integer.parseInt(console.nextLine());


        for (int i = 1; i <= lines; i++) {
            if (i == 1) {
                System.out.print(firstNum);
            } else if (i == 2) {
                System.out.print(secondNum + " " + thirdNum);
            } else
                for (int j = 0; j < i; j++) {

                    if (j == i - 1) {
                       BigInteger sum = firstNum.add(secondNum).add(thirdNum);
                        System.out.print(sum);

                        firstNum = secondNum;
                        secondNum = thirdNum;
                        thirdNum = sum;

                    } else {
                        BigInteger sum = firstNum.add(secondNum).add(thirdNum);
                        System.out.print(sum + " ");

                        firstNum = secondNum;
                        secondNum = thirdNum;
                        thirdNum = sum;


                    }
                }
            System.out.println();
        }

    }
}
