package com.bazyl.credits.fillers;

import java.util.Random;

/**
 * Util class that consist of methods, which creates arrays and returns references to them
 *
 * @author Kyrylo Svintsov
 * @version %I%
 */
public class ArrayCreator {

  /**
   * Creates array with specific length. Elements of the array are already sorted.
   *
   * @param length length of created array
   * @return reference to created array
   */
  public static int[] getSortedArray(int length) {
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      array[i] = i;
    }
    return array;
  }

  /**
   * Creates array with specific length. Elements of the array are already sorted except the last
   * element, which is random value
   *
   * @param length length of created array
   * @return reference to created array
   */
  public static int[] getSortdedWithOneRandomArray(int length) {
    int[] array = new int[length];
    for (int i = 0; i < length - 1; i++) {
      array[i] = i;
    }
    array[length - 1] = new Random().nextInt((int) System.currentTimeMillis());
    return array;
  }

  /**
   * Creates array with specific length. Elements of the array are already sorted in descending
   * order.
   *
   * @param length length of created array
   * @return reference to created array
   */
  public static int[] getReversedSortedArray(int length) {
    int[] array = new int[length];
    for (int i = length - 1; i >= 0; i--) {
      array[i] = i;
    }
    return array;
  }

  /**
   * Creates array with specific length. Elements of the array are random values.
   *
   * @param length length of created array
   * @return reference to created array
   */
  public static int[] getRandomArray(int length) {
    int[] array = new int[length];
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      array[i] = random.nextInt((int) System.currentTimeMillis());
    }
    return array;
  }

}
