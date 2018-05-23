import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P15JoroTheRabbit {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    String[] input = console.nextLine().split(", ");

    ArrayList<Integer> myList = new ArrayList<>();

    for (String currNumber : input) {
      myList.add(Integer.parseInt(currNumber));

    }

    int maxJumps = 0;

    for (int i = 0; i < myList.size(); i++) {
      for (int steps = 0; steps < myList.size(); steps++) {
        int currentJumps = 1;
        int current = myList.get(i);
        int currentIndex = steps + i;
        while (true) {

          if (currentIndex >= myList.size()) {
            currentIndex -= myList.size();

          }
          if (myList.get(currentIndex) < current) {
            currentJumps++;
            current = myList.get(currentIndex);
            currentIndex+=steps;

          } else {
            break;
          }
        }maxJumps=Math.max(currentJumps, maxJumps);
      }
    }
    System.out.println(maxJumps);
  }
}

