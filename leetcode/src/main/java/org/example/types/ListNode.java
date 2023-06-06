package org.example.types;

import java.util.Objects;

public class ListNode {
  public int val;
  public ListNode next;

  ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode fromValues(int... nums) {
    var root = new ListNode();
    var curr = root;
    for (int num : nums) {
      curr.next = new ListNode(num);
      curr = curr.next;
    }
    return root.next;
  }

  public static boolean isSameList(ListNode list1, ListNode list2) {
     if (list1 == null && list2 == null) {
       return true;
     }
    if (list1 == null || list2 == null) {
      return false;
    }
    return (list1.val == list2.val) && isSameList(list1.next, list2.next);
  }

  @Override
  public int hashCode() {
    int result = val;
    result = 31 * result + (next != null ? next.hashCode() : 0);
    return result;
  }
}
