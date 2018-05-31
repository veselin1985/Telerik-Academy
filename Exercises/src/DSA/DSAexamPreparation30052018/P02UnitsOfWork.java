package DSA.DSAexamPreparation30052018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P02UnitsOfWork {


  public static Map<String, Unit> unitsMap = new HashMap<>();

  public static void main(String[] args) throws IOException {

    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));


    TreeSet<Unit> orderUnits = new TreeSet<>();



    while (true) {
      String input = console.readLine();
      String[] command = input.split(" ");

      switch (command[0]) {
        case "add":
          addUnit(command);
          break;
        case "remove":
          removeUnit(command);
          break;
        case "find":
          findUnit(command);
          break;
        case "power":
          powerUnit(command);
          break;
        case "end":
          return;

      }

    }

  }

  private static void powerUnit(String[] command) {

  }

  private static void findUnit(String[] command) {

  }

  private static void removeUnit(String[] commands) {
    if (!unitsMap.containsKey(commands[1])) {
      System.out.printf("FAIL: %s could not be found!\n", commands[1]);
    } else {
      unitsMap.remove(commands[1]);
      System.out.printf("SUCCESS: %s removed!\n", commands[1]);
    }
  }

  public static void addUnit(String[] commands) {
    if (unitsMap.containsKey(commands[1])) {
      System.out.printf("FAIL: %s added!\n", commands[1]);
    } else {
      unitsMap.put(commands[1], new Unit(commands[1], commands[2], Integer.parseInt(commands[3])));
      System.out.printf("SUCCESS: %s added!\n", commands[1]);
    }
  }

  static class Unit {
    public String name;
    public String type;
    public int attack;

    Unit(String name, String type, int attack) {
      this.name = name;
      this.type = type;
      this.attack = attack;
    }

    @Override
    public String toString() {
      return String.format("%s[%s]%s", name, type, attack);
    }

  // @Override
  // public int compareTo(Object o) {
  //   Unit unit = (Unit) o;
  //   int attackCompare = Integer.compare(this.attack, unit.attack);
  //   if (attackCompare != 0) {
  //     return -attackCompare;
  //   } else return
  // }
  }
}
