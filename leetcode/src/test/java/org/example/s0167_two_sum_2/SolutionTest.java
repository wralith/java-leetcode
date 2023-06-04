package org.example.s0167_two_sum_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void twoSumExample1() {
    var nums = new int[] {2, 7, 11, 15};
    var target = 9;
    var want = new int[] {1, 2};
    var got = new Solution().twoSum(nums, target);
    assertArrayEquals(want, got);
  }

  @Test
  void twoSumExample2() {
    var nums = new int[] {2, 3, 4};
    var target = 6;
    var want = new int[] {1, 3};
    var got = new Solution().twoSum(nums, target);
    assertArrayEquals(want, got);
  }

  @Test
  void twoSumExample3() {
    var nums = new int[] {-1, 0};
    var target = -1;
    var want = new int[] {1, 2};
    var got = new Solution().twoSum(nums, target);
    assertArrayEquals(want, got);
  }
}
