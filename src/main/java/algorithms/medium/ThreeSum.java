package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List result = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int z = nums.length - 1; z >= j + 1; z--) {
                    int res = nums[i] + nums[j] + nums[z];
                    if(res > 0) {
                    } else if(res < 0) {
                        break;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[z]));
                        while(j < nums.length - 1 && nums[j] == nums[j + 1]) j++;
                        while(z > j && nums[z] == nums[z - 1]) z--;
                        break;
                    }
                }
            }
        }
        return result;
    }

}
