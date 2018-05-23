import java.util.Scanner;

public class P30ZigZag {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int rows = console.nextInt();
    int cols = console.nextInt();

    int row = 0;
    int col = 0;

    int rowDir = 1;
    int colDir = 1;

    long sum = 1;
    int nextRow = row;
    int nextCol = col;
    boolean isGoingRight = true;
    boolean isGoingLeft = false;

    while (!((row == rows - 1 && col == 0) || (row == rows - 1 && col == cols - 1))) {

      row += rowDir;
      col += colDir;
      sum += result(row, col);


      if (isGoingRight && col <= cols - 1) {
        rowDir *= -1;
        if (col == cols - 1) {
          isGoingRight = false;
          isGoingLeft = true;
        }
      }
      if (isGoingLeft && col>= 0) {
        colDir = -1;
        rowDir *= -1;

        if (col == 0) {
          isGoingLeft = false;
          isGoingRight = true;
          rowDir = 1;
          colDir = 1;
        }
      }
    }
    System.out.println(sum);
  }


  public static long result(int rol, int col) {
    long result = (rol + col) * 3 + 1;
    return result;
  }
}
