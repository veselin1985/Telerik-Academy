import java.math.BigInteger;
import java.util.Scanner;

public class P28Pyramids {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

   long input = Long.parseLong(console.nextLine());
   long subscriber = 1;
    long counter = 0;
    while (input >= subscriber) {
      input-=subscriber;
     subscriber++;
      counter++;
    }
    System.out.println(counter);
  }
}
