package org.example.s0500_keyboard_row;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void findWordsExample1() {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    String[] want = {"Alaska", "Dad"};
    String[] got = new Solution().findWords(words);
    assertArrayEquals(want, got);
  }

  @Test
  void findWordsExample2() {
    String[] words = {"omk"};
    String[] want = {};
    String[] got = new Solution().findWords(words);
    assertArrayEquals(want, got);
  }

  @Test
  void findWordsExample3() {
    String[] words = {"asdf", "sfd"};
    String[] want = {"asdf", "sfd"};
    String[] got = new Solution().findWords(words);
    assertArrayEquals(want, got);
  }
}
