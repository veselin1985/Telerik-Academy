import java.util.Arrays;
import java.util.Scanner;

public class P02_MaxSumOfSubseuqence {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int nums[] = new int[n];
        int maxSum = Integer.MIN_VALUE;
        int thisSum = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(console.nextLine());
        }
        for (int i = 0; i < nums.length; i++) {
            thisSum+= nums[i];

            if(thisSum>maxSum) {
                maxSum=thisSum;
            }else if (thisSum<0){
                thisSum = 0;
            }

        }
        System.out.println(maxSum);
        }
        }
