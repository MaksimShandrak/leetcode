package algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTest {

    @Test
    public void test1() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int actualResult = containerWithMostWater.maxArea(new int[] {1,8,6,2,5,4,8,3,7});
        int expectedResult = 49;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test2() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int actualResult = containerWithMostWater.maxArea(new int[] {1,1});
        int expectedResult = 1;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test3() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int actualResult = containerWithMostWater.maxArea(new int[] {1,3,2,5,25,24,5});
        int expectedResult = 24;
        assertEquals(actualResult, expectedResult);
    }

}
