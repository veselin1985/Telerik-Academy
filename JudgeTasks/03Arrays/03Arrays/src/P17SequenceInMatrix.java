import java.util.Scanner;

public class P17SequenceInMatrix {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int n = console.nextInt();
    int m = console.nextInt();


    int max = 0;

    String[][] matrix = new String[n][m];
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < m; col++) {
        matrix[row][col] = console.next();
      }
    }
    for (int row = 0; row < matrix.length; row++) {
      int currentMax = 1;
      for (int col = 0; col < matrix[row].length-1; col++) {
        if (matrix[row][col] .equals( matrix[row][col + 1])) {
          currentMax++;
          max = Math.max(currentMax, max);

        }
      }

    }
    for (int row = 0; row < matrix.length; row++) {
      int currentMax = 1;
      for (int col = 0; col < matrix[row].length-1; col++) {
        if (matrix[col][row] .equals( matrix[col+1][row])) {
          currentMax++;
          max = Math.max(currentMax, max);

        }
      }
    }
    System.out.println(max);
  }
}