import java.util.Scanner;

public class P05_MinMaxSumAverage {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        double minNum = Double.MAX_VALUE;
        double maxNum = -100000000;
        double sum = 0;


        for (int i = 0; i < n; i++) {

            double num = Double.parseDouble(console.nextLine());

            sum += num;
            if (num < minNum) {
                minNum = num;
            }
            if (num > maxNum) {
                maxNum = num;

            }

        }double average = sum / n;
        System.out.printf("min=%.2f%n",minNum);
        System.out.printf("max=%.2f%n",maxNum);
        System.out.printf("sum=%.2f%n",sum);
        System.out.printf("avg=%.2f",average);


    }
}
