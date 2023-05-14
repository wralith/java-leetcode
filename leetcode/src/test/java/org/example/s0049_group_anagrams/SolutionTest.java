package org.example.s0049_group_anagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void groupAnagramsExample1() {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    var want = List.of(List.of("ate", "eat", "tea"), List.of("bat"), List.of("nat", "tan"));
    var got = new Solution().groupAnagrams(strs);

    for (int i = 0; i < got.size(); i++) {
      assertTrue(want.get(i).containsAll(got.get(i)));
      assertTrue(got.get(i).containsAll(want.get(i)));
    }
  }

  @Test
  void groupAnagramsExample2() {
    String[] strs = {""};
    var want = List.of(List.of(""));
    var got = new Solution().groupAnagrams(strs);
    assertArrayEquals(want.toArray(), got.toArray());
  }

  @Test
  void groupAnagramsExample3() {
    String[] strs = {"a"};
    var want = List.of(List.of("a"));
    var got = new Solution().groupAnagrams(strs);
    assertArrayEquals(want.toArray(), got.toArray());
  }
}
