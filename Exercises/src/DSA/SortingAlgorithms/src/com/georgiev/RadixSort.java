package com.georgiev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RadixSort {

  /**
   * Radix sort implementation.
   */
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(10, 5, 77, 500, 4000, 20000, 265, 3, 4, 6, 67, 8, 8, 111, 3);
    printList(list);
    list = radixSort(list);
    printList(list);

  }

  private static List<Integer> radixSort(List<Integer> list) {

    int step = 0;
    int maxLenght = list.stream()
        .mapToInt(x -> x)
        .max()
        .getAsInt();

    while (maxLenght > Math.pow(10, step)) {
      list = toList(toBuckets(list, step));
      step++;

    }
    return list;
  }

  private static List<Integer> toList(List<List<Integer>> buckets) {
    List<Integer> list = new ArrayList<>();

    for (List<Integer> bucket : buckets) {
      list.addAll(bucket);
    }
    return list;
  }

  private static List<List<Integer>> toBuckets(List<Integer> list, int step) {
    List<List<Integer>> buckets = Stream.generate(() -> new ArrayList<Integer>())
        .limit(10)
        .collect(Collectors.toList());

    for (int val : list
        ) {
      int bucket = (int) ((val / Math.pow(10, step)) % 10);
      buckets.get(bucket).add(val);
    }
    return buckets;
  }

  private static void printList(List<Integer> list) {
    list.forEach(x -> System.out.print(x + " "));
    System.out.println();
  }
}
