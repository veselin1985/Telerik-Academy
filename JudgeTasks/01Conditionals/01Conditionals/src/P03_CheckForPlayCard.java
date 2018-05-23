import java.util.Scanner;

public class P03_CheckForPlayCard {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String card = console.nextLine();

        if (card.equals("2") || card.equals("3") || card.equals("4") || card.equals("5") || card.equals("6") || card.equals("7") ||
                card.equals("7") || card.equals("8") || card.equals("9") || card.equals("10") || card.equals("J") ||
                card.equals("Q") || card.equals("K") || card.equals("A")) {
            System.out.printf("yes %s", card);

        } else {
            System.out.printf("no %s", card);
        }
    }
}

