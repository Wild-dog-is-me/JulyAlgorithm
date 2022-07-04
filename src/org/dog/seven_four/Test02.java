package org.dog.seven_four;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/04/8:52 PM
 */

class Solution {
  public int sumOddLengthSubArrays(int[] arr) {
    int n = arr.length;
    int[] sums = new int[n + 1];
    for (int i = 0; i < n; i++) {
      sums[i + 1] = sums[i] + arr[i];
    }

    int sum = 0;
    for (int start = 0; start < n; start++) {
      for (int length = 1; length + start <= n; length += 2) {
        int end = start + length;
        sum += sums[end] - sums[start];
      }
    }
    return sum;
  }
}
