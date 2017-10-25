package com.bazyl.credits.view;

public class ConsoleOutput {
  public static void showArray(int[] array){
    for (int element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
}
