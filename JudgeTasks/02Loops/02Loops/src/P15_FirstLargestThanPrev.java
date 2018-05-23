import java.util.Scanner;

public class P15_FirstLargestThanPrev {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int[] arr = new int[n];
        boolean isTrue = true;


        for (int i = 0; i < n; i++) {

            arr[i] = console.nextInt();


        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]&& arr[i]>arr[i+1]) {
                isTrue = false;
                System.out.println(i);
                break;

            } else {
                continue;

            }


        }
        if (isTrue) System.out.println(-1);
    }
}

