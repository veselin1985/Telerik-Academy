package com.georgiev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingSort {
  /**
   * Insertion sort implementation for positive numbers.
   */
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 5, 7, 5, 2, 25, 3, 4, 60, 67, 8, 8, 3);
    printList(list);
    countingSort(list);

  }

  private static void countingSort(List<Integer> list) {
    int maxNum = list.stream()
        .mapToInt(x -> x)
        .max()
        .getAsInt();

    List<Integer> buckets = Stream.generate(() -> 0)
        .limit(maxNum + 1)
        .collect(Collectors.toList());

    for (int val : list) {
      int num = buckets.get(val) + 1;
      buckets.set(val, num);

    }
    for (int i = 0; i < maxNum + 1; i++) {
      for (int j = 0; j < buckets.get(i); j++) {
        System.out.print(i + " ");

      }

    }
  }

  private static void printList(List<Integer> list) {
    list.forEach(x -> System.out.print(x + " "));
    System.out.println();
  }
}
