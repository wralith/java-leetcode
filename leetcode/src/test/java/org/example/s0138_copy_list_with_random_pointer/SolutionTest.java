package org.example.s0138_copy_list_with_random_pointer;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.types.ListNodeWithRandomPointer;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void copyRandomListExample1() {
    var node4 = new ListNodeWithRandomPointer(1);
    var node3 = new ListNodeWithRandomPointer(10, node4);
    var node2 = new ListNodeWithRandomPointer(11, node3);
    var node1 = new ListNodeWithRandomPointer(13, node2);
    var node0 = new ListNodeWithRandomPointer(7, node1);
    node1.random = node0;
    node2.random = node4;
    node3.random = node2;
    node4.random = node0;

    var got = new Solution().copyRandomList(node0);
    assertNotEquals(got, node0);
    assertThat(got).usingRecursiveComparison().isEqualTo(node0);
  }

  @Test
  void copyRandomListExample2() {
    var node1 = new ListNodeWithRandomPointer(1);
    var node0 = new ListNodeWithRandomPointer(2, node1);
    node1.random = node1;

    var got = new Solution().copyRandomList(node0);
    assertNotEquals(got, node0);
    assertThat(got).usingRecursiveComparison().isEqualTo(node0);
  }

  @Test
  void copyRandomListExample3() {
    var node2 = new ListNodeWithRandomPointer(3);
    var node1 = new ListNodeWithRandomPointer(3, node2);
    var node0 = new ListNodeWithRandomPointer(3, node1);
    node2.random = node0;

    var got = new Solution().copyRandomList(node0);
    assertNotEquals(got, node0);
    assertThat(got).usingRecursiveComparison().isEqualTo(node0);
  }
}
