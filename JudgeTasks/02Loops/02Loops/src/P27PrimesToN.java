import java.util.Scanner;

public class P27PrimesToN {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int n = Integer.parseInt(console.nextLine());

    System.out.print(1+" ");
    for (int i = 2; i <n ; i++) {
      int maxDiveder = (int)Math.sqrt(i);
      boolean isPrime = true;
      for (int devider =maxDiveder; devider >0 ; devider--) {
        if (i%devider==0){
          isPrime =false;
          break;
        }

      }if (isPrime){
        System.out.print(i+" ");
      }
    }
  }
}
