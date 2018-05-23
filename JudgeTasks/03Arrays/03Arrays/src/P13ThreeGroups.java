import java.util.ArrayList;
import java.util.Scanner;

public class P13ThreeGroups {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    String[] numbersString = console.nextLine().split(" ");

    int[] numbers = new int[numbersString.length];

    for (int i = 0; i < numbersString.length; i++) {
      numbers[i] = Integer.parseInt(numbersString[i]);

    }
    ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
    groups.add(new ArrayList<>());
    groups.add(new ArrayList<>());
    groups.add(new ArrayList<>());

    for (int number : numbers) {
      int index = number % 3;
      ArrayList<Integer> group = groups.get(index);
      group.add(number);
    }
    for (ArrayList<Integer> group:
         groups) {
      for (Integer aGroup : group) {
        if(aGroup==0){
          continue;
        }
        System.out.print(aGroup + " ");

      }
      System.out.println();

    }


  }
}

