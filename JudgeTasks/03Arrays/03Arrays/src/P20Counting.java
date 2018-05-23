import java.math.BigInteger;
import java.util.Scanner;

public class P20Counting {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    String num = console.nextLine();

    String num2 =num.replaceAll(("[^\\d]"), "");


    BigInteger number = new BigInteger(num2);

    for (int i = 1; i <=10 ; i++) {

      System.out.println(number.add(BigInteger.valueOf(i)));

    }

  }
}
