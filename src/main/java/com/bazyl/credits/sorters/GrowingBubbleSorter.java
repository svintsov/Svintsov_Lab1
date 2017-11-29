package com.bazyl.credits.sorters;

import com.bazyl.credits.analyzer.SortClass;

@SortClass
public class GrowingBubbleSorter extends AbstractBubbleSorter {

  /**
   * Implementation of Bubble sorting algorithm starting from the beginning of the array.
   *
   * @param array some array to be sorted
   * @see <a href="https://en.wikipedia.org/wiki/Bubble_sort">Bubble sorting</a>
   */
  @Override
  public final long sortArray(int[] array) {
    long startTime = System.currentTimeMillis();
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          swap(array, j, j + 1);
        }
      }
    }
    long endTime = System.currentTimeMillis();
    return endTime - startTime;
  }
}
