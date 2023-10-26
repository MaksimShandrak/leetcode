package algorithms.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {

    @Test
    public void test1() {
        ThreeSum threeSum = new ThreeSum();
        List actualResult = threeSum.threeSum(new int[] {-1,0,1,2,-1,-4});
        List<List<Integer>> expectedResult = new ArrayList();
        expectedResult.add(Arrays.asList(-1, -1, 2));
        expectedResult.add(Arrays.asList(-1, 0, 1));
        assertEquals(expectedResult, actualResult);
    }

}
