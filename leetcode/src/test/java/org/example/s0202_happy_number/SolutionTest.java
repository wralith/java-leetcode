package org.example.s0202_happy_number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isHappyExample1() {
    var input = 19;
    var want = true;
    var got = new Solution().isHappy(input);
    assertEquals(want, got);
  }

  @Test
  void isHappyExample2() {
    var input = 2;
    var want = false;
    var got = new Solution().isHappy(input);
    assertEquals(want, got);
  }
}
