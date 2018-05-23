import java.util.Scanner;

public class P04_MultiplicationSign {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double c = Double.parseDouble(console.nextLine());

        double result = a * b * c;

        if (result < 0) {
            System.out.println("-");
        } else if (result == 0) {
            System.out.println("0");
        } else {
            System.out.println("+");
        }
    }
}