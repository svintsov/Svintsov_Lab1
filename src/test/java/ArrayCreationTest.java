import com.bazyl.credits.fillers.ArrayCreator;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCreationTest {

  @Test
  public void testCreationOfSortedArray() {
    int[] arrayDefault = {0, 1, 2, 3};
    int[] arrayCreatedFromFunction = ArrayCreator.getSortedArray(4);
    Assert.assertArrayEquals(arrayDefault, arrayCreatedFromFunction);
  }

  @Test
  public void testCreationOfSortedWithOneRandomArray() {
    int[] arrayDefault = new int[3];
    arrayDefault[0] = 0;
    arrayDefault[1] = 5;
    arrayDefault[2] = new Random().nextInt();
    int[] arrayCreatedFromFunction = ArrayCreator.getSortedArray(3);
    Assert.assertNotEquals(arrayDefault[2], arrayCreatedFromFunction[2]);
  }

  @Test
  public void testCreationOfReverseSortedArray() {
    int[] arrayDefault = {3, 2, 1, 0};
    int[] arrayCreatedFromFunction = ArrayCreator.getReversedSortedArray(4);
    Assert.assertArrayEquals(arrayDefault, arrayCreatedFromFunction);
  }
}
