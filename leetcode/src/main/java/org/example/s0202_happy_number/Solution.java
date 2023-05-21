package org.example.s0202_happy_number;

import java.util.HashSet;

class Solution {
  // Beats 89% Runtime = 1ms, 43% Memory
  public boolean isHappy(int n) {
    var visitedNumbers = new HashSet<Integer>();

    while (n != 1) {
      var current = n;
      var sum = 0;

      while (current != 0) {
        var mod = current % 10;
        sum += mod * mod;
        current = current / 10;
        // i.e. first iteration                 second iteration
        //   current = 19                |  current = 1
        //   mod     => 19 % 10   = 9    |  mod => 1 % 10 = 1
        //   sum     => 0 + 9 * 9 = 81   |  sum => 81 + 1 = 82
        //   current => 19 / 10   = 1    |  current => 0 => break
      }

      // If there is a loop, return false
      if (visitedNumbers.contains(sum)) {
        return false;
      }

      n = sum;
      visitedNumbers.add(n);
    }

    return true;
  }
}
