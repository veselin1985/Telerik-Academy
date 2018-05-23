import java.util.Scanner;

public class P11_GameTreeNum {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        int a = num % 10;
        int b = (num / 10) % 10;
        int c = (num / 100) % 10;
        int sum = 5;

        if ((a == 1 || a==0) && b > 1 && c >1) {
            sum = c * b + a;
        }else if ((a == 1 || a==0) &&(b == 1 || b==0) && c >1) {
            sum = c + b + a;
        }else if ((a == 1 || a==0) &&(b == 1 || b==0) && c ==1) {
            sum = c + b + a;
        }else if (a > 1  &&b==0 && c >1) {
            sum = c + b + a;
        }else if (a > 1  && b == 1 && c >1) {
            sum = c * b * a;
        }else if (a > 1  &&(b == 1 || b==0) && c ==1) {
            sum = c + b + a;
        }else if (a > 1  && b>1 && c ==1) {
            sum = c + b * a;
        } else if (a > 1  && b>1 && c >1) {
            sum = c * b * a;
        } System.out.println(sum);
    }
}
