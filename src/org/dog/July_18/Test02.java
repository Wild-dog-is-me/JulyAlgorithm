package org.dog.July_18;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/18/5:28 PM
 */

public class Test02 {
  public int strStr(String haystack, String needle) {
    int h = haystack.length(),n = needle.length();
    for(int i = 0; i <= h-n; i ++){
      if(needle.equals(haystack.substring(i,i+n))) return i;
    }
    return -1;

  }
}
