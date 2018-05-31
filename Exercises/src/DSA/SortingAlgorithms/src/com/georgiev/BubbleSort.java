package com.georgiev;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
  /**
   * Bubble sort implementation.
   */
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(10, 5, 77, 500, 4000, 20000, 265, 3, 4, 6, 67, 8, 8, 111, 3);
    printList(list);
    bubleSort(list);
    printList(list);
  }

  private static void bubleSort(List<Integer> list) {
    boolean isSwapDone = true;

    while (isSwapDone) {
      isSwapDone = false;
      for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
          int smaller = list.get(i + 1);
          list.set(i + 1, list.get(i));
          list.set(i, smaller);
          isSwapDone = true;
        }
      }
    }
  }

  private static void printList(List<Integer> list) {
    list
        .forEach(x -> System.out.print(x + " "));
    System.out.println();
  }
}
