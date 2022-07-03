package org.dog.seven_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/03/12:45 AM
 */

public class Test02 {
  public List<Integer> targetIndices(int[] nums, int target) {
    Arrays.sort(nums);
    List list = new ArrayList();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        list.add(i);
      }
    }
    return list;
  }
}
