package org.dog.July_15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/15/7:23 PM
 */

class Solution {
  public int maxSubArray(int[] nums) {
    int ans = Integer.MIN_VALUE;
    int num = 0;
    int min = 0;
    for (int i = 0; i < nums.length; i++) {
      num += nums[i];
      ans = Math.min(ans, num - min);
      if (num < min) {
        min = num;
      }
    }
    return ans;
  }
}
