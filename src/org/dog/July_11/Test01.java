package org.dog.July_11;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/11/9:59 PM
 */

public class Test01 {
  public int lastStoneWeight(int[] stones) {
    Arrays.sort(stones);
    List<Integer> stoneList = new ArrayList();
    for (int i = 0; i < stones.length; i++) {
      stoneList.add(stones[i]);
    }
    while (stoneList.size() > 1) {
      Collections.sort(stoneList);
      if (stoneList.get(stoneList.size() - 1) > stoneList.get(stoneList.size() - 2)) {
        int tmp = stoneList.get(stoneList.size() - 1) - stoneList.get(stoneList.size() - 2);
        stoneList.set(stoneList.size() - 2, tmp);
        stoneList.remove(stoneList.get(stoneList.size() - 1));
        continue;
      }

      if (stoneList.get(stoneList.size() - 1) == stoneList.get(stoneList.size() - 2)) {
        for (int i = 0; i < 2; i++) {
          stoneList.remove(stoneList.size() - 1);
        }
      }
    }
    if (stoneList.size() == 1) {
      return stoneList.get(0);
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Test01 test01 = new Test01();
    int[] nums = {2, 7, 4, 1, 8, 1};
    System.out.println(test01.lastStoneWeight(nums));
  }
}
