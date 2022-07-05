package org.dog.seven_five;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/05/4:45 PM
 */

public class Test02 {
  public boolean hasCycle(ListNode head) {
    Set<ListNode> set = new HashSet<ListNode>();
    while (head != null) {
      if (!set.add(head)) {
        return true;
      }
      head = head.next;
    }
    return true;
  }
}
