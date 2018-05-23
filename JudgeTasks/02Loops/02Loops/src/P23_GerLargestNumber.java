import java.util.Scanner;

public class P23_GerLargestNumber {
    public static void main(String[] args) {



    Scanner console = new Scanner(System.in);
    int num1 = console.nextInt();
    int num2 = console.nextInt();
    int num3 = console.nextInt();

    int d = getMax(num1, num2);
    int f = getMax(num3, d);

    System.out.println(f);
}


   public static int getMax(int number, int number2) {


        return Math.max(number, number2);
    }
}
