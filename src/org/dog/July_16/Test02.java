package org.dog.July_16;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/16/11:26 AM
 */

public class Test02 {
  public int subarraysDivByK(int[] nums, int k) {
    Map<Integer, Integer> record = new HashMap<Integer, Integer>();
    record.put(0, 1);
    int sum = 0, ans = 0;
    for (int elem : nums) {
      sum += elem;
      int modulus = (sum % k + k) % k;
      int same = record.getOrDefault(modulus, 0);
      ans += same;
      record.put(modulus, same + 1);
    }
    return ans;
  }
}
