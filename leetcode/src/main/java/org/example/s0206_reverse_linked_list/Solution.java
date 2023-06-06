package org.example.s0206_reverse_linked_list;

import org.example.types.ListNode;

class Solution {
  // Recursive

  // Beats 100% Runtime, 91% Memory
  public ListNode reverseList(ListNode head) {
    return rev(head, null);
  }

  private ListNode rev(ListNode curr, ListNode prev) {
    if (curr == null) {
      return prev;
    }
    var temp = curr.next;
    curr.next = prev;
    return rev(temp, curr);
  }

  // Iterative

  // Beats 100% Runtime, 67% Memory
  public ListNode reverseListIterative(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;

    while (curr != null) {
      var next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }

}
