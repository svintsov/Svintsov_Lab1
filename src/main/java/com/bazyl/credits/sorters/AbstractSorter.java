package com.bazyl.credits.sorters;

/**
 * An abstract class guarantees realization of various sorting algorithms.
 *
 * @author Kyrylo Svintsov
 * @version %I%
 * @since 1.0
 */
public abstract class AbstractSorter {

  /**
   * An abstract method that will be overrided in classes with specific type of sorting algorithms.
   *
   * @param array that array will be sorted
   */
  public abstract void sortArray(int[] array);
}
