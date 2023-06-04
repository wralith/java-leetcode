package org.example.s0125_valid_palindrome;

class Solution {
  public boolean isPalindrome(String s) {
    var left = 0;
    var right = s.length() - 1;

    while (left < right) {
      var first = s.toLowerCase().charAt(left);
      var second = s.toLowerCase().charAt(right);

      if (!Character.isLetterOrDigit(first)) {
        left++;
        continue;
      }

      if (!Character.isLetterOrDigit(second)) {
        right--;
        continue;
      }

      if (first != second) {
        return false;
      }

      left++;
      right--;
    }
    return true;
  }
}
