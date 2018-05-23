import java.text.DecimalFormat;
import java.util.Scanner;

public class P05_BiggestOfThree {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double c = Double.parseDouble(console.nextLine());
        double d = Double.parseDouble(console.nextLine());
        double e = Double.parseDouble(console.nextLine());

        DecimalFormat df = new DecimalFormat("0.###############");


        if (a >= b && a >= c && a >= d && a >= e) {
            System.out.println(df.format(a));

        } else if (b > a && b >= c && b >= d && b >= e) {
            System.out.println(df.format(b));

        } else if (c > a && c > b && c >= d && c >= e) {
            System.out.println(df.format(c));

        } else if (d > a && d > b && d > c && d >= e) {
            System.out.println(df.format(d));

        } else if (e > a && e > b && e > c && e > d) {
            System.out.println(df.format(e));
        }
    }
}