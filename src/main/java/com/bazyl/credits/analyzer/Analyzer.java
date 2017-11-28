package com.bazyl.credits.analyzer;

import com.bazyl.credits.fillers.ArrayCreator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class Analyzer {

  private int classCounter;

  public int getClassCounter() {
    return classCounter;
  }

  public void countSortClasses() {
    Set<Class<?>> classes = new org.reflections.Reflections("com.bazyl.credits")
        .getTypesAnnotatedWith(SortClass.class);
    Class<?> classGenerator = ArrayCreator.class;
    for (Method generationMethod : classGenerator.getDeclaredMethods()) {
      try {
        int[] array = (int[]) generationMethod.invoke(null, (Object) 10);
        sortingCalls(array, classes);
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      } catch (InvocationTargetException e) {
        e.printStackTrace();
      }
    }
  }

  private void sortingCalls(int[] array, Set<Class<?>> classes)
      throws IllegalAccessException, InvocationTargetException {
    for (Class<?> entry : classes) {
      for (Method method : entry.getDeclaredMethods()) {
        try {
          Object object = entry.newInstance();
          method.invoke(object, (Object) array);
        } catch (InstantiationException e) {
          e.printStackTrace();
        }
      }
      for (int el : array) {
        System.out.print(el + " ");
      }
      System.out.println();
    }
  }
}
