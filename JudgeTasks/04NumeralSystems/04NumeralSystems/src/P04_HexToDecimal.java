import java.util.Scanner;

public class P04_HexToDecimal {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        long currentNum = 0;
        String num = console.nextLine();
        int currentChar = 0;
        boolean isNegative = false;

        if (num.charAt(0) == '-') {
            isNegative = true;
            num = num.replace("-", "");
        }

        for (int i = 0; i < num.length(); i++) {

            switch (num.charAt(i)) {
                case 'A':
                    currentChar = 10;
                    break;
                case 'B':
                    currentChar = 11;
                    break;
                case 'C':
                    currentChar = 12;
                    break;
                case 'D':
                    currentChar = 13;
                    break;
                case 'E':
                    currentChar = 14;
                    break;
                case 'F':
                    currentChar = 15;
                    break;
                default:
                    currentChar = num.charAt(i) - '0';

                    break;


            }int power = num.length()-1-i;
            currentNum += Math.pow(16.0, power) * currentChar;


        }
        if (isNegative) {
            System.out.println("-"+ currentNum);
        } else {
            System.out.println(currentNum);


        }
    }
}


