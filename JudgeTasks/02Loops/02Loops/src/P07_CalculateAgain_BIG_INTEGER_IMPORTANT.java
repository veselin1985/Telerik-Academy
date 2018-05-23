import java.math.BigInteger;
import java.util.Scanner;

public class P07_CalculateAgain_BIG_INTEGER_IMPORTANT {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int k = Integer.parseInt(console.nextLine());

        BigInteger result = getBigIntegerValue(1);
        BigInteger multiplier;
        BigInteger result2 = getBigIntegerValue(1);
        BigInteger multiplier2;

        for (int i = 1; i <= n; i++) {
            multiplier = getBigIntegerValue(i);
            result = result.multiply(multiplier);

        }
        for (int j = 1; j <=k; j++) {
            multiplier2 = getBigIntegerValue(j);
            result2 = result2.multiply(multiplier2);
        }



        BigInteger result3= result.divide(result2);

        System.out.println(result.toString());
    }

    private static BigInteger getBigIntegerValue(int value) {
        Integer integerValue = value;

        return new BigInteger(integerValue.toString());

    }
}
