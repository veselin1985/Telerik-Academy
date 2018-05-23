import java.util.*;

public class P06_MaxSumOfK_Elements {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int k = Integer.parseInt(console.nextLine());
        List<Integer> intArr = new ArrayList<Integer>();
        int sum=0;

        for (int i = 0; i <n ; i++) {

            intArr.add(console.nextInt());

        }
        intArr.sort(Comparator.naturalOrder());

        for (int i = intArr.size()-1; i >=intArr.size()-k ; i--) {
            sum+=intArr.get(i);


        }
        System.out.println(sum);
        }
    }

