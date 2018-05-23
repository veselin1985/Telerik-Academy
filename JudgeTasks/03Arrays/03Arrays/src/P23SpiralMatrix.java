import java.util.Scanner;

public class P23SpiralMatrix {


  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int n = Integer.parseInt(console.nextLine());

    int[][] matrix = new int[n][n];

    int number = 1;
    int c1 = 0, c2 = n - 1, r1 = 0, r2 = n - 1;


    while (number <= n * n) {
      for (int i = c1; i <= c2; i++) {
        matrix[r1][i] = number++;
      }

      for (int j = r1 + 1; j <= r2; j++) {
        matrix[j][c2] = number++;
      }

      for (int i = c2 - 1; i >= c1; i--) {
        matrix[r2][i] = number++;
      }

      for (int j = r2 - 1; j >= r1 + 1; j--) {
        matrix[j][c1] = number++;
      }

      c1++;
      c2--;
      r1++;
      r2--;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j]+" ");

      }
      System.out.println();

    }
  }
}




