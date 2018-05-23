import java.math.BigInteger;
import java.util.Scanner;

public class P12_N_Factorial {


        public static void main (String[]args){

            Scanner console = new Scanner(System.in);

            int N = Integer.parseInt(console.nextLine());


            BigInteger result = getBigIntegerValue(1);

            result =factorial(N);

            System.out.println(result.toString());




        }

        public static BigInteger factorial(int number) {
            BigInteger result = BigInteger.valueOf(1);

            for (int factor = 2; factor <= number; factor++) {
                result = result.multiply(BigInteger.valueOf(factor));
            }

            return result;
        }

        private static BigInteger getBigIntegerValue(int value) {
            Integer integerValue = value;

            return new BigInteger(integerValue.toString());

        }
    }







