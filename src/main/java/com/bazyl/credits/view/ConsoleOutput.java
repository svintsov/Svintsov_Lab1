package com.bazyl.credits.view;

import java.util.Map;

public class ConsoleOutput {

  public static void showArray(int[] array) {
    for (int element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static void showMap(Map<String, Long> map) {
    for (Map.Entry<String, Long> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " with total time: " + entry.getValue());
    }
  }
}
