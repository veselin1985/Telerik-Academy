import java.util.Scanner;

public class P02_BonusScore {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int score = Integer.parseInt(console.nextLine());

        if (score >= 1 && score <= 3) {
            int bonusScore = score * 10;

            System.out.println(bonusScore);
        } else if (score >= 4 && score <= 6) {
            int bonusScore = score * 100;

            System.out.println(bonusScore);
        } else if (score >= 7 && score <= 9) {
            int bonusScore = score * 1000;

            System.out.println(bonusScore);
        } else {
            System.out.println("invalid score");
        }
    }
}