import java.util.Scanner;

public class P14_GuessTheDate {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int year = Integer.parseInt(console.nextLine());
        int month = Integer.parseInt(console.nextLine());
        int day = Integer.parseInt(console.nextLine());

        if (day>1)
        switch (month) {
            case 1:
                System.out.printf("%d-JAN-%d", day - 1, year);
                break;
            case 2:
                System.out.printf("%d-Feb-%d", day - 1, year);
                break;
            case 3:
                System.out.printf("%d-Mar-%d", day - 1, year);
                break;
            case 4:
                System.out.printf("%d-Apr-%d", day - 1, year);
                break;
            case 5:
                System.out.printf("%d-May-%d", day - 1, year);
                break;
            case 6:
                System.out.printf("%d-Jun-%d", day - 1, year);
                break;
            case 7:
                System.out.printf("%d-Jul-%d", day - 1, year);
                break;
            case 8:
                System.out.printf("%d-Aug-%d", day - 1, year);
                break;
            case 9:
                System.out.printf("%d-Sep-%d", day - 1, year);
                break;
            case 10:
                System.out.printf("%d-Oct-%d", day - 1, year);
                break;
            case 11:
                System.out.printf("%d-Nov-%d", day - 1, year);
                break;
            case 12:
                System.out.printf("%d-Dec-%d", day - 1, year);
                break;

        }else if(day==1)
        switch (month) {
            case 1:
                System.out.printf("31-Dec-%d",year-1);
                break;
            case 2:
                System.out.printf("%d-Jan-%d", day, year);
                break;
            case 3:
                System.out.printf("%d-Feb-%d", day, year-1);
                break;
            case 4:
                System.out.printf("%d-Apr-%d", day, year);
                break;
            case 5:
                System.out.printf("%d-May-%d", day, year);
                break;
            case 6:
                System.out.printf("%d-Jun-%d", day, year);
                break;
            case 7:
                System.out.printf("%d-Jul-%d", day, year);
                break;
            case 8:
                System.out.printf("%d-Aug-%d", day, year);
                break;
            case 9:
                System.out.printf("%d-Sep-%d", day, year);
                break;
            case 10:
                System.out.printf("%d-Oct-%d", day, year);
                break;
            case 11:
                System.out.printf("%d-Nov-%d", day, year);
                break;
            case 12:
                System.out.printf("%d-Dec-%d", day, year);
                break;
        }
    }
}
