import java.util.Scanner;

public class P10_LeastMajorityMultiple {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());
        int num3 = Integer.parseInt(console.nextLine());
        int num4 = Integer.parseInt(console.nextLine());
        int num5 = Integer.parseInt(console.nextLine());



        for (int i = 1; ; i++) {
            int counter = 0;
            if (i % num1 == 0) {
                counter++;
            }
            if (i % num2 == 0) {
                counter++;
            }
            if (i % num3 == 0) {
                counter++;
            }
            if (i % num4 == 0) {
                counter++;
            }
            if (i % num5 == 0) {
                counter++;
            }
            if (counter >= 3){
                System.out.println(i);
            break;}
        }

    }
}