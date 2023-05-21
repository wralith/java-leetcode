package org.example.s0169_majority_element;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void majorityElementExample1() {
    var nums = new int[] {3, 2, 3};
    var want = 3;
    var got = new Solution().majorityElement(nums);
    assertEquals(want, got);
  }

  @Test
  void majorityElementExample2() {
    var nums = new int[] {2, 2, 1, 1, 1, 2, 2};
    var want = 2;
    var got = new Solution().majorityElement(nums);
    assertEquals(want, got);
  }
}
