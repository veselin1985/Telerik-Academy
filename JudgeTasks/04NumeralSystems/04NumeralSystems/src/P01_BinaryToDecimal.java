import java.util.Scanner;

public class P01_BinaryToDecimal {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int currentNum = 0;
        String num = console.nextLine();

        for (int i = 0; i <num.length() ; i++) {
            int currentChar = num.charAt(i)- '0';
            currentNum += Math.pow(2.0,num.length()-1-i )*currentChar;

        }
        System.out.println(currentNum);



    }
}
