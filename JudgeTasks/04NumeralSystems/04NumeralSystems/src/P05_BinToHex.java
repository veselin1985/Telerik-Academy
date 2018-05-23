import java.util.Scanner;

public class P05_BinToHex {

  public static void main(String[] args) {


    Scanner console = new Scanner(System.in);
    StringBuilder binNumber = new StringBuilder(console.nextLine());
    StringBuilder hexNumber = new StringBuilder();
    StringBuilder work = new StringBuilder();


    while (binNumber.length() > 0) {

      if (binNumber.length() == 1) {
        work.append("000");
        work.append(binNumber);
        binNumber = work;
      } else if (binNumber.length() == 2) {
        work.append("00");
        work.append(binNumber);
        binNumber = work;;
      } else if (binNumber.length() == 3) {
        work.append("0");
        work.append(binNumber);
        binNumber = work;
      } else {

        short currentNum = 0;

        if (binNumber.charAt(binNumber.length() - 4) == 48) {
          currentNum += Math.pow(2.0, 3) * 0;
        } else {
          currentNum += Math.pow(2.0, 3) * 1;

        }

        if (binNumber.charAt(binNumber.length() - 3) == 48) {
          currentNum += Math.pow(2.0, 2) * 0;
        } else {
          currentNum += Math.pow(2.0, 2) * 1;
        }

        if (binNumber.charAt(binNumber.length() - 2) == 48) {
          currentNum += Math.pow(2.0, 1) * 0;
        } else {
          currentNum += Math.pow(2.0, 1) * 1;
        }

        if (binNumber.charAt(binNumber.length() - 1) == 48) {
          currentNum += Math.pow(2.0, 0) * 0;
        } else {
          currentNum += Math.pow(2.0, 0) * 1;
        }


        if (currentNum == (short) 10) {
          hexNumber.append("A");
        } else if (currentNum == (short) 11) {
          hexNumber.append("B");
        } else if (currentNum == (short) 12) {
          hexNumber.append("C");
        } else if (currentNum == (short) 13) {
          hexNumber.append("D");
        } else if (currentNum == (short) 14) {
          hexNumber.append("E");
        } else if (currentNum == (short) 15) {
          hexNumber.append("F");
        } else if (currentNum == (short) 0) {
          binNumber.delete(binNumber.length() - 4, binNumber.length());
          continue;
        } else {
          hexNumber.append(currentNum);
        }
        binNumber.delete(binNumber.length() - 4, binNumber.length());
      }


    }
    System.out.println(hexNumber.reverse());

  }
}
