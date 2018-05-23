import java.util.Scanner;

public class P22_DobriChisla {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int start =console.nextInt();
        int finish = console.nextInt();
        int counter = 0;
        int numbers = finish - start+1;
        for (int i = start; i <= finish; i++) {
            String string = i + "";
            for (int j = 0; j < string.length(); j++) {
                int test = (string.charAt(j) - '0');
                if (string.charAt(j) - '0' == 0) {
                    continue;
                }

                if (i % (string.charAt(j) - '0') == 0) {


                } else {
                    numbers--;
                    break;
                }

            }


        }
        System.out.println(numbers);
    }
}
