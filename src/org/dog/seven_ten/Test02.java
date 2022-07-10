package org.dog.seven_ten;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/10/1:19 PM
 */

public class Test02 {
  public int[] dailyTemperatures(int[] temperatures) {
    int len = temperatures.length;
    int[] ans = new int[len];
    boolean flag = true;
    for (int i = 0; i < len; i++) {
      flag = true;
      for (int j = i+1; j < len; j++) {
        if (temperatures[i] < temperatures[j] && flag == true) {
          ans[i] = j - i;
          flag = false;
          break;
        } else {
          ans[i] = 0;
        }
      }
    }
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i]);
    }
    return ans;
  }

  public static void main(String[] args) {
    Test02 test02 = new Test02();
    int[] test = {30, 40, 50, 60};
    test02.dailyTemperatures(test);

  }
}
