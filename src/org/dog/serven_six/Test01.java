package org.dog.serven_six;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/06/9:53 AM
 */

public class Test01 {
  //  public int binaryGap(int n) {
//    List<Integer> binary = new ArrayList<Integer>();
//    while (n != 0) {
//      binary.add(n % 2);
//      n /= 2;
//    }
//    Collections.reverse(binary);
//
//    List<Integer> list = new ArrayList<>();
//    boolean flag = true;
//
//    for (int i = 0; i < binary.size(); i++) {
//      if (binary.get(i) == 1) {
//        int left = i;
//        flag = true;
//        for (int j = i + 1; j < binary.size() && flag == true; j++) {
//          if (binary.get(j) == 1) {
//            int right = j;
//            list.add(right - left);
//            flag = false;
//          }
//        }
//      }
//    }
//    Collections.sort(list);
//    if (list == null) {
//      return 0;
//    } else {
//      return list.get(list.size() - 1);
//    }
//  }
  public static void main(String[] args) {
    int n = 8;
    List<Integer> binary = new ArrayList<Integer>();
    while (n != 0) {
      binary.add(n % 2);
      n /= 2;
    }
    Collections.reverse(binary);
    System.out.println(binary);

    List<Integer> list = new ArrayList<>();
    boolean flag = true;

    for (int i = 0; i < binary.size(); i++) {
      if (binary.get(i) == 1) {
        int left = i;
        flag = true;
        for (int j = i + 1; j < binary.size() && flag == true; j++) {
          if (binary.get(j) == 1) {
            int right = j;
            list.add(right - left);
            flag = false;
          }
        }
      }
    }
    Collections.sort(list);
    System.out.println(list);

    if (list.size() == 0) {
      System.out.println(0);
    } else {
      System.out.println(list.get(list.size() - 1));
    }
  }
}
