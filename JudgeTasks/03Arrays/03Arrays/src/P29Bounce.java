import java.util.Scanner;

public class P29Bounce {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int rows = console.nextInt();
    int cols = console.nextInt();

    int row = 1;
    int col = 1;

    int rowDir = 1;
    int colDir = 1;

    long sum = 1;

    if (rows == 1 || cols == 1) {
      System.out.println(result(0, 0));
      return;
    }

    while (!((row == 0 && col == 0) || (row == rows - 1 && col == 0) || (row == 0 && col == cols - 1) || (row == rows - 1 && col == cols - 1))) {
      sum += result(row, col);

      if (0 <= row + rowDir && row + rowDir < rows)
        row += rowDir;
      else {
        rowDir *= -1;
        row += rowDir;
      }
      if (0 <= col + colDir && col + colDir < cols)
        col += colDir;
      else {
        colDir *= -1;
        col += colDir;
      }
    }
    sum += result(row, col);
    System.out.println(sum);
  }


  public static long result(int rol, int col) {
    long result = (long) Math.pow(2, rol + col);
    return result;
  }
}
