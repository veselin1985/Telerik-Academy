import java.util.Scanner;

public class P09_StringsSecretMSG {


    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);

        String word = console.nextLine();

        String word1 = word.replaceAll("\\d+","");

        for (int i =  word1.length()-1; i >=0; i--) {

            System.out.print(word1.charAt(i));
        }

    }
}
