package org.dog.July_15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/15/8:03 PM
 */

class Solution2 {
  public int lengthOfLIS(int[] nums) {
    int maxL = 0;
    int[] dp = new int[nums.length];
    for(int num : nums) {
      // 二分法查找, 也可以调用库函数如binary_search
      int lo = 0, hi = maxL;
      while(lo < hi) {
        int mid = lo+(hi-lo)/2;
        if(dp[mid] < num)
          lo = mid+1;
        else
          hi = mid;
      }
      dp[lo] = num;
      if(lo == maxL)
        maxL++;
    }
    return maxL;
  }
}
