import java.util.Scanner;

public class P26_Kolbi {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int flasks = console.nextInt();
        double litters = console.nextDouble();

       double currentFlask = 2;


        for (int i = 2; i <= flasks; i++) {


            if (i % 2 == 0) {
                currentFlask += i;
                continue;

            }
            if (currentFlask >= litters) {
                System.out.println(i);
                break;

            }
            currentFlask += i;

        }
    }
}
