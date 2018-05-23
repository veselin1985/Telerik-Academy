import java.util.Scanner;

public class P16_CrockedDigits {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String num = console.nextLine();


        int sum = 0;

        do
        {sum = 0;
        {for (int i = 0; i < num.length(); i++) {

                int charNum = num.charAt(i) - '0';
                if (charNum == -2 || charNum == -3) {
                    continue;
                } else {
                    sum += charNum;
                }
            }num=sum+"";

        } }while (sum > 9);
        System.out.println(sum);
    }


}



