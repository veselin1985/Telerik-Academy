import java.util.ArrayList;
import java.util.Scanner;

public class P22PrimesToN {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int n = Integer.parseInt(console.nextLine());


    for (int number = 1; number < n + 1; number++) {
   if (isPrime(number)){
     System.out.print(number+" ");
      }

    }

  } static boolean isPrime (int number){

    int maxDivider = (int)Math.sqrt(number);

    for (int i = 2; i <= maxDivider ; i++) {
      if(number%i==0){
        return false;
      }

    }return true;


  }
}