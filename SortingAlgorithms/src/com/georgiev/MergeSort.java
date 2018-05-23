package com.georgiev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSort {

  /**
   * Merge sort implementation.
   */
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 5, 77, 5, 400, 2, 265, 3, 4, 600,
        670000, 80, 8, 11100, 3);


    printList(list);
    sort(list);
    printList(list);
  }

  private static void sort(List<Integer> list) {
    List<Integer> temp = Stream.generate(() -> 0)
        .limit(list.size())
        .collect(Collectors.toList());
    int startIndex = 0;
    int endIndex = list.size();

    mergeSort(list, startIndex, endIndex, temp);

  }

  private static void mergeSort(List<Integer> list, int startIndex, int endIndex,
                                List<Integer> temp) {
    if (endIndex - startIndex <= 1) {
      return;
    }
    int middleIndex = (endIndex + startIndex) / 2;

    mergeSort(list, startIndex, middleIndex, temp);
    mergeSort(list, middleIndex, endIndex, temp);

    merge(list, startIndex, middleIndex, endIndex, temp);
  }

  private static void merge(List<Integer> list, int startIndex, int middleIndex, int endIndex,
                            List<Integer> temp) {
    int left = startIndex;
    int right = middleIndex;
    int index = startIndex;

    while (left < middleIndex && right < endIndex) {
      if (list.get(left) < list.get(right)) {
        temp.set(index, list.get(left));
        left++;
      } else {
        temp.set(index, list.get(right));
        right++;
      }
      index++;
    }
    while (left < middleIndex) {
      temp.set(index, list.get(left));
      left++;
      index++;
    }
    while (right < endIndex) {
      temp.set(index, list.get(right));
      right++;
      index++;
    }
    for (int i = startIndex; i < endIndex; i++) {
      list.set(i, temp.get(i));

    }
  }


  private static void printList(List<Integer> list) {
    list.forEach(x -> System.out.print(x + " "));
    System.out.println();
  }
}
