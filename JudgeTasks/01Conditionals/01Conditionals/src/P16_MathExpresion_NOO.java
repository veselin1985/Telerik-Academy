import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class P16_MathExpresion_NOO {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        BigDecimal n = new BigDecimal(console.nextLine());
        BigDecimal m = new BigDecimal(console.nextLine());
        BigDecimal p = new BigDecimal(console.nextLine());

       BigDecimal one =n.multiply(n,MathContext.DECIMAL128);
       BigDecimal twoOne = m.multiply(p,MathContext.DECIMAL128);
       BigDecimal valueOne = BigDecimal.ONE;
       BigDecimal two = valueOne.divide(twoOne,100,RoundingMode.CEILING);





        BigDecimal first = one.add(two).add(BigDecimal.valueOf(1337));
        BigDecimal second = n.subtract(BigDecimal.valueOf(128.523123123).multiply(p,MathContext.DECIMAL128));

        BigDecimal sinSUM = m.remainder(BigDecimal.valueOf(180));
        double d = sinSUM.doubleValue();
        double sin = Math.sin(d);


        BigDecimal firstSum = first.divide(second,100,RoundingMode.CEILING);

        BigDecimal sum = firstSum.add(BigDecimal.valueOf(sin));

        System.out.printf("%.9s", sum.toString());

    }
}
