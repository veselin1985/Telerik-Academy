package com.georgiev;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {

  /**
   * Insertion sort implementation.
   * */
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 5, 77, 5, 40000, 2, 265, 3, 4, 600, 67, 8, 8, 111, 3);
    printList(list);
    bubleSort(list);
    printList(list);
  }

  private static void bubleSort(List<Integer> list) {
    int j;
    for (int i = 1; i < list.size(); i++) {
      j = i;
      while (j > 0 && list.get(j) < list.get(j - 1)) {
        int smaller = list.get(j);
        list.set(j, list.get(j - 1));
        list.set(j - 1, smaller);
        j -= 1;
      }
    }
  }

  private static void printList(List<Integer> list) {
    list
        .forEach(x -> System.out.print(x + " "));
    System.out.println();
  }
}
