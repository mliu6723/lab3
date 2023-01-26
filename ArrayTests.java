import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
	}

    @Test 
	public void testReverseInPlaceAgain() {
        int[] input1 = { 3, 4, 1, 9 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 9, 1, 4, 3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedAgain() {
    int[] input1 = {3, 1, 10 };
    assertArrayEquals(new int[]{10, 1, 3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {3, 1, 1, 1, 5 };
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input1), 0);
  }
}
