package algorithms.easy;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int result = 0;
        int[] tmp = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }

}
