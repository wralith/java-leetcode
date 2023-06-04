package org.example.s0015_3_sum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void threeSumExample1() {
    var input = new int[] {-1, 0, 1, 2, -1, -4};
    var want = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
    var got = new Solution().threeSum(input);
    assertEquals(want, got);
  }

  @Test
  void threeSumExample2() {
    var input = new int[] {0, 1, 1};
    var want = List.of();
    var got = new Solution().threeSum(input);
    assertEquals(want, got);
  }

  @Test
  void threeSumExample3() {
    var input = new int[] {0, 0, 0};
    var want = List.of(List.of(0, 0, 0));
    var got = new Solution().threeSum(input);
    assertEquals(want, got);
  }
}
