import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P03OnlineMarket {

  private static Set<String> productNames = new HashSet<>();
  private static Map<Double, TreeSet<Product>> byPrice = new HashMap<>();
  private static Map<String, TreeSet<Product>> byType = new HashMap<>();
  private static TreeSet<Double> prices = new TreeSet<>();
  private static DecimalFormat df = new DecimalFormat("#.###############################################");
  private static OutputWriter outputWriter = new OutputWriter();
  private static InputReader console = new InputReader();

  public static void main(String[] args) throws IOException {


    while (true) {

      String input = console.readLine();
      String[] command = input.split(" ");

      switch (command[0]) {

        case "add":
          addProduct(command);
          break;
        case "filter":
          if (command[2].equals("type")) {
            filterByType(command);
            break;
          }
          if (command[2].equals("price") && command[3].equals("from") && command.length == 5) {
            listPoroductsFromMin(command);
            break;

          }
          if (command[2].equals("price") && command[3].equals("from") && command.length == 7) {
            listProductsMinToMax(command);
            break;
          }
          if (command[2].equals("price") && command[3].equals("to")) {
            listProductsToMax(command);
            break;
          }
        case "end":
          outputWriter.close();
          return;
      }
    }
  }

  private static void listProductsToMax(String[] command) {
    double finishPrice = Double.parseDouble(command[4]);
    List<Product> productList = new ArrayList<>();
    boolean isFinished = false;
    for (double key : prices) {
      if (isFinished) {
        break;
      }
      if (key > finishPrice) {
        break;
      }
      TreeSet<Product> tempSet = byPrice.get(key);
      for (Product product : tempSet
          ) {
        productList.add(product);
        if (productList.size() == 10) {
          isFinished = true;
          break;
        }
      }
    }

    if (productList.size() > 0) {
      outputWriter.print("Ok: ");
      for (int i = 0; i < productList.size(); i++) {

        if (i == productList.size() - 1) {
          outputWriter.printLine(productList.get(i));


        } else {
          outputWriter.print(productList.get(i) + ", ");
        }
      }

    } else {
      outputWriter.printLine("Ok: ");
    }
  }

  private static void listProductsMinToMax(String[] command) {
    double startPrice = Double.parseDouble(command[4]);
    double finishPrice = Double.parseDouble(command[6]);
    List<Product> productList = new ArrayList<>();
    boolean isFinished = false;

    for (double key : prices) {
      if (isFinished) {
        break;
      }
      if (key >= startPrice && key <= finishPrice) {
        TreeSet<Product> tempSet = byPrice.get(key);

        for (Product product : tempSet
            ) {
          productList.add(product);
          if (productList.size() == 10) {
            isFinished = true;
            break;
          }
        }
      }
    }
    if (productList.size() > 0) {
      outputWriter.print("Ok: ");
      for (int i = 0; i < productList.size(); i++) {

        if (i == productList.size() - 1) {
          outputWriter.printLine(productList.get(i));


        } else {
          outputWriter.print(productList.get(i) + ", ");
        }
      }
    } else {
      outputWriter.printLine("Ok: ");
    }
  }

  private static void listPoroductsFromMin(String[] command) {
    double startPrice = Double.parseDouble(command[4]);
    boolean isFinished = false;
    List<Product> productList = new ArrayList<>();
    for (double key : prices) {
      if (isFinished) {
        break;
      }
      if (key >= startPrice) {
        TreeSet<Product> tempSet = byPrice.get(key);
        for (Product product : tempSet
            ) {
          productList.add(product);
          if (productList.size() == 10) {
            isFinished = true;
            break;
          }
        }
      }
    }
    if (productList.size() > 0) {
      outputWriter.print("Ok: ");
      for (int i = 0; i < productList.size(); i++) {

        if (i == productList.size() - 1) {
          outputWriter.printLine(productList.get(i));

        } else {
          outputWriter.print(productList.get(i) + ", ");
        }
      }
    } else {
      outputWriter.printLine("Ok: ");
    }
  }


  private static void filterByType(String[] command) {
    String commandType = command[3];
    if (byType.containsKey(commandType)) {
      TreeSet<Product> byTypeSet = byType.get(commandType);
      if (byTypeSet.size() > 0) {
        int counter = 1;
        int size = byTypeSet.size();
        outputWriter.print("Ok: ");
        for (Product product : byTypeSet) {

          if (size > 10) {

            if (counter == 10) {
              outputWriter.printLine(product);
              break;
            }
            outputWriter.print(product + ", ");
            counter++;

          } else {
            if (counter == size) {
              outputWriter.printLine(product);
              break;
            }
            outputWriter.print(product + ", ");
            counter++;
          }
        }
      }
    } else {
      outputWriter.printLine("Error: Type " + commandType + " does not exists");
    }

  }

  private static void addProduct(String[] command) {
    String name = command[1];
    double price = Double.parseDouble(command[2]);
    String type = command[3];
    Product product = new Product(name, price, type);
    if (productNames.contains(name)) {
      outputWriter.printLine("Error: Product " + name + " already exists");

    } else {
      if (!byPrice.containsKey(price)) {
        byPrice.put(price, new TreeSet<Product>());
      }
      if (!byType.containsKey(type)) {
        byType.put(type, new TreeSet<Product>());
      }

      TreeSet<Product> addByPrice = byPrice.get(price);
      addByPrice.add(product);
      TreeSet<Product> addByType = byType.get(type);
      addByType.add(product);
      productNames.add(name);
      prices.add(price);
      outputWriter.printLine("Ok: Product " + name + " added successfully");
    }
  }


  static class Product implements Comparable {

    public String name;
    public double price;
    public String type;

    public Product(String name, double price, String type) {
      this.name = name;
      this.price = price;
      this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
      Product other = (Product) obj;
      if (obj == null) {
        return false;
      }
      return this.name.hashCode() == other.name.hashCode();
    }

    @Override
    public int hashCode() {
      return 31 + (31 + name.hashCode()) * 14 + (type.hashCode()) * 31;
    }

    @Override
    public String toString() {
      String stringPrice = df.format(this.price);
      return String.format("%s(%s)", this.name, stringPrice);
    }

    @Override
    public int compareTo(Object other) {
      Product o = (Product) other;
      int priceCompare = Double.compare(this.price, o.price);
      if (priceCompare != 0) {
        return priceCompare;
      } else {
        int nameCompare = this.name.compareTo(o.name);
        if (nameCompare != 0) {
          return nameCompare;
        } else {
          return this.type.compareTo(o.type);
        }
      }
    }
  }

  static class OutputWriter {
    private final PrintWriter writer;

    OutputWriter() {
      writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    }

    void print(Object... objects) {
      for (int i = 0; i < objects.length; i++) {
        if (i != 0)
          writer.print(' ');
        writer.print(objects[i]);
      }
    }

    void printLine(Object... objects) {
      print(objects);
      writer.println();
    }

    void close() {
      writer.close();
    }
  }

  static class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    InputReader() {
      this.stream = System.in;
    }

    int read() {
      if (numChars == -1)
        throw new InputMismatchException();
      if (curChar >= numChars) {
        curChar = 0;
        try {
          numChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (numChars <= 0)
          return -1;
      }
      return buf[curChar++];
    }

    int readInt() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res;
    }

    long readLong() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      long res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    double readDouble() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      double res = 0;
      while (!isSpaceChar(c) && c != '.' && c != ',') {
        if (c == 'e' || c == 'E') {
          return res * Math.pow(10, readInt());
        }
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      }
      if (c == '.' || c == ',') {
        c = read();
        double m = 1;
        while (!isSpaceChar(c)) {
          if (c == 'e' || c == 'E') {
            return res * Math.pow(10, readInt());
          }
          if (c < '0' || c > '9') {
            throw new InputMismatchException();
          }
          m /= 10;
          res += (c - '0') * m;
          c = read();
        }
      }
      return res * sgn;
    }

    String readLine() {
      int c = read();
      while (isSpaceChar(c))
        c = read();
      StringBuilder res = new StringBuilder();
      do {
        res.appendCodePoint(c);
        c = read();
      } while (!isSpaceChar(c));
      return res.toString();
    }

    boolean isSpaceChar(int c) {
      return c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
  }

}

