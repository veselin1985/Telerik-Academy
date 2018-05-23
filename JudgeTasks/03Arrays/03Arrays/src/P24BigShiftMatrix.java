import java.math.BigInteger;
import java.util.Scanner;

public class P24BigShiftMatrix {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int row = Integer.parseInt(console.nextLine());
    int col = Integer.parseInt(console.nextLine());
    int moves = Integer.parseInt(console.nextLine());

    String[] arrStringMoves = console.nextLine().split(" ");

    int[] arrMoves = new int[arrStringMoves.length];

    for (int i = 0; i < arrStringMoves.length; i++) {
      arrMoves[i] = Integer.parseInt(arrStringMoves[i]);
    }
    BigInteger[][] matrix = new BigInteger[row][col];
    BigInteger startNum = BigInteger.ONE;
    BigInteger multiplier = BigInteger.TWO;
    BigInteger numberOne = BigInteger.ONE;
    for (int rows = matrix.length - 1; rows >= 0; rows--) {
      for (int cols = 1; cols <= col; cols++) {
        matrix[rows][cols - 1] = numberOne;
        numberOne = numberOne.multiply(multiplier);

      }
      startNum = startNum.multiply(multiplier);
      numberOne = startNum;

    }
    int counter = 0;
    int startRow = row - 1;
    int startCol = 0;
    BigInteger sum = BigInteger.ZERO;

    while (counter < arrMoves.length) {

      int code = arrMoves[counter];

      int coef = Math.max(row, col);

      int finishRow = code / coef;
      int finishCol = code % coef;

      boolean columnIsUsed = false;
      boolean rowIsUsed = false;

      if (startCol <= finishCol) {
        for (int j = startCol; j <= finishCol; j++) {
          BigInteger matrixNum = matrix[startRow][j];
          sum = sum.add(matrixNum);
          matrix[startRow][j] = BigInteger.ZERO;
        }
      } else {
        for (int j = startCol; j >= finishCol; j--) {
          BigInteger matrixNum = matrix[startRow][j];
          sum = sum.add(matrixNum);
          matrix[startRow][j] = BigInteger.ZERO;
        }
      }
      if (startRow >= finishRow)
        for (int i = startRow; i >= finishRow; i--) {
          BigInteger matrixNum = matrix[i][finishCol];
          sum = sum.add(matrixNum);
          matrix[i][finishCol] = BigInteger.ZERO;
        }
      else {
        for (int i = startRow; i <= finishRow; i++) {
          BigInteger matrixNum = matrix[i][finishCol];
          sum = sum.add(matrixNum);
          matrix[i][finishCol] = BigInteger.ZERO;
        }

      } startCol = finishCol;
      startRow = finishRow;
      counter++;
    }System.out.println(sum);

  }

}



