import java.math.BigInteger;
import java.util.Scanner;

public class P11_CalculateOf3 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int N = Integer.parseInt(console.nextLine());
        int K = Integer.parseInt(console.nextLine());

        BigInteger result = getBigIntegerValue(1);
        BigInteger result2 = getBigIntegerValue(1);
        BigInteger result3 = getBigIntegerValue(1);
        BigInteger result4 = getBigIntegerValue(1);
        BigInteger result5 = getBigIntegerValue(1);

        int nANDk = N - K;
        result = factorial(N);
        result2 = factorial(K);
        result3 = factorial(nANDk);
        result5 = result2.multiply(result3);
        result4 = result.divide(result5);


        System.out.println(result4.toString());


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

