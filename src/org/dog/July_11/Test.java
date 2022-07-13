package org.dog.July_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/11/11:38 PM
 */

public class Test {
  public static void main(String[] args) {
    int[] nums = {2, 7, 4, 1, 8, 1};
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    List list = new ArrayList();
    for (int i = 0; i < nums.length; i++) {
      list.add(nums[i]);
    }
    list.remove(list.size() - 1);
    System.out.println(list);

  }
}
