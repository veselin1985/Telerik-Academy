import java.math.BigInteger;
import java.util.Scanner;

public class P18_CatalanNumber {

    public static void main (String[]args){

        Scanner console = new Scanner(System.in);

        int N = console.nextInt();


        BigInteger result = getBigIntegerValue(1);



        result = factorial(2*N).divide(factorial(1+N).multiply(factorial(N)));


        System.out.println(result.toString());




    }

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.valueOf(1);

        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }

    public static BigInteger getBigIntegerValue(int value) {
        Integer integerValue = value;

        return new BigInteger(integerValue.toString());

    }
}

