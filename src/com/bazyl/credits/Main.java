package com.bazyl.credits;

import com.bazyl.credits.fillers.ArrayCreator;
import com.bazyl.credits.sorters.AbstractSortable;
import com.bazyl.credits.sorters.DefaultSorter;
import com.bazyl.credits.view.ConsoleOutput;

public class Main {

  public static void main(String[] args) {
    int[] myArray = ArrayCreator.getRandomArray(10);
    ConsoleOutput.showArray(myArray);
    AbstractSortable sorter = new DefaultSorter();
    sorter.sortArray(myArray);
    ConsoleOutput.showArray(myArray);

  }
}
