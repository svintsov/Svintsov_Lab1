package com.bazyl.credits;

import com.bazyl.credits.fillers.ArrayCreator;
import com.bazyl.credits.sorters.AbstractSortable;
import com.bazyl.credits.sorters.DefaultSorter;
import com.bazyl.credits.view.ConsoleOutput;

/**
 * Main entry point class of the application. Consist only one method named main
 *
 * @author Kyrylo Svintsov
 * @version %I%
 * @since 1.5
 */
public class Main {

  /**
   * Main method of the application. Creates arrays and sorts them, shows input to a console.
   *
   * @param args default params when starting the app
   */
  public static void main(String[] args) {
    int[] myArray = ArrayCreator.getRandomArray(10);
    ConsoleOutput.showArray(myArray);
    AbstractSortable sorter = new DefaultSorter();
    sorter.sortArray(myArray);
    ConsoleOutput.showArray(myArray);

  }
}
