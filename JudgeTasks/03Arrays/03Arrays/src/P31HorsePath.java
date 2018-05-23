import java.util.Scanner;

public class P31HorsePath {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int number = Integer.parseInt(console.nextLine());

    int[][] matrix = new int[number][number];

    int[] rowsDir = {-2, -2, -1, -1, 1, 1, 2, 2};
    int[] colsDir = {-1, 1, -2, 2, -2, 2, -1, 1};

    int counter = 1;


    for (int r = 0; r < matrix.length; r++) {
      for (int c = 0; c < matrix[r].length; c++) {
        int row = r;
        int col = c;

        while ((matrix[row][col] == 0)) {
          matrix[row][col] = counter;
          counter++;

          for (int dir = 0; dir < rowsDir.length; dir++) {
            int nextRow = row + rowsDir[dir];
            int nextCol = col + colsDir[dir];

            if (0 > nextRow || nextRow >= matrix.length || 0 > nextCol || nextCol >= matrix.length) {
              continue;
            }
            if (matrix[nextRow][nextCol] != 0) {
              continue;
            }
            row = nextRow;
            col = nextCol;
            break;

          }

        }
      }
    }
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");

      }
      System.out.println();
    }
  }
}

