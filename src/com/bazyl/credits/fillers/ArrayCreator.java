package com.bazyl.credits.fillers;

import java.util.Random;

public class ArrayCreator {

  public static int[] getSortedArray(int length) {
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      array[i] = i;
    }
    return array;
  }

  public static int[] getSortdedWithOneRandomArray(int length) {
    int[] array = new int[length];
    for (int i = 0; i < length - 1; i++) {
      array[i] = i;
    }
    array[length - 1] = new Random().nextInt((int)System.currentTimeMillis());
    return array;
  }

  public static int[] getReversedSortedArray(int length) {
    int[] array = new int[length];
    for (int i = length - 1; i >= 0; i--) {
      array[i] = i;
    }
    return array;
  }

  public static int[] getRandomArray(int length){
    int[] array = new int[length];
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      array[i] = random.nextInt((int)System.currentTimeMillis());
    }
    return array;
  }

}
