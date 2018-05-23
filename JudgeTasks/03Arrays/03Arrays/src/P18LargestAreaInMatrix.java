import java.util.Scanner;

public class P18LargestAreaInMatrix {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int n = console.nextInt();
    int m = console.nextInt();


    int max = 0;

    int[][] matrix = new int[n][m];
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < m; col++) {
        matrix[row][col] = console.nextInt();
      }
    }


  }
}