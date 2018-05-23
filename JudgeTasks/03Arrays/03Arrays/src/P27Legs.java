import java.util.Scanner;

public class P27Legs {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int sum = Integer.parseInt(console.nextLine());
    int[] check = new int[sum + 1];

    check[0] = 1;
    int[] str = {2, 5, 7};

    check[0] = 1;

    for (int i = 0; i < str.length; i++) {
      for (int j = 0; j <= sum; j++) {
        int current = str[i];
        if (check[j] > 0 && (j + current) <= sum) {
          if (check[j]== 1) {
            check[j + current] += 1;
          } else if(check[j]> 1)  {
            check[j + current] =  check[j + current] + check[j];

          }
        }

      }

    }System.out.println(check[sum]);
  }
}
