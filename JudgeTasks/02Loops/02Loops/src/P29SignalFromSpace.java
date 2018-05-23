import java.util.*;

public class P29SignalFromSpace {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    String input = console.nextLine();
    List<Character> output = new ArrayList<>();
    output.add(input.charAt(0));
    for (int i = 0; i < input.length()-1 ; i++) {

      if (input.charAt(i+1) == input.charAt(i)) {
        continue;
      } else {
        output.add(input.charAt(i+1));
      }
    }

    output.forEach(System.out::print);

  }
}

