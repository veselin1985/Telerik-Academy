
import java.util.Scanner;

public class P09_CartesianCoordinates {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        if (x == 0 && y == 0) {
            System.out.println(0);

        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);

        } else if (x > 0 && y < 0) {
            System.out.println(4);
        } else if (x == 0) {
            System.out.println(5);
        } else if (y == 0) {
            System.out.println(6);

        } else if (x > 0 && y > 0) {
            System.out.println(1);
        }
    }
}