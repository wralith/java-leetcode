package org.example.s0027_remove_element;

import java.util.Arrays;

class Solution {
  // Beats 100% Runtime, 10% Memory (Still O(1) space complexity 40mb 100% - 41mb 10%...)
  public int removeElement(int[] nums, int val) {
    var i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        swap(nums, i, j);
        i++;
      }
    }
    return i;
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // Why it is not mutating nums?
  public int removeElementNotWorking(int[] nums, int val) {
    // Why it is not working?
    nums = Arrays.stream(nums).filter(num -> num != val).toArray();
    return nums.length;
  }
}
