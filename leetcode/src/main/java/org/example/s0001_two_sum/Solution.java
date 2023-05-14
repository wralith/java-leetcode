package org.example.s0001_two_sum;

import java.util.HashMap;

// Beats 99% Runtime, 67 Memory
public class Solution {
  public int[] twoSum(int[] nums, int target) {
    // We put { target - number } and the index of that number in nums array into map
    // Then we check if current number inside in the map
    // If it is it means we found our answer!
    // We can return current index in iteration and the value we found in the map

    var map = new HashMap<Integer, Integer>();

    // let x = target and y = current number
    //   we are looking for a number let say z where y + z = x so:
    //   if x - y is inside the map return indexes of y and x - y
    //   if x - y is not inside the map put it inside as a key and put its index as a value
    for (int i = 0; i < nums.length; i++) {
      // Here we check if map has it and early return if it does!
      if (map.containsKey(nums[i])) {
        return new int[] {map.get(nums[i]), i};
      }
      // Here we put into map and loop continues
      map.put(target - nums[i], i);
    }

    // It is guaranteed there is an answer
    // I guess we should throw or return options instead of this!
    return new int[] {-1, -1};
  }
}
