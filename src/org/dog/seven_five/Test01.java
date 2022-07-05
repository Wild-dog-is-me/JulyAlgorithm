package org.dog.seven_five;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/05/3:45 PM
 */

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i = 0; i != n; ++i) {
      nums1[m + i] = nums2[i];
    }
    Arrays.sort(nums1);
  }
}


