package org.example.s0217_contains_duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void containsDuplicateExample1() {
    var nums = new int[] {1, 2, 3, 1};
    var got = new Solution().containsDuplicate(nums);
    assertTrue(got);
  }

  @Test
  void containsDuplicateExample2() {
    var nums = new int[] {1, 2, 3, 4};
    var got = new Solution().containsDuplicate(nums);
    assertFalse(got);
  }

  @Test
  void containsDuplicateExample3() {
    var nums = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    var got = new Solution().containsDuplicate(nums);
    assertTrue(got);
  }
}
