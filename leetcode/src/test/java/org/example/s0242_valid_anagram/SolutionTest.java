package org.example.s0242_valid_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void isAnagramExample1() {
    String s = "anagram", t = "nagaram";
    var got = new Solution().isAnagram(s, t);
    assertTrue(got);
  }

  @Test
  void isAnagramExample2() {
    String s = "rat", t = "car";
    var got = new Solution().isAnagram(s, t);
    assertFalse(got);
  }

  @Test
  void isAnagramExample3() {
    String s = "aacc", t = "ccac";
    var got = new Solution().isAnagram(s, t);
    assertFalse(got);
  }
}
