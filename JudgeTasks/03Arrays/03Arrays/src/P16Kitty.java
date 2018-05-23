import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P16Kitty {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    String input = console.nextLine();
    String jumpsInput = console.nextLine();

    ArrayList<Character> inputChars = new ArrayList<>();

    for (int i = 0; i < input.length(); i++) {
      inputChars.add(input.charAt(i));

    }
    String[] str = jumpsInput.split(" ");

    ArrayList<Integer> arrJumps = new ArrayList<>();

    for (String strInput : str
      ) {
      arrJumps.add(Integer.parseInt(strInput));

    }
    int jumps = 0;
    int soulCollect = 0;
    int foodCollect = 0;
    int deadLocks = 0;


    int chars = 0;
    int jumpsK = 0;
    int firstChar = input.charAt(chars);


    if (firstChar == '@') {
      soulCollect++;
      inputChars.set(chars, '0');


    } else if (firstChar == '*') {
      foodCollect++;
      inputChars.set(chars, '0');


    } else if (firstChar == 'x') {
      System.out.println("You are deadlocked, you greedy kitty!");
      System.out.printf("Jumps before deadlock: %d", jumps);
      return;
    }


    chars += arrJumps.get(0);
    while (chars >= inputChars.size() || chars < 0) {



      if (chars >= inputChars.size()) {
        chars -= inputChars.size();
      } else if (chars < 0) {
        chars += inputChars.size();

      }
    }
    while (jumps < arrJumps.size()) {
      int nextChar = inputChars.get(chars);

      if (nextChar == '@') {
        soulCollect++;
        jumps++;
        inputChars.set(chars, '0');
        if (jumpsK < arrJumps.size() - 1) {
          jumpsK++;
          chars += arrJumps.get(jumpsK);
        } else {
          break;
        }
        while (chars >= inputChars.size() || chars < 0) {
          if (chars >= inputChars.size()) {
            chars -= inputChars.size();
          } else if (chars < 0) {
            chars += inputChars.size();

          }

        }
      } else if (nextChar == '*') {
        foodCollect++;
        jumps++;
        inputChars.set(chars, '0');
        if (jumpsK < arrJumps.size() - 1) {
          jumpsK++;
          chars += arrJumps.get(jumpsK);
        } else {
          break;
        }

        while (chars >= inputChars.size() || chars < 0) {
          if (chars >= inputChars.size()) {
            chars -= inputChars.size();
          } else if (chars < 0) {
            chars += inputChars.size();

          }

        }

      } else if (nextChar == '0') {
        jumps++;
        if (jumpsK < arrJumps.size() - 1) {
          jumpsK++;
          chars += arrJumps.get(jumpsK);
        } else {
          break;
        }

        while (chars >= inputChars.size() || chars < 0) {
          if (chars >= inputChars.size()) {
            chars -= inputChars.size();
          } else if (chars < 0) {
            chars += inputChars.size();

          }

        }
      } else if (nextChar == 'x' && (foodCollect > 0 || soulCollect > 0)) {
        if (chars % 2 == 0&&soulCollect>0){
          soulCollect--;
          inputChars.set(chars, '@');
          jumps++;
          deadLocks++;
        } else if(chars % 2 == 1&&foodCollect>0){
          foodCollect--;
          inputChars.set(chars, '*');
          jumps++;
          deadLocks++;
        }else {
          jumps++;
          System.out.println("You are deadlocked, you greedy kitty!");
          System.out.printf("Jumps before deadlock: %d", jumps);
          return;
        }



        if (jumpsK < arrJumps.size() - 1) {
          jumpsK++;
          chars += arrJumps.get(jumpsK);
        } else {
          break;
        }
        while (chars >= inputChars.size() || chars < 0) {
          if (chars >= inputChars.size()) {
            chars -= inputChars.size();
          } else if (chars < 0) {
            chars += inputChars.size();

          }

        }
      } else if (nextChar == 'x' && foodCollect == 0 && jumps < arrJumps.size()) {
        System.out.println("You are deadlocked, you greedy kitty!");
        System.out.printf("Jumps before deadlock: %d", jumps);
        break;

      }


    }
    if (jumps == arrJumps.size())

    {
      System.out.printf("Coder souls collected: %d%n", soulCollect);
      System.out.printf("Food collected: %d%n", foodCollect);
      System.out.printf("Deadlocks: %d", deadLocks);
    }

  }
}

