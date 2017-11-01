package com.bazyl.credits.sorters;

/**
 * This inteface will be implemented by sorter classes.
 *
 * @author Kyrylo Svintsov
 * @version %I%
 * @since 1.0
 */
public interface AbstractSortable {

  /**
   * Implementing this method classes are promised to make sort of arrays
   *
   * @param array some array to be sorted
   */
  void sortArray(int[] array);
}
