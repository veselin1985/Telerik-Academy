import java.util.Scanner;

public class P25Rankove {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int n = Integer.parseInt(console.nextLine());
    String input = console.nextLine();

    String[] arrStr = new String[n];

    arrStr = input.split(" ");

    int[] arr = new int[n];
    boolean[] isVisited = new boolean[n];

    for (int i = 0; i < arrStr.length; i++) {
      arr[i] = Integer.parseInt(arrStr[i]);
    }
    int[] output = new int[n];

    for (int i = 0; i < arr.length; i++) {
      int maxIndex = -1;
      int minNumber = Integer.MAX_VALUE;
      for (int numbers = 0; numbers < arr.length; numbers++) {

        if (!isVisited[numbers]) {
          if (arr[numbers] < minNumber) {
            minNumber = arr[numbers];
            maxIndex = numbers;

          }
        }
      }
      output[maxIndex] = n;
      isVisited[maxIndex] = true;
      n--;
    }
    for (int num : output
      ) {
      System.out.print(num + " ");
    }
  }
}

