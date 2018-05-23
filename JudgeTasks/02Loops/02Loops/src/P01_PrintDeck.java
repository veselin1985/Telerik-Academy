import java.util.Scanner;

public class P01_PrintDeck {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String card = console.nextLine();
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        switch (card) {

            case "2":
                for (int i = 2; i <= 2; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "3":
                for (int i = 2; i <= 3; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "4":
                for (int i = 2; i <= 4; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "5":
                for (int i = 2; i <= 5; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "6":
                for (int i = 2; i <= 6; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "7":
                for (int i = 2; i <= 7; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }break;
            case "8":
                for (int i = 2; i <= 8; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "9":
                for (int i = 2; i <= 9; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "10":
                for (int i = 2; i <= 10; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "J":
                for (int i = 2; i <= 11; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "Q":
                for (int i = 2; i <= 12; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "K":
                for (int i = 2; i <= 13; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;
            case "A":
                for (int i = 2; i <= 14; i++) {
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cards[i - 2], cards[i - 2], cards[i - 2], cards[i - 2]);
                }
                break;


        }
    }
}


