package org.dog.seven_four;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/04/8:26 PM
 */

class NumArray {

  int[] sums;

  public NumArray(int[] nums) {
    int n = nums.length;
    sums = new int[n + 1];
    for (int i = 0; i < n; i++) {
      sums[i + 1] = sums[i] + nums[i];
    }
  }

  public int sumRange(int left, int right) {
    return sums[right + 1] - sums[left];
  }

}
