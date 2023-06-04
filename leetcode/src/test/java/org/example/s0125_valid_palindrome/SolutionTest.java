package org.example.s0125_valid_palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isPalindromeExample1() {
    var input = "A man, a plan, a canal: Panama";
    var got = new Solution().isPalindrome(input);
    assertTrue(got);
  }

  @Test
  void isPalindromeExample2() {
    var input = "race a car";
    var got = new Solution().isPalindrome(input);
    assertFalse(got);
  }

  @Test
  void isPalindromeExample3() {
    var input = " ";
    var got = new Solution().isPalindrome(input);
    assertTrue(got);
  }
}
