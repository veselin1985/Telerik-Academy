import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P02JediMeditation {

  public static void main(String[] args) throws IOException {

    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(console.readLine());

    String input = console.readLine();

    String[] jedies = input.split(" ");

    Queue<String> masters = new LinkedList<>();
    Queue<String> knights = new LinkedList<>();
    Queue<String> padawans = new LinkedList<>();

    for (int i = 0; i < jedies.length; i++) {
      String meditation = jedies[i];
      if (meditation.startsWith("M")) {
        masters.add(meditation);
      } else if (meditation.startsWith("K")) {
        knights.add(meditation);
      } else if (meditation.startsWith("P")) {
        padawans.add(meditation);
      }
    }

    while (masters.size() > 0) {
      System.out.print(masters.remove() + " ");
    }
    while (knights.size() > 0) {
      System.out.print(knights.remove() + " ");
    }
    while (padawans.size() > 0) {
      System.out.print(padawans.remove() + " ");
    }
  }
}
