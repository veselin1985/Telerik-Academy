import java.util.Scanner;

public class P20_LargestThanNeighbours {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int counter = 0;

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = console.nextInt();


        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] < arr[i + 1] && arr[i + 1] > arr[i + 2]) {
                counter++;

            }

        }
        System.out.println(counter);


    }
}

