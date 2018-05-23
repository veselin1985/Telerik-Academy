import java.text.DecimalFormat;
import java.util.Scanner;

public class P01_ExchangeIfGrater {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        DecimalFormat df = new DecimalFormat("0.##########");
        if (a <= b) {

            System.out.printf("%s %s", df.format(a), df.format(b));
        } else {
            System.out.printf("%s %s", df.format(b), df.format(a));
        }
    }
}
