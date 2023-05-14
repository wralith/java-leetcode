package org.example.s0347_top_frequent_element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void topKFrequentExample1() {
      var nums = new int[] {1,1,1,2,2,3};
      var k = 2;
      var want = new int[] {1,2};
      var got = new Solution().topKFrequent(nums, k);

      assertArrayEquals(want, got);
    }

  @Test
  void topKFrequentExample2() {
    var nums = new int[] {1};
    var k = 1;
    var want = new int[] {1};
    var got = new Solution().topKFrequent(nums, k);

    assertArrayEquals(want, got);
  }

  @Test
  void topKFrequentExample3() {
    var nums = new int[] {-1, -1};
    var k = 1;
    var want = new int[] {-1};
    var got = new Solution().topKFrequent(nums, k);

    assertArrayEquals(want, got);
  }

  @Test
  void topKFrequentExample4() {
    var nums = new int[] {1, 2};
    var k = 2;
    var want = new int[] {1, 2};
    var got = new Solution().topKFrequent(nums, k);

    assertArrayEquals(want, got);
  }
}