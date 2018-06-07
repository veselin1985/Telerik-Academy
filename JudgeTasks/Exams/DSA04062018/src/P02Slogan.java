import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02Slogan {

  static boolean isFound = false;

  public static void main(String[] args) throws IOException {

    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(console.readLine());

    for (int i = 0; i < n; i++) {

      String[] input = console.readLine().split(" ");
      String target = console.readLine();

      String[] permutation = new String[input.length];
      boolean[] used = new boolean[input.length];

      getPermutation(0, permutation, used, input, target, new StringBuilder());

      if (!isFound) {
        System.out.println("NOT VALID");

      }

    }
  }


  static void getPermutation(int index, String[] permutation, boolean[] used, String[] input, String target, StringBuilder temp) {

    temp.setLength(0);
    for (int i = 0; i < permutation.length; i++) {
      if (permutation[i] == null) {
        break;
      }

      temp.append(permutation[i]);

      if (temp.toString().equals(target)) {
        for (int j = 0; j < permutation.length; j++) {
          temp.setLength(0);
          temp.append(permutation[i]);
          temp.append(" ");
          System.out.println();
          isFound = true;
          return;
        }
      }
    }

    for (int i = 0; i < input.length; i++) {
      if (used[i]) {
        continue;
      }

      String word = input[i];
      permutation[index] = word;
      used[i] = true;
      getPermutation(index + 1, permutation, used, input, target, temp);
      used[i] = false;


    }
  }
}


