package org.example.s0238_product_of_array_except_self;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void productExceptSelfExample1() {
    var nums = new int[] {1, 2, 3, 4};
    var want = new int[] {24, 12, 8, 6};
    var got = new Solution().productExceptSelf(nums);
    assertArrayEquals(want, got);
  }

  @Test
  void productExceptSelfExample2() {
    var nums = new int[] {-1, 1, 0, -3, 3};
    var want = new int[] {0, 0, 9, 0, 0};
    var got = new Solution().productExceptSelf(nums);
    assertArrayEquals(want, got);
  }
}
