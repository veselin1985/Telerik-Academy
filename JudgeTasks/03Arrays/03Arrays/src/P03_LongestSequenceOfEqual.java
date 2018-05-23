import java.util.Scanner;

public class P03_LongestSequenceOfEqual {

    public static void main(String[] args) {

            Scanner console = new Scanner(System.in);

            int n = Integer.parseInt(console.nextLine());
            int nums[] = new int[n];
            int counter = 1;
            int currentCounter = 1;


            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(console.nextLine());
            }
            for (int i = 1; i < nums.length; i++)

                if (nums[i - 1] == nums[i]) {
                    currentCounter++;

                    if(currentCounter>counter){
                        counter=currentCounter;

                    }


                }else {currentCounter = counter;
                currentCounter = 1;

            } System.out.println(counter);

        }


    }

