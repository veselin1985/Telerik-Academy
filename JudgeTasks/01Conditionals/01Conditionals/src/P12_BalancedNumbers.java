import java.util.Scanner;

public class P12_BalancedNumbers {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        int a = num % 10;
        int b = (num / 10) % 10;
        int c = (num / 100) % 10;
        int sum = num;

        while (a + c == b) {
            int num1 = Integer.parseInt(console.nextLine());
            int d = num1 % 10;
            int e = (num1 / 10) % 10;
            int f = (num1 / 100) % 10;

            if (d + f == e) {
                sum += num1;
            }  else{
                    break;
                }

            }
            System.out.println(sum);

        }
    }


