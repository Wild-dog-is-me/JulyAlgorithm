package org.dog.seven_nine;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/09/9:57 AM
 */

public class Test02 {
  public boolean canJump(int[] nums) {
    int maxPos = 0;
    for (int i = 0; i < nums.length; i++) {
      maxPos = Math.max(maxPos, i + nums[i]);
      if (nums[i] == 0 && maxPos == i && i != nums.length - 1) {
        return false;
      }
    }
    return true;
  }
}
