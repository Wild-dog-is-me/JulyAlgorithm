package org.dog.seven_seven;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/07/10:51 AM
 */

class Solution2 {
  public int maxmiumScore(int[] cards, int cnt) {
    Arrays.sort(cards);
    int sum = 0;
    int index = cards.length - 1;
    while (cnt > 0) {
      sum += cards[index--];
      cnt--;
    }
    if(sum % 2 == 0){
      return sum;
    }
    for (int i = index; i >= 0; i--) {
      for (int j = index + 1; j < cards.length; j++) {
        sum -= cards[j];
        sum += cards[i];
        if (sum % 2 == 0) {
          return sum;
        }
        sum -= cards[i];
        sum += cards[j];
      }
    }
    return 0;
  }
}
