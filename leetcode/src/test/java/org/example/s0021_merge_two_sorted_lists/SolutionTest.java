package org.example.s0021_merge_two_sorted_lists;

import static org.junit.jupiter.api.Assertions.*;

import org.example.types.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void mergeTwoListsExample1() {
    var list1 = ListNode.fromValues(1, 2, 4);
    var list2 = ListNode.fromValues(1, 3, 4);
    var want = ListNode.fromValues(1, 1, 2, 3, 4, 4);
    var got = new Solution().mergeTwoLists(list1, list2);

    assertTrue(ListNode.isSameList(got, want));
  }

  @Test
  void mergeTwoListsExample2() {
    var list1 = ListNode.fromValues();
    var list2 = ListNode.fromValues();
    var want = ListNode.fromValues();
    var got = new Solution().mergeTwoLists(list1, list2);

    assertTrue(ListNode.isSameList(got, want));
  }

  @Test
  void mergeTwoListsExample3() {
    var list1 = ListNode.fromValues();
    var list2 = ListNode.fromValues(0);
    var want = ListNode.fromValues(0);
    var got = new Solution().mergeTwoLists(list1, list2);

    assertTrue(ListNode.isSameList(got, want));
  }
}
