package com.bazyl.credits.sorters;

public class GrowingBubbleSorter implements AbstractSortable {

  /**
   * Implementation of Bubble sorting algorithm starting from the begin of the array.
   *
   * @param array some array to be sorted
   * @see <a href="https://en.wikipedia.org/wiki/Bubble_sort">Bubble sorting</a>
   */
  @Override
  public void sortArray(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          int t = array[j];
          array[j] = array[j + 1];
          array[j + 1] = t;
        }
      }
    }
  }
}
