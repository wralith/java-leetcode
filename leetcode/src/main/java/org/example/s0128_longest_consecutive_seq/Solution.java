package org.example.s0128_longest_consecutive_seq;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
  // Beats 90% Runtime, 90% Memory
  // Sort sort O(n log(n)) she said
  //  Sort the array check for let x = current number
  //  if the number in the left of it [index - 1] is one lesser than x
  //    move move move until it is not
  //    set current streak if it is bigger than the longest
  //    continue iteration
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;

    Arrays.sort(nums);
    var longest = 0;
    var curr = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1] + 1) {
        curr++;
      } else if (nums[i] != nums[i - 1]) {
        longest = Math.max(curr, longest);
        curr = 1;
      }
    }

    return Math.max(longest, curr);
  }

  // Beats 5% Runtime, 67% Memory
  // Turns out sort is more performant in this case and simpler!
  public int longestConsecutiveWithSet(int[] nums) {
    if (nums.length == 0) return 0; // Saves a bit of memory
    // Create a set from nums
    var set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    var longest = 0;

    // Check if current number contains a number that is one lesser or one more from it
    // Increase len each iteration and replace it with longest if it is higher
    for (int num : nums) {
      if (!set.contains(num - 1)) {
        var len = 0;
        while (set.contains(num + len)) {
          len++;
          longest = Integer.max(len, longest);
        }
      }
    }
    return longest;
  }
}
