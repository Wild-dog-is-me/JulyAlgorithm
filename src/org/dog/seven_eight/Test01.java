package org.dog.seven_eight;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/08/9:55 AM
 */

public class Test01 {
  public int minimumDifference(int[] nums, int k) {
    Arrays.sort(nums);
    int n = nums.length;
    int ans = nums[k - 1] - nums[0];
    for (int i = k; i < n; i++) {
      ans = Math.min(ans, nums[i] - nums[i - k + 1]);
    }
    return ans;
  }
}
