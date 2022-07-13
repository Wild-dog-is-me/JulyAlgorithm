package org.dog.July_13;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/13/10:52 PM
 */

public class Test02 {
  public int findPairs(int[] nums, int k) {
    Arrays.sort(nums);
    int n = nums.length, y = 0, res = 0;
    for (int x = 0; x < n; x++) {
      if (x == 0 || nums[x] != nums[x - 1]) {
        while (y < n && (nums[y] < nums[x] + k || y <= x)) {
          y++;
        }
        if (y < n && nums[y] == nums[x] + k) {
          res++;
        }
      }
    }
    return res;
  }
}
