import java.util.Scanner;

public class P08_HorsePath {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int m = (int) n;
        int[][] matrix = new int[n][m];
        matrix[0][0] = 1;
        int row = 0;
        int col = 0;
        int num = 2;


        while (true) {

            while (col + 2 < n-1) {
                num++;
                row += 1;
                col += 2;
                if (col+2 > n) {
                    break;
                } else {
                    matrix[row][col] = num;
                }

                row -= 1;
                col += 2;
                num++;
                if (col > n || row > n) {
                    break;
                } else {
                    matrix[row][col] = num;

                }
            }
            for (int r = 0; r < matrix.length; r++) {
                System.out.print("|");

                for (int c = 0; c < matrix[r].length; c++) {
                    System.out.print(matrix[r][c] + "|");

                }
                System.out.println();

            }


        }
    }
}