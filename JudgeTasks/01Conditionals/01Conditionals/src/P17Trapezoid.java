import java.util.Scanner;

public class P17Trapezoid {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int num = Integer.parseInt(console.nextLine());
    System.out.println(repeatString(".", num)+repeatString("*", num));

    for (int i = 0; i <num-1 ; i++) {
      System.out.println(repeatString(".", num-1-i)+"*"+repeatString(".", num-1+i)+"*");

    }System.out.println(repeatString("*", num*2));

  }

  public static String repeatString(String text, int counter) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < counter; i++) {
      sb.append(text);
    }
    return sb.toString();
  }
}
