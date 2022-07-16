package org.dog.July_16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/16/10:58 AM
 */

public class Test01 {
  public int pivotIndex(int[] nums) {
//    int rightSum = 0;
//    int leftSum = 0;
//    for (int num : nums) {
//      rightSum += num;
//    }
//
//    for (int i = 0; i < nums.length; i++) {
//      rightSum -= nums[i];
//      if (rightSum == leftSum) return i;
//      leftSum += nums[i];
//    }
//    return -1;
    int l = 0;
    int r = 0;
    for (int i : nums) {
      r += i;
    }
    r -= nums[0];

    for (int i = 0; i < nums.length; i++) {
      if (l == r) {
        return i;
      }
      l += nums[i];
      r -= nums[i + 1];
    }

    return -1;

    }


  public static void main(String[] args) {
    Test01 test01 = new Test01();
    int[] nums = {1, 7, 3, 6, 5, 6};
    System.out.println(test01.pivotIndex(nums));
  }
}
