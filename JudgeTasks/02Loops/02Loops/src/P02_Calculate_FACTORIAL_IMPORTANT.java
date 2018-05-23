import java.util.Scanner;

public class P02_Calculate_FACTORIAL_IMPORTANT {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double N = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());

        double sum = 1;
        int fact = 0;

        for (int i = 1; i <= N; i++) {

            sum +=  factorial (i )/( Math.pow(x, i));
        }
        System.out.printf("%.5f", sum);
    }

     public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}
