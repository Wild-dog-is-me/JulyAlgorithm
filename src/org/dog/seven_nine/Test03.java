package org.dog.seven_nine;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/09/10:13 AM
 */

public class Test03 {
  public int minSteps(int n) {
    int res = 0;
    for (int i = 2; i <= n; i++) {
      res += i;
      n /= i;
    }
    return res;
  }

  public static void main(String[] args) {
    Test03 test03 = new Test03();
    System.out.println(test03.minSteps(20));
  }
}
