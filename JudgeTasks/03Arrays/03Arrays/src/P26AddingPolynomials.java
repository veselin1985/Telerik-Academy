import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P26AddingPolynomials {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int n = console.nextInt();
    console.nextLine();
    String firstLine = console.nextLine();
    String secondLine = console.nextLine();

    String[] arrStrOne =  new String[n];
    arrStrOne = firstLine.split(" ");

    String[]  arrStrTwo = new String[n];
    arrStrTwo = secondLine.split(" ");

    List<Integer> arrFinal = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(arrStrOne[i]) + Integer.parseInt(arrStrTwo[i]);
      arrFinal.add(i, num);

    }
    for (Integer anArrFinal : arrFinal) {
      System.out.print(anArrFinal + " ");

    }
  }
}
