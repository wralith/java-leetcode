package org.example.s0066_plus_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void plusOneExample1() {
    var digits = new int[] {1, 2, 3};
    var want = new int[] {1, 2, 4};
    var got = new Solution().plusOne(digits);
    assertArrayEquals(want, got);
  }

  @Test
  void plusOneExample2() {
    var digits = new int[] {4, 3, 2, 1};
    var want = new int[] {4, 3, 2, 2};
    var got = new Solution().plusOne(digits);
    assertArrayEquals(want, got);
  }

  @Test
  void plusOneExample3() {
    var digits = new int[] {9};
    var want = new int[] {1, 0};
    var got = new Solution().plusOne(digits);
    assertArrayEquals(want, got);
  }
}
