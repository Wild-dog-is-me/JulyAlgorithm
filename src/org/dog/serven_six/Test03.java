package org.dog.serven_six;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/06/12:01 PM
 */

class Solution2 {
  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer i : nums) {
      Integer count = map.get(i);
      count = count == null ? 1 : ++count;
      map.put(i, count);
    }
    for (Integer i : map.keySet()) {
      Integer count = map.get(i);
      if (count == 1) {
        return i;
      }
    }
    return -1; // can't find it.
  }
}
