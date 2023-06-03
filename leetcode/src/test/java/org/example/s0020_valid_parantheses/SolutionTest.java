package org.example.s0020_valid_parantheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void isValidExample1() {
    var input = "()";
    var got = new Solution().isValid(input);
    assertTrue(got);
  }

  @Test
  void isValidExample2() {
    var input = "()[]{}";
    var got = new Solution().isValid(input);
    assertTrue(got);
  }

  @Test
  void isValidExample3() {
    var input = "(]";
    var got = new Solution().isValid(input);
    assertFalse(got);
    }

    @Test
  void isValidExample4() {
    var input = "([)]";
    var got = new Solution().isValid(input);
    assertFalse(got);
  }
}
