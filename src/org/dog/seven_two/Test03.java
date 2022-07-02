package org.dog.seven_two;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/02/11:48 PM
 */

public class Test03 {public int minIncrementForUnique(int[] A) {
  // 先排序
  Arrays.sort(A);
  int move = 0;
  // 遍历数组，若当前元素小于等于它的前一个元素，则将其变为前一个数+1
  for (int i = 1; i < A.length; i++) {
    if (A[i] <= A[i - 1]) {
      int pre = A[i];
      A[i] = A[i - 1] + 1;
      move += A[i] - pre;
    }
  }
  return move;
}
}
