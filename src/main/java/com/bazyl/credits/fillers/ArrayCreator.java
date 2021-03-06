package com.bazyl.credits.fillers;

import com.bazyl.credits.analyzer.SortingMethod;
import java.util.Random;

/**
 * Util class that consist of methods, whose option is to create arrays and return references of
 * array.
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
  @SortingMethod
  public static int[] getSortedArray(int length) {
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      array[i] = i;
    }
    return array;
  }

  /**
   * Creates array with specific length. Elements of the array are already sorted except the last
   * element, which is random value.
   *
   * @param length length of created array
   * @return reference to created array
   */
  @SortingMethod
  public static int[] getSortdedWithOneRandomArray(int length) {
    int[] array = new int[length];
    for (int i = 0; i < length - 1; i++) {
      array[i] = i;
    }
    array[length - 1] = new Random().nextInt(50);
    return array;
  }

  /**
   * Creates array with specific length. Elements of the array are already sorted in descending
   * order.
   *
   * @param length length of created array
   * @return reference to created array
   */
  @SortingMethod
  public static int[] getReversedSortedArray(int length) {
    int[] array = new int[length];
    int value = length - 1;
    for (int i = 0; i < length - 1; i++) {
      array[i] = value--;
    }
    return array;
  }

  /**
   * Creates array with specific length. Elements of the array are random values.
   *
   * @param length length of created array
   * @return reference to created array
   */
  @SortingMethod
  public static int[] getRandomArray(int length) {
    int[] array = new int[length];
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      array[i] = random.nextInt(50);
    }
    return array;
  }

}
