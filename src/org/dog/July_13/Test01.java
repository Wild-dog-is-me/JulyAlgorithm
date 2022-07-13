package org.dog.July_13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/13/10:25 PM
 */

public class Test01 {
  public int majorityElement(int[] nums) {
    int count = 0;
    int res = 0;

    for (int num : nums) {
      if (count == 0) {
        res = num;
      }
      count += (num == res) ? 1 : -1;
    }
    return res;
  }

  public static void main(String[] args) {
    Test01 test01 = new Test01();
    int[] nums = {1, 1, 2, 2, 1, 2, 2};
    System.out.println(test01.majorityElement(nums));
  }
}
