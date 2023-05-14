package org.example.s0347_top_frequent_element;

import java.util.*;

// Beats 8% Runtime, 81% Memory
class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    // Map that holds numbers from nums array as a key
    // And their frequencies as a value
    var map = new HashMap<Integer, Integer>();
    for (var num : nums) {
      map.putIfAbsent(num, 0);
      map.put(num, map.get(num) + 1);
    }

    // ArrayList of frequencies in reversed order
    ArrayList<Integer> list = new ArrayList<>(map.values());
    list.sort(Comparator.reverseOrder());

    // Retrieve keys of values from map and add res list
    var res = new ArrayList<Integer>();
    for (int i = 0; i < k;) {
       var keys = getKeys(map, list.get(i));
       for (var key: keys) {
         // Increment `i` if we found key that match with current value
         i++;
         // Add current value to res list
         res.add(key);
       }
    }

    return res.stream().mapToInt(Integer::intValue).toArray();
  }

  private int[] getKeys(Map<Integer, Integer> map, int value) {
    var keys = new ArrayList<Integer>();
    for (var entry : map.entrySet()) {
      if (entry.getValue().equals(value)) {
        keys.add(entry.getKey());
      }
    }
    return keys.stream().mapToInt(Integer::intValue).toArray();
  }
}
