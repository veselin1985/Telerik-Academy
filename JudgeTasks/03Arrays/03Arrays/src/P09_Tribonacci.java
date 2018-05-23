import java.math.BigInteger;
import java.util.Scanner;

public class P09_Tribonacci {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        BigInteger num1 = BigInteger.valueOf(Long.parseLong(console.nextLine()));
        BigInteger num2 = BigInteger.valueOf(Long.parseLong(console.nextLine()));
        BigInteger num3 = BigInteger.valueOf(Long.parseLong(console.nextLine()));
        BigInteger num = BigInteger.ZERO;
        int nNumber = Integer.parseInt(console.nextLine());
        int counter=4;

boolean forPrint = true;
        switch (nNumber) {
            case 1:
                System.out.println(num1);
                forPrint=false;
                break;
            case 2:
                System.out.println(num2);
                forPrint=false;
                break;
            case 3:
                System.out.println(num3);
                forPrint=false;
                break;
            default:
                while (counter <= nNumber) {

                    num =num1.add(num2).add(num3);


                    num1 = num2;
                    num2 = num3;
                    num3 = num;
                    counter++;
                }

        }
        if(forPrint)System.out.println(num);
    }
}