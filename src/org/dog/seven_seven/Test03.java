package org.dog.seven_seven;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/07/1:05 PM
 */

class Solution3 {
  public int maxIncreaseKeepingSkyline(int[][] grid) {
    int ans = 0;
    int rowMax[] = new int[grid.length];
    int colMax[] = new int[grid.length];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid.length; j++) {
        rowMax[i] = Math.max(rowMax[i], grid[i][j]);
        colMax[j] = Math.max(colMax[j], grid[i][j]);
      }
    }
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid.length; j++) {
        ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];
      }
    }
    return ans;
  }
}
