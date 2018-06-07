import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P01HdnlToy {
  private static Stack<Integer> stack = new Stack<>();
  private static Stack<String> stackStrings = new Stack<>();
  private static List<String> output = new ArrayList<>();

  public static void main(String[] args) throws IOException {

    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(console.readLine());
    String input = " ";

    for (int i = 0; i < n; i++) {
      StringBuilder tempResult = new StringBuilder();
      input = console.readLine();

      int num = Integer.parseInt(input.replaceAll("[^0-9]", ""));


      if (stack.isEmpty()) {
        stack.add(num);
        stackStrings.add(input);

        tempResult.append("<");
        tempResult.append(input);
        tempResult.append(">");
        output.add(tempResult.toString());
      } else {
        int tempNum = stack.peek();

        if (num > tempNum) {
          bigger(stack, stackStrings, tempResult, input, num);
        } else {

          smaller(stack, stackStrings, tempResult, input, num);
          for (int j = 0; j < stack.size(); j++) {
            tempResult.append(" ");
          }
          tempResult.append("<");
          tempResult.append(input);
          tempResult.append(">");
          output.add(tempResult.toString());
          tempResult.setLength(0);
          stack.add(num);
          stackStrings.add(input);

        }
      }
    }
    while (!stack.isEmpty()) {
      StringBuilder tempResult = new StringBuilder();
      stack.pop();
      String temp = stackStrings.pop();
      tempResult.append("</");
      tempResult.append(temp);
      tempResult.append(">");
      output.add(tempResult.toString());

    }
    for (int i = 0; i < output.size(); i++) {
      System.out.println(output.get(i));

    }


  }


  static void bigger(Stack<Integer> nums, Stack<String> strings, StringBuilder tempResult, String input,
                     int num) {
    for (int j = 0; j < stack.size(); j++) {
      tempResult.append(" ");
    }
    tempResult.append("<");
    tempResult.append(input);
    tempResult.append(">");
    output.add(tempResult.toString());
    stack.add(num);
    stackStrings.add(input);
  }


  static void smaller(Stack<Integer> nums, Stack<String> strings, StringBuilder tempResult, String input,
                      int num) {
    //if (stack.size() == 1) {

    //  stack.pop();
    //  String temp = stackStrings.pop();
    //  tempResult.append("</");
    //  tempResult.append(temp);
    //  tempResult.append(">");
    //  output.add(tempResult.toString());
    //  tempResult.setLength(0);
    //  return;
    //}
    if (stack.isEmpty()) {
      return;
    }
    if (stack.peek() >= num) {
      for (int j = 0; j < stack.size() - 1; j++) {
        tempResult.append(" ");
      }
      stack.pop();
      String temp = stackStrings.pop();
      tempResult.append("</");
      tempResult.append(temp);
      tempResult.append(">");
      output.add(tempResult.toString());
      tempResult.setLength(0);


      smaller(nums, strings, tempResult, input, num);


    }

  }
}


