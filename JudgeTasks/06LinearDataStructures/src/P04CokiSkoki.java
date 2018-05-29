import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class P04CokiSkoki {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int n = console.nextInt();
    int[] buildings = new int[n];

    for (int i = 0; i < n; i++) {
      buildings[i] = console.nextInt();
    }

    Stack<Integer> peeks = new Stack<>();
    int[] jumps = new int[n];

    for (int i = buildings.length - 1; i >= 0; i--) {

      while (!peeks.isEmpty() &&
          buildings[peeks.peek()] <= buildings[i]) {
        int peekIndex = peeks.pop();
        jumps[peekIndex] = peeks.size();
      }
      peeks.push(i);
    }
    while (!peeks.isEmpty()) {
      int peekIndex = peeks.pop();
      jumps[peekIndex] = peeks.size();

    }
    int maxJump = Arrays.stream(jumps)
        .max()
        .getAsInt();
    System.out.println(maxJump);
    Arrays.stream(jumps)
        .forEach(x -> System.out.print(x + " "));
  }
}
