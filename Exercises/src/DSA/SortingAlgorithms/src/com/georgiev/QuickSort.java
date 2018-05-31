package com.georgiev;

import java.util.Arrays;
import java.util.List;

public class QuickSort {
  /**
   * Quick sort implementation.
   */
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 5, 77, 50000, 4, 2, 265, 3, 4, 6, 67, 8, 8, 111, 3);
    int left = 0;
    int right = list.size()-1;
    printList(list);
    quickSort(list, left, right);
    printList(list);

  }

  private static void quickSort(List<Integer> list, int left, int right) {
    if (left >= right) {
      return;
    }
    int index = partition(list, left, right);

    quickSort(list, left, index - 1);
    quickSort(list, index + 1, right);
  }

  private static int partition(List<Integer> list, int first, int last) {
    int pivot = list.get(first);
    int left = first + 1;
    int right = last;

    boolean isDone = false;

    while (!isDone) {
      while (left <= right && list.get(left) <= pivot) {
        left += 1;
      }
      while (right >= left && list.get(right) >= pivot) {
        right -= 1;
      }
      if (right < left) {
        isDone = true;
      } else {
        int temp = list.get(right);
        list.set(right, list.get(left));
        list.set(left, temp);
      }
    }
    int temp = list.get(first);
    list.set(first, list.get(right));
    list.set(right, temp);
    return right;
  }

  private static void printList(List<Integer> list) {
    list.forEach(x -> System.out.print(x + " "));
    System.out.println();
  }

}
