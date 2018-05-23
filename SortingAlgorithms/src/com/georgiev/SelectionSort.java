package com.georgiev;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {
  /**
   * Selection sort implementation.
   */

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 5, 77, 5, 4, 2, 3, 4, 6, 67, 8, 8);
    printList(list);
    selectionSort(list);
    printList(list);
  }

  private static void selectionSort(List<Integer> list) {

    for (int i = 0; i < list.size() - 1; i++) {
      int bestIndex = i;
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j) < list.get(bestIndex)) {
          bestIndex = j;
        }
        if (bestIndex != i) {
          int smaller = list.get(bestIndex);

          list.set(bestIndex, list.get(i));
          list.set(i, smaller);

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
