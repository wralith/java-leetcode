package org.example.s0167_two_sum_2;

public class Solution {
  public int[] twoSum(int[] numbers, int target) {
    var left = 0;
    var right = numbers.length - 1;

    while (left < right) {
      var a = numbers[left];
      var b = numbers[right];

      if (a + b == target) {
        break;
      }
      if (a + b < target) {
        left++;
        continue;
      }

      right--;
    }

    return new int[] {left + 1, right + 1};
  }
}
