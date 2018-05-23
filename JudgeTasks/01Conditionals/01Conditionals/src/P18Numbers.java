import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P18Numbers {


  public static void main(String[] args) {

    InputReader console = new InputReader();


    String input = console.readLine();
    String tempString = "";
    StringBuilder tempBuilder = new StringBuilder();
    while (!input.equals("end")) {

      if (input.contains("set")) {

        tempString = input.replaceAll("[^\\d.]", "");
      }
      if (input.equals("print")) {
        System.out.println(tempString);
      }
      if (input.contains("front-add")) {
        input = input.replaceAll("[^\\d.]", "");
        tempString = input + tempString;
      }
      if (input.contains("back-add")) {
        input = input.replaceAll("[^\\d.]", "");
        tempString = tempString + input;
      }
      if (input.equals("front-remove")) {
        if (tempString.length() == 0) {
          input = console.readLine();
          continue;
        } else {
          tempString = tempString.substring(1);
        }
      }
      if (input.equals("back-remove")) {
        if (tempString.length() == 0) {
          input = console.readLine();
          continue;
        } else {
          tempString = tempString.substring(0, tempString.length() - 1);
        }
      }

      if (input.equals("reverse")) {
        tempBuilder.append(tempString);
        tempBuilder.reverse();
        tempString = tempBuilder.toString();
        tempBuilder.setLength(0);
      }
      input = console.readLine();
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
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
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
      return res * sgn;
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
}