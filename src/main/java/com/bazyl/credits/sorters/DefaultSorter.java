package com.bazyl.credits.sorters;

import com.bazyl.credits.analyzer.SortClass;
import java.util.Arrays;

/**
 * A sorter class that defines a method with default implementation of sorting algorithm.
 *
 * @author Kyrylo Svintsov
 * @version %I%
 * @since 1.0
 */
@SortClass
public class DefaultSorter extends AbstractSorter {

  /**
   * Sorts an array with default method
   *
   * @param array some array to be sorted
   * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort(int[])">Java
   * manual</a>
   */
  @Override
  public void sortArray(int[] array) {
    Arrays.sort(array);
  }
}
