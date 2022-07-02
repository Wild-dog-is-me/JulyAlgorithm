package org.dog.seven_two;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/02/10:24 PM
 */

class Test01{
  public int maximumProduct(int[] nums) {

    // 从小到大排序
    Arrays.sort(nums);

    // 取数组规模
    int size = nums.length;

    // 取最三位相乘即位最大值（分正负）
    int positiveNumber = nums[size - 1] * nums[size - 2] * nums[size - 3];
    int negativeNumber = nums[0] * nums[1] * nums[size - 1];

    return Math.max(positiveNumber, negativeNumber);
  }
}

