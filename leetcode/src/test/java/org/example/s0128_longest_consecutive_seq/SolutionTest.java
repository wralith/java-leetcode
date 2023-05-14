package org.example.s0128_longest_consecutive_seq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void longestConsecutiveExample1() {
    var nums = new int[] {100, 4, 200, 1, 3, 2};
    var got = new Solution().longestConsecutive(nums);
    var want = 4;
    assertEquals(want, got);
  }

  @Test
  void longestConsecutiveExample2() {
    var nums = new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    var got = new Solution().longestConsecutive(nums);
    var want = 9;
    assertEquals(want, got);
  }
}
