package org.example.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListNodeTest {
  @Test
  public void create() {
    var arr = new int[] {1, 2, 3};
    var got = ListNode.fromValues(1, 2, 3);

    for (int i : arr) {
      assertEquals(i, got.val);
      got = got.next;
    }
  }

  @Test
  public void createEmpty() {
    var got = ListNode.fromValues();

    assertTrue(ListNode.isSameList(null, got));
  }
}
