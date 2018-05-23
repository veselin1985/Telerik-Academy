import java.util.Scanner;

public class P11_MergingAndSquashing {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int numbers = Integer.parseInt(console.nextLine());

        int[] arr = new int[numbers];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(console.nextLine());

        }
        for (int i = 1; i < arr.length; i++) {
            int num1 = arr[i - 1] % 10;
            int num2 = arr[i] / 10;
            StringBuilder finalNum = sb.append(num1);
            finalNum = sb.append(num2);
            System.out.print(finalNum + " ");
            finalNum.delete(0, finalNum.length());
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            int num1 = arr[i - 1] / 10;
            int num2Temp = (arr[i - 1] % 10) + (arr[i] / 10);
            String num2ToString = String.valueOf(num2Temp);
            String num2 = String.valueOf(num2ToString.charAt(num2ToString.length() - 1));
            int num3 = arr[i] % 10;

            StringBuilder finalNum = sb.append(num1);
            finalNum = sb.append(num2);
            finalNum = sb.append(num3);
            System.out.print(finalNum + " ");
            finalNum.delete(0, finalNum.length());


        }
    }
}

