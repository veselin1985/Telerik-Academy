import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P19BigNumbers {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int firstArrLength = console.nextInt();
    int secondArrLength = console.nextInt();
    console.nextLine();

    String first = console.nextLine();
    String second = console.nextLine();

    List<String> firstArr = Arrays.asList(first.split(" "));
    List<String> secondArr = Arrays.asList(second.split(" "));

    StringBuilder firstNum = new StringBuilder();
    StringBuilder secondNum = new StringBuilder();


    for (String str : firstArr
      ) {
      firstNum.append(str);

    }
    for (String str : secondArr
      ) {
      secondNum.append(str);

    }
    firstNum = firstNum.reverse();
    secondNum = secondNum.reverse();

    String numOneCalc = firstNum + "";
    String numTwoCalc = secondNum + "";

    BigInteger numOne = new BigInteger(numOneCalc);
    BigInteger numTwo = new BigInteger(numTwoCalc);

    BigInteger lastNum = numOne.add(numTwo);
    String forPrint = lastNum.toString();

    for (int i = forPrint.length() - 1; i >= 0; i--) {
      if (i != 0) {
        System.out.print(forPrint.charAt(i) + " ");

      } else {
        System.out.print(forPrint.charAt(i));
      }
    }
  }
}
