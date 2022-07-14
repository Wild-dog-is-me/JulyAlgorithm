package org.dog.July_14;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/14/10:24 PM
 */

class Solution2 {
  public List<Integer> spiralOrder(int[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
      return new LinkedList<>();
    int l = 0;
    int r = matrix[0].length - 1;
    int u = 0;
    int d = matrix.length - 1;
    List<Integer> list = new LinkedList<>();
    while (l <= r && u <= d){
      for (int i = l; i <= r; i++) {
        list.add(matrix[u][i]);
      }
      u++;
      for (int i = u; i <= d; i++) {
        list.add(matrix[i][r]);
      }
      r--;
      for (int i = r; i >= l && u <= d; i--) {
        list.add(matrix[d][i]);
      }
      d--;
      for (int i = d; i >= u && l <= r; i--) {
        list.add(matrix[i][l]);
      }
      l++;
    }
    return list;
  }
}
