import java.util.Scanner;

public class P10_OddOrEvenProduct {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        long oddSum = 1;
        long evenSum = 1;


        for (int i = 0; i < n; i++) {
            int num = console.nextInt();


            if (i%2==0){
                oddSum*=num;
            }else {
                evenSum*=num;
            }


        }if (evenSum==oddSum) {
            System.out.printf("yes %d", oddSum);
        }else {
            System.out.printf("no %d %d", oddSum,evenSum);
        }
    }
}
