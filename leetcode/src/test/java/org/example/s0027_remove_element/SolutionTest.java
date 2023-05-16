package org.example.s0027_remove_element;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void removeElementExample1() {
    var nums = new int[] {3, 2, 2, 3};
    var val = 3;
    var want = 2;
    var wantNums = new int[] {2, 2};
    var got = new Solution().removeElement(nums, val);
    assertEquals(want, got);
    for (int i = 0; i < wantNums.length; i++) {
      assertEquals(wantNums[i], nums[i]);
    }
  }

  @Test
  void removeElementExample2() {
    var nums = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
    var val = 2;
    var want = 5;
    var wantNums = new int[] {0, 1, 3, 0, 4};
    var got = new Solution().removeElement(nums, val);
    assertEquals(want, got);
    for (int i = 0; i < wantNums.length; i++) {
      assertEquals(wantNums[i], nums[i]);
    }
  }
}
