package org.example.s0238_product_of_array_except_self;

// Beats %100 Runtime, %53 Memory
class Solution {
  public int[] productExceptSelf(int[] nums) {
    var res = new int[nums.length];
    int r = 1;
    int l = 1;

    // Move from the beginning of array
    // Given index in result array is equal to current left pointer value
    // left pointer = number of given index from nums * left pointer value
    for (int i = 0; i < nums.length; i++) {
      res[i] = l;
      l *= nums[i];
    }
    // Move from the end of array
    // Given index in result array = itself * right pointer value
    // right pointer = number of given index from nums * right pointer value
    for (int i = nums.length - 1; i >= 0; i--) {
      res[i] *= r;
      r *= nums[i];
    }

    return res;
  }
}
