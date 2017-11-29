package com.bazyl.credits;

import com.bazyl.credits.analyzer.Analyzer;
import com.bazyl.credits.view.ConsoleOutput;
import com.bazyl.credits.view.XLSOutput;
import java.lang.reflect.InvocationTargetException;

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

    Analyzer analyzer = new Analyzer();

    try {
      analyzer.gainStatistics();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    }
    ConsoleOutput.showMap(analyzer.getTimeStorage());
    XLSOutput.writeResults(analyzer.getStatistics());

  }

}
