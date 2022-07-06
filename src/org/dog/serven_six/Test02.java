package org.dog.serven_six;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/06/11:48 AM
 */

class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    int ret = 0;
    for (int i = 0; i < 32; i++) {
      if ((n & (1 << i)) != 0) {
        ret++;
      }
    }
    return ret;
  }
}
