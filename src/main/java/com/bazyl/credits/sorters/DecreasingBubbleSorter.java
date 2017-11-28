package com.bazyl.credits.sorters;

import com.bazyl.credits.analyzer.SortClass;

/**
 * A sorter class that sorts array with Bubble sorting algorithm.
 *
 * @author Kyrylo Svintsov
 * @version %I%
 * @since 1.0
 */
@SortClass
public class DecreasingBubbleSorter extends AbstractBubbleSorter {

  /**
   * Implementation of Bubble sorting algorithm starting from the end of the array.
   *
   * @param array some array to be sorted
   * @see <a href="https://en.wikipedia.org/wiki/Bubble_sort">Bubble sorting</a>
   */
  @Override
  public void sortArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = array.length - 1; j > i; j--) {
        if (array[j - 1] > array[j]) {
          swap(array, j - 1, j);
        }
      }
    }
  }
}