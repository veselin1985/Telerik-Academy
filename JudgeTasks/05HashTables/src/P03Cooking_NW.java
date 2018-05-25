import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class P03Cooking_NW {

  public static void main(String[] args) throws IOException {

    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat df = new DecimalFormat("#0.00");

    Map<String, Double> cook = new HashMap<>();
    List<String> productAppearance = new ArrayList<>();

    int n = Integer.parseInt(console.readLine());
//fill the map with all products - qty converted to cups.

    for (int i = 0; i < n; i++) {

      String input = console.readLine();
      if (input.endsWith(":")) {
        input = input + "null";
      }
      String[] arrInput = input.split(":");

      double quantity = Double.parseDouble(arrInput[0]);
      StringBuilder sb = new StringBuilder();
      sb.append(arrInput[1]);
      sb.append(":");
      sb.append(arrInput[2]);

      String measure = arrInput[1];
      String product = arrInput[2];
      String measureSwitch;

      switch (measure) {
        case "gallons":
          measureSwitch = "gals";
          break;
        case "quarts":
          measureSwitch = "qts";
          break;
        case "pints":
          measureSwitch = "pts";
          break;
        case "liters":
          measureSwitch = "ls";
          break;
        case "fluid ounces":
          measureSwitch = "fl ozs";
          break;
        case "tablespoons":
          measureSwitch = "tbsps";
          break;
        case "teaspoons":
          measureSwitch = "tsps";
          break;
        case "milliliters":
          measureSwitch = "mls";
          break;
        case "cups":
          measureSwitch = "cups";
          break;
        default:
          measureSwitch = measure;
      }

      quantity = qtyToCupMeasure(measureSwitch, quantity);

      if (cook.isEmpty()) {
        cook.put(sb.toString(), quantity);
        productAppearance.add(product);
        sb.setLength(0);
      } else {
        for (String key : cook.keySet()) {
          if (key.toLowerCase().contains(product.toLowerCase())) {
            double updateQty = cook.get(key) + quantity;
            cook.put(key, updateQty);
            sb.setLength(0);
          } else {
            cook.put(sb.toString(), quantity);
            productAppearance.add(product);
            sb.setLength(0);
          }
        }
      }
    }
    int m = Integer.parseInt(console.readLine());

    for (int i = 0; i < m; i++) {
      String input = console.readLine();
      if (input.endsWith(":")) {
        input = input + "null";
      }
      String[] arrInput = input.split(":");


      double quantity = Double.parseDouble(arrInput[0]);
      String measure = arrInput[1];
      String product = arrInput[2];
      String measureSwitch;

      switch (measure) {
        case "gallons":
          measureSwitch = "gals";
          break;
        case "quarts":
          measureSwitch = "qts";
          break;
        case "pints":
          measureSwitch = "pts";
          break;
        case "liters":
          measureSwitch = "ls";
          break;
        case "fluid ounces":
          measureSwitch = "fl ozs";
          break;
        case "tablespoons":
          measureSwitch = "tbsps";
          break;
        case "teaspoons":
          measureSwitch = "tsps";
          break;
        case "milliliters":
          measureSwitch = "mls";
          break;
        case "cups":
          measureSwitch = "cups";
          break;
          default:
            measureSwitch = measure;
      }

      quantity = qtyToCupMeasure(measureSwitch, quantity);

      if (cook.isEmpty()) {
        return;
      } else {
        for (String key : cook.keySet()) {
          if (key.toLowerCase().contains(product.toLowerCase())) {
            if (cook.get(key) <= quantity) {
              cook.remove(key);
              productAppearance.remove(product);
            } else {
              double updateQty = cook.get(key) - quantity;
              cook.put(key, updateQty);
            }
          }
        }
      }
    }
    //printing the output with origin measure type.
    for (int i = 0; i < productAppearance.size(); i++) {

      String productCheck = productAppearance.get(i);

      for (String key : cook.keySet()
          ) {
        if (key.toLowerCase().contains(productCheck.toLowerCase())) {
          if (key.toLowerCase().contains("null")) {
            int keyReSize = key.length() - "null".length();
            key = key.substring(0, keyReSize);
          }
          double outputQty = cook.get(key);
          if (key.contains("gals") || key.contains("gallons")) {
            outputQty = cook.get(key) / 16;
          } else if (key.contains("qts") || key.contains("quarts")) {
            outputQty = cook.get(key) / 4;
          } else if (key.contains("pts") || key.contains("pints")) {
            outputQty = cook.get(key) / 2;
          } else if (key.contains("ls") || key.contains("liters")) {
            outputQty = cook.get(key) / 4.166666;
          } else if (key.contains("fl ozs") || key.contains("fluid ounces")) {
            outputQty = cook.get(key) / 0.125;
          } else if (key.contains("tbsps") || key.contains("tablespoons")) {
            outputQty = cook.get(key) / 0.0625;
          } else if (key.contains("tsps") || key.contains("teaspoons")) {
            outputQty = cook.get(key) / 0.0208333333;
          } else if (key.contains("mls") || key.contains("milliliters ")) {
            outputQty = cook.get(key) / 0.00416666;
          } else if (key.contains("cups")) {
            outputQty = cook.get(key);
          }

          System.out.printf("%s:%s\n", df.format(outputQty), key);

        }
      }
    }
  }

  private static double qtyToCupMeasure(String measure, double quantity) {
    switch (measure.toLowerCase()) {
      case "gals":
        quantity = quantity * 16;
        break;
      case "qts":
        quantity = quantity * 4;
        break;
      case "pts":
        quantity = quantity * 2;
        break;
      case "ls":
        quantity = quantity * 4.166666;
        break;
      case "fl ozs":
        quantity = quantity * 0.125;
        break;
      case "tbsps":
        quantity = quantity * 0.0208333333;
        break;
      case "tsps":
        quantity = quantity * 0.0625;
        break;
      case "mls":
        quantity = quantity * 0.00416666;
        break;
      default:
        quantity = quantity * 1;
        break;
    }
    return quantity;
  }
}
