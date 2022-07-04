package org.dog.seven_four;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/04/9:23 PM
 */

class Solution1 {
  public int numSubarraysWithSum(int[] nums, int goal) {
    int sum = 0;
    Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
    int ret = 0;
    for (int num : nums) {
      cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
      sum += num;
      ret += cnt.getOrDefault(sum - goal, 0);
    }
    return ret;
  }
}
