import java.util.*;

public class P12_SubsetOfSum {

  public static void main(String args[]) {

    Scanner console = new Scanner(System.in);

    int sum = Integer.parseInt(console.nextLine());
    String numbers = console.nextLine();
    String[] str = numbers.split(" ");

    boolean[] check = new boolean[sum + 1];

    check[0] = true;

    for (int i = 0; i <str.length; i++) {
      for (int j = sum; j >= 0; j--) {
        int current = Integer.parseInt(str[i]);
        if (check[j] && (j + current) <= sum) {
          check[j + current] = true;
        }


      }

    }if(check[sum]){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}
