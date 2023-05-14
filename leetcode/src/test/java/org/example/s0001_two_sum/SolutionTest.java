package org.example.s0001_two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void twoSumExample1() {
    var nums = new int[] {2, 7, 11, 15};
    var target = 9;
    var got = new Solution().twoSum(nums, target);
    var want = new int[] {0, 1};
    assertArrayEquals(want, got);
  }

  @Test
  void twoSumExample2() {
    var nums = new int[] {3, 2, 4};
    var target = 6;
    var got = new Solution().twoSum(nums, target);
    var want = new int[] {1, 2};
    assertArrayEquals(want, got);
  }

  @Test
  void twoSumExample3() {
    var nums = new int[] {3, 3};
    var target = 6;
    var got = new Solution().twoSum(nums, target);
    var want = new int[] {0, 1};
    assertArrayEquals(want, got);
  }
}
