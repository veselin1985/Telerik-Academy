import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Stack;

public class P01BracketsExpressions {

  public static void main(String[] args) throws IOException {

    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    String input = console.readLine();

    Stack<Integer> indexes = new Stack<>();

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(') {
        indexes.push(i);
      }
      if (input.charAt(i) == ')') {
        int start = indexes.peek();
        indexes.pop();
        String forPrint = input.substring(start, i+1);
        System.out.println(forPrint);

      }
    }
  }
}
