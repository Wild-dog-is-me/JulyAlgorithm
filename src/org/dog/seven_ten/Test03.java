package org.dog.seven_ten;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/10/1:50 PM
 */

public class Test03 {
  public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int[] ret = new int[n];
    Arrays.fill(ret, -1);
    Deque<Integer> stack = new LinkedList<Integer>();
    for (int i = 0; i < n * 2 - 1; i++) {
      while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
        ret[stack.pop()] = nums[i % n];
      }
      stack.push(i % n);
    }
    return ret;
  }

  public static void main(String[] args) {
    Test03 test03 = new Test03();
    int[] res = {1, 2, 1};
    test03.nextGreaterElements(res);
    System.out.println(0%1);
  }
}
