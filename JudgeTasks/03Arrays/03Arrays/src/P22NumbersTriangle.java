import java.util.Scanner;

public class P22NumbersTriangle {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int number = Integer.parseInt(console.nextLine());
  trianglePring(number);
  }

  static void trianglePring(int number) {

    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");

      }
      System.out.println();

    }
    for (int i = number - 1; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}