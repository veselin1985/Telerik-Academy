import java.util.Scanner;

public class P08_IntDoubleString {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        if (input.equals("integer")) {

            int a = Integer.parseInt(console.nextLine());
            int result = a + 1;
            System.out.println(result);
        } else if (input.equals("real")) {

            double a = Double.parseDouble(console.nextLine());
            double result = a + 1;
            System.out.printf("%.2f", result);

        } else if (input.equals("text")) {
            String text = console.nextLine();
            System.out.printf("%s*", text);
        }
    }
}
