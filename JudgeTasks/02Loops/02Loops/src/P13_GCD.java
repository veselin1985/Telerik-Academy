import java.util.Scanner;

public class P13_GCD {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);

        int a = console.nextInt();
        int b = console.nextInt();

        int num1 = Math.max(a,b);
        int num2 = Math.min(a,b);

        int maxNum = 0;

        for (int i = 1; i <= num2 ; i++) {

            if (num1%i==0 && num2%i==0){
                maxNum=i;
            }else{
                continue;
            }



        }System.out.println(maxNum);
    }
}
