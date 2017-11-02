package com.bazyl.credits.sorters;

public abstract class AbstractBubbleSorter extends AbstractSorter {

  public abstract void sortArray(int[] array);

  void swap(int[] array, int i, int j) {
    int t = array[i];
    array[i] = array[j];
    array[j] = t;
  }

}
