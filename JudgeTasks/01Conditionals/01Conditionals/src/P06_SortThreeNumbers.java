import java.util.Scanner;

public class P06_SortThreeNumbers {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());

        if (a >= b && a >= c && b >= c) {
            System.out.printf("%d %d %d", a, b, c);
        } else if (a >= b && a >= c && b <= c) {
            System.out.printf("%d %d %d", a, c, b);
        } else if (b >= a && b >= c && a >= c) {
            System.out.printf("%d %d %d", b, a, c);
        } else if (b >= a && b >= c && a <= c) {
            System.out.printf("%d %d %d", b, c, a);
        } else if (c >= a && c >= b && a >= b) {
            System.out.printf("%d %d %d", c, a, b);
        } else if (c >= a && c >= b && a <= b) {
            System.out.printf("%d %d %d", c, b, a);

        }
    }
}