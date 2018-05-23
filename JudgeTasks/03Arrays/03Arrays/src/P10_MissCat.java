import java.util.Scanner;

public class P10_MissCat {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int[] cats = new int[10];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());

            switch (num) {
                case 1:
                    cats[0]++;
                    break;
                case 2:
                    cats[1]++;
                    break;
                case 3:
                    cats[2]++;
                    break;
                case 4:
                    cats[3]++;
                    break;
                case 5:
                    cats[4]++;
                    break;
                case 6:
                    cats[5]++;
                    break;
                case 7:
                    cats[6]++;
                    break;
                case 8:
                    cats[7]++;
                    break;
                case 9:
                    cats[8]++;
                    break;
                case 10:
                    cats[9]++;
                    break;
                default:
            }


        }
        int maxNum = 0;
        int cat = 0;
        int i=0;
        while(i<10) {
            if (cats[i] > maxNum) {
                maxNum = cats[i];
                cat = i+1;

            }i++;

        }
        System.out.println(cat);

    }

}
