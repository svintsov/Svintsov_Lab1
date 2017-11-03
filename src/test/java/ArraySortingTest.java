import com.bazyl.credits.sorters.DecreasingBubbleSorter;
import com.bazyl.credits.sorters.DefaultSorter;
import com.bazyl.credits.sorters.GrowingBubbleSorter;
import org.junit.Assert;
import org.junit.Test;

public class ArraySortingTest {

  @Test
  public void testGrowingBubbleSorting() {
    int[] arraySorted = {0, 1, 2, 3};
    int[] arrayToBeSorted = {1, 0, 3, 2};
    new GrowingBubbleSorter().sortArray(arrayToBeSorted);
    Assert.assertArrayEquals(arraySorted, arrayToBeSorted);
  }

  @Test
  public void testDecreasingBubbleSorting() {
    int[] arraySorted = {0, 1, 2, 3};
    int[] arrayToBeSorted = {1, 0, 3, 2};
    new DecreasingBubbleSorter().sortArray(arrayToBeSorted);
    Assert.assertArrayEquals(arraySorted, arrayToBeSorted);
  }

  @Test
  public void testDefaultBubbleSorting() {
    int[] arraySorted = {0, 1, 2, 3};
    int[] arrayToBeSorted = {1, 0, 3, 2};
    new DefaultSorter().sortArray(arrayToBeSorted);
    Assert.assertArrayEquals(arraySorted, arrayToBeSorted);
  }

  @Test
  public void testOfAllSortings() {
    int[] arraySorted = {0, 1, 2, 3};
    int[] arrayToBeSorted = {1, 0, 3, 2};
    new DefaultSorter().sortArray(arrayToBeSorted);
    new GrowingBubbleSorter().sortArray(arrayToBeSorted);
    new DecreasingBubbleSorter().sortArray(arrayToBeSorted);
    Assert.assertArrayEquals(arraySorted, arrayToBeSorted);
  }
}
