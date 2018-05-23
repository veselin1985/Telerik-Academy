import java.util.Scanner;

public class P19_MazeRunner {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        String result = "";


        for (int i = 0; i < n; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int num = console.nextInt();

            int first = num / 1000;
            int second = (num / 100) % 10;
            int third = (num / 10) % 10;
            int fourth = num % 10;

            if (first % 2 == 0) {
                evenSum += first;
            } else {
                oddSum += first;
            }
            if (second % 2 == 0) {
                evenSum += second;
            } else {
                oddSum += second;
            }
            if (third % 2 == 0) {
                evenSum += third;
            } else {
                oddSum += third;
            }
            if (fourth % 2 == 0) {
                evenSum += fourth;
            } else {
                oddSum += fourth;
            }
            if (evenSum > oddSum) {
                result+="left\n";
            } else if (evenSum == oddSum) {
               result+="straight\n";
            } else {
                result+="right\n";

            }
        }
        System.out.println(result);
    }
}

