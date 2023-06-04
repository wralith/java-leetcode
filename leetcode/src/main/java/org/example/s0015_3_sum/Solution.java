package org.example.s0015_3_sum;

import java.util.*;

class Solution {
  // Beats 60% Runtime, 50% Memory
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      var target = -nums[i];
      var left = i + 1;
      var right = nums.length - 1;

      while (left < right) {
        int sum = nums[left] + nums[right];

        if (sum == target) {
          var triplet = List.of(nums[i], nums[left], nums[right]);
          res.add(triplet);

          left++;
          right--;

          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right + 1]) {
            right--;
          }
        } else if (sum < target) {
          left++;
        } else {
          right--;
        }
      }
    }
    return res;
  }

  // Beats 13% Runtime, 37% Memory
  public List<List<Integer>> threeSumWithSet(int[] nums) {
    Arrays.sort(nums);
    Set<List<Integer>> set = new HashSet<>();
    var target = 0;

    for (int i = 0; i < nums.length; i++) {
      var left = i + 1;
      var right = nums.length - 1;
      while (left < right) {
        var sum = nums[i] + nums[left] + nums[right];
        if (sum == target) {
          set.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          right--;
        } else if (sum < target) {
          left++;
        } else {
          right--;
        }
      }
    }

    return new ArrayList<>(set);
  }
}
