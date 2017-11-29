package com.bazyl.credits.analyzer;

import com.bazyl.credits.fillers.ArrayCreator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Analyzer {

  private int arrayLength = 100;
  private Map<String, Long> timeStorage = new HashMap<String, Long>();
  private Map<Integer, Map<String, Long>> statistics = new HashMap<Integer, Map<String, Long>>();

  public int getArrayLength() {
    return arrayLength;
  }

  public void setArrayLength(int arrayLength) {
    this.arrayLength = arrayLength;
  }

  public Map<Integer, Map<String, Long>> getStatistics() {
    return statistics;
  }

  public Map<String, Long> getTimeStorage() {
    return timeStorage;
  }

  public void gainStatistics()
      throws IllegalAccessException, InvocationTargetException, InstantiationException {
    for (int i = 0; i < 3; i++) {
      sortingCalls();
      statistics.put(arrayLength, timeStorage);
      arrayLength *= 10;
    }
  }

  private void sortingCalls()
      throws IllegalAccessException, InvocationTargetException, InstantiationException {
    Set<Class<?>> classes = new org.reflections.Reflections("com.bazyl.credits")
        .getTypesAnnotatedWith(SortClass.class);
    Class<?> classGenerator = ArrayCreator.class;
    timeStorage = new HashMap<String, Long>();
    for (Class<?> entry : classes) {
      for (Method sortMethod : entry.getDeclaredMethods()) {
        long complexSortTime = 0;
        for (Method generationMethod : classGenerator.getDeclaredMethods()) {
          complexSortTime += doCallsAndGetTime(entry, generationMethod, sortMethod);
        }
        timeStorage.put(entry.getSimpleName(), complexSortTime);
      }
    }
  }

  private Long doCallsAndGetTime(Class<?> entry, Method generationMethod, Method sortMethod)
      throws IllegalAccessException, InvocationTargetException, InstantiationException {
    int[] array = (int[]) generationMethod.invoke(null, (Object) arrayLength);
    Object object = entry.newInstance();
    return (Long) sortMethod.invoke(object, (Object) array);
  }
}


