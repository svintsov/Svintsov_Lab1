package com.bazyl.credits.sorters;

public class GrowingBubbleSorter extends AbstractBubbleSorter {

  /**
   * Implementation of Bubble sorting algorithm starting from the beginning of the array.
   *
   * @param array some array to be sorted
   * @see <a href="https://en.wikipedia.org/wiki/Bubble_sort">Bubble sorting</a>
   */
  @Override
  public final void sortArray(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          swap(array, j, j + 1);
        }
      }
    }
  }
}
