package org.example.s0206_reverse_linked_list;

import static org.junit.jupiter.api.Assertions.*;

import org.example.types.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void reverseListExample1() {
    var head = ListNode.fromValues(1, 2, 3, 4, 5);
    var want = ListNode.fromValues(5, 4, 3, 2, 1);
    var got = new Solution().reverseList(head);

    assertTrue(ListNode.isSameList(got, want));
  }

  @Test
  void reverseListExample2() {
    var head = ListNode.fromValues(1, 2);
    var want = ListNode.fromValues(2, 1);
    var got = new Solution().reverseList(head);

    assertTrue(ListNode.isSameList(got, want));
  }

  @Test
  void reverseListExample3() {
    var head = ListNode.fromValues();
    var want = ListNode.fromValues();
    var got = new Solution().reverseList(head);

    assertTrue(ListNode.isSameList(got, want));
  }
}
