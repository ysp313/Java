package algo;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTrainingTest extends TestCase {

    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void testReverseFirstAndLast() throws Exception {
        Assert.assertArrayEquals(new int[]{1, 2, 3}, ArrayTraining.reverseFirstAndLast(new int[]{3, 2, 1}));
        Assert.assertArrayEquals(new int[]{9, 3, 4, 7}, ArrayTraining.reverseFirstAndLast(new int[]{7, 3, 4, 9}));
    }

    // Tests for countByInterval()

    @Test
    public void testEmptyArray() throws Exception {
        Assert.assertArrayEquals(new int[]{0, 0, 0, 0}, ArrayTraining.countByInterval(new int[]{}));
    }

    @Test
    public void testSimpleArray() throws Exception {
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1}, ArrayTraining.countByInterval(new int[]{3, 8, 11, 15}));
    }

    @Test
    public void testBoundaries() throws Exception {
        Assert.assertArrayEquals(new int[]{2, 2, 2, 2}, ArrayTraining.countByInterval(new int[]{0, 6, 7, 9, 10, 12, 13, 20}));
    }

    @Test
    public void testSomeArray() throws Exception {
        Assert.assertArrayEquals(new int[]{7, 3, 3, 8}, ArrayTraining.countByInterval(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}));
    }

}
