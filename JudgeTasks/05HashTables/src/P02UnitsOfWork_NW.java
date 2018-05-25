import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P02UnitsOfWork_NW {

  public static void main(String[] args) throws IOException {


    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    String input = console.readLine();
    List<String> inputStrings= new ArrayList<>();

    while (!console.readLine().equals("end")){

      inputStrings.add(input);
      input = console.readLine();

    }


  }
}
