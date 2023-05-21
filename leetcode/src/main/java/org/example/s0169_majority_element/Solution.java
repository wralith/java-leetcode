package org.example.s0169_majority_element;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
  // Beats 66% Runtime, 7% Memory
  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

  // Beats 20% Runtime, 31% Memory
  public int majorityElementMap(int[] nums) {
    // Create Map where key is the number and value is count
    var map = new HashMap<Integer, Integer>();
    for (int num : nums) {
      map.putIfAbsent(num, 0);
      map.put(num, map.get(num) + 1);
    }

    int halfLen = nums.length / 2;
    for (var entry : map.entrySet()) {
      if (entry.getValue() > halfLen) {
        return entry.getKey();
      }
    }
    return -1;
  }
}
