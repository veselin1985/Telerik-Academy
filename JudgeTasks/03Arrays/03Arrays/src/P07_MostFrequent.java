import java.util.Scanner;

public class P07_MostFrequent {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int nums[] = new int[n];
        int counter = 1;
        int currentCounter = 1;
        int number = Integer.MIN_VALUE;
        int currentNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(console.nextLine());
        }
        for (int i = 0; i < nums.length; i++) {
            currentCounter = 1;
            for (int j = i + 1; j < nums.length; j++)

                if (nums[i] == nums[j]) {
                    currentCounter++;
                    currentNumber = nums[i];
                    if (currentCounter > counter) {
                        counter = currentCounter;
                        number = currentNumber;
                    }
                }

        }
        System.out.printf("%d (%d times)", number, counter);
    }
}





