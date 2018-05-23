import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class P28Hops {

  public static void main(String[] args) {

    InputReader console =new InputReader();

    String carrots = console.readLine();
    String[] arrCarrots = carrots.split(", ");

    int moves = console.readInt();
    int currentCarrots = 0;
    int maxCarrots = Integer.MIN_VALUE;

    while (moves > 0) {
      boolean[] isVisited = new boolean[arrCarrots.length];
      String input = console.readLine();
      String[] arrMoves = input.split(", ");

      int currentPossition = 0;
      currentCarrots = Integer.parseInt(arrCarrots[currentPossition]);
      isVisited[currentPossition] = true;

      {
        int index = 0;
        while (0 <= (currentPossition + Integer.parseInt(arrMoves[index])) && (currentPossition + Integer.parseInt(arrMoves[index])) <arrCarrots.length && !isVisited[currentPossition + Integer.parseInt(arrMoves[index])]) {
          currentPossition += Integer.parseInt(arrMoves[index]);
          currentCarrots += Integer.parseInt(arrCarrots[currentPossition]);
          isVisited[currentPossition] = true;
          index++;
          if (index == arrMoves.length) {
            index = 0;
          }
        }
      }if(currentCarrots>maxCarrots){
        maxCarrots=currentCarrots;
      }
      moves--;
    }
    System.out.println(maxCarrots);
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