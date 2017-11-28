package com.bazyl.credits.sorters;


/**
 * An abstract class with only one implementation method, which describe swap routine.
 *
 * @author Kyrylo Svintsov
 * @version %I%
 * @since 1.0
 */
public abstract class AbstractBubbleSorter extends AbstractSorter {

  /**
   * An abstract method guarantees a realization of the full Bubble sorting algorithm.
   *
   * @param array this array will be sorted
   */
  public abstract void sortArray(int[] array);

  /**
   * Swaps the elements of the array.
   *
   * @param array array, where elements will be swaped
   * @param i first position element
   * @param j second position element
   */
  void swap(int[] array, int i, int j) {
    int t = array[i];
    array[i] = array[j];
    array[j] = t;
  }

}
