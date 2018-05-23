import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P01OddNumber {

  public static void main(String[] args) throws IOException {

    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    int inputNumbers = Integer.parseInt(console.readLine());

    Map<Long,Integer> numbers = new HashMap<>();

    for (int i = 0; i <inputNumbers ; i++) {
      Long currentNumber = Long.parseLong(console.readLine());

      if(!numbers.containsKey(currentNumber)){
        numbers.put(currentNumber, 1);
      }else {
        int value = numbers.get(currentNumber);
        value++;
        numbers.put(currentNumber, value);
      }
    }
    for (Long key: numbers.keySet()) {
      int value = numbers.get(key);

      if(value % 2 == 1){
        System.out.println(key);
        break;
      }
    }
  }
}
