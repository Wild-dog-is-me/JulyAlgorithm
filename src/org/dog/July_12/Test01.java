package org.dog.July_12;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/12/11:38 AM
 */

public class Test01 {
  public int specialArray(int[] nums) {
    Arrays.sort(nums);
    int l = 1;
    int r = nums[nums.length - 1];
    while (l <= r) {
      int mid = l + (r - l) / 2;
      int count = cnt(mid, nums);
      if (count == mid) return mid;
      else if (count < mid) r = mid - 1;
      else l = mid + 1;
    }
    return -1;
  }

  // 用来统计数组中有多少个数是 >= i 的
  public int cnt(int i, int[] nums) {
    // 找到排序数组中(第一个 >= i 的数字)
    // 然后返回 (数组长度) (减去) (第一个 >= i 的数字)
    int n = nums.length;
    int l = 0;
    int r = n - 1;
    while (l < r) {
      int mid = l + (r - l) / 2;
      if (nums[mid] < i) l = mid + 1;
      else r = mid;
    }
    return n - l;
  }
}
