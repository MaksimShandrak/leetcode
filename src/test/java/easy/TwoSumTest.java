package easy;

import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSumTest1() {
        int[] nums = {2,7,11,15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {0, 1};
        assert(actual[0] == expected[0]);
        assert(actual[1] == expected[1]);
    }

    @Test
    public void twoSumTes2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {1, 2};
        assert(actual[0] == expected[0]);
        assert(actual[1] == expected[1]);
    }

    @Test
    public void twoSumTest3() {
        int[] nums = {3, 3};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {0, 1};
        assert(actual[0] == expected[0]);
        assert(actual[1] == expected[1]);
    }

}
