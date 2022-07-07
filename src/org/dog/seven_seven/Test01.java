package org.dog.seven_seven;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/07/10:38 AM
 */

class Solution {
  public int findContentChildren(int[] g, int[] s) {
    int child = 0;
    int cookie = 0;
    Arrays.sort(g);
    Arrays.sort(s);
    while (child < g.length && cookie < s.length) {
      if (g[child] <= s[cookie]) {
        child++;
      }
      cookie++;
    }
    return child;
  }
}
