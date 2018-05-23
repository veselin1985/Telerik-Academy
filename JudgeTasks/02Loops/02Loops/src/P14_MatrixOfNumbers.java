import java.util.Scanner;

public class P14_MatrixOfNumbers {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        for (int i = 0; i < num; i++) {

            for (int j = i + 1; j <= num + i; j++) {
                System.out.print(j);
            }
            System.out.println();


        }

    }
}

