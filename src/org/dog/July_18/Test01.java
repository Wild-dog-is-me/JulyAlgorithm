package org.dog.July_18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/18/5:10 PM
 */

public class Test01 {
  public int removeElement(int[] nums, int val) {
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[ans] = nums[i];
        ans++;
      }
    }
    return ans;
  }
}
