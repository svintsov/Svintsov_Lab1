package com.bazyl.credits.sorters;

public class DecreasingBubbleSort implements AbstractSortable {

  @Override
  public void sortArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = array.length-1; j > i; j--) {
        if (array[j-1] > array[j]) {
          int t = array[j];
          array[j] = array[j - 1];
          array[j - 1] = t;
        }
      }
    }
  }
}
