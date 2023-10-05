package algorithms.hard;

import algorithms.easy.TwoSum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void test1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expectedResult = 2.0;
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double actualResult = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        assert(expectedResult == actualResult);
    }

}
