package com.bazyl.credits.sorters;

import java.util.Arrays;

public class DefaultSorter implements AbstractSortable {

  @Override
  public void sortArray(int[] array) {
    Arrays.sort(array);
  }
}
