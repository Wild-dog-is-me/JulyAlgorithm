package org.dog.seven_two;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/02/11:04 PM
 */

public class Test02 {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int len = nums.length;
    int[] res = new int[len];
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        if (i == j) continue;
        if (nums[i] > nums[j]) res[i]++;
      }
    }
    return res;
  }

  public int[] smallerNumbersThanCurrent01(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();  // 记录数字 nums[i] 有多少比他小的数字
    int[] res = Arrays.copyOf(nums, nums.length);
    Arrays.sort(res);
    for (int i = 0; i < res.length; i++) {
      if (!(map.containsKey(res[i]))) { // 遇到相同数字，不需要更新该number的情况
        map.put(res[i], i);
      }
    }

    for (int i = 0; i < nums.length; i++) {
      res[i] = map.get(nums[i]);
    }
    return res;
  }
}
