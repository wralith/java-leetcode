package org.example.s0242_valid_anagram;

import java.util.Arrays;
import java.util.HashMap;

// Beats 99% Runtime, 53% Memory
// Represents chars with array
// increases or decreases value of given index and looks for all zeros array
class Solution {
  public boolean isAnagram(String s, String t) {
    // Array that contains all chars represented by index
    var count = new int[26];
    // Increase index of the char if s contains
    for (char c : s.toCharArray()) count[c - 'a']++;
    // Decrease index of the char if s contains
    for (char c : t.toCharArray()) count[c - 'a']--;

    // If every value in the array is 0 then it is anagram!
    for (int i : count) if (i != 0) return false;
    return true;
  }

  // Beats 76% Runtime, 53% Memory
  // Sort involved, so O(n log(n)) at least right?, however seems like interpreter does good job
  // Simple and beautiful I guess...
  public boolean isAnagramUseSort(String s, String t) {
    char[] ss = s.toCharArray();
    char[] tt = t.toCharArray();
    Arrays.sort(ss);
    Arrays.sort(tt);
    return Arrays.equals(ss, tt);
  }

  // Beats 5% Runtime, 13% Memory
  // Not performant one, but I like it...
  public boolean isAnagramUseTwoMaps(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    var mapS = new HashMap<Character, Integer>();
    var mapT = new HashMap<Character, Integer>();

    for (var i = 0; i < s.length(); i++) {
      mapS.putIfAbsent(s.charAt(i), 0);
      mapT.putIfAbsent(t.charAt(i), 0);
      mapS.put(s.charAt(i), mapS.get(s.charAt(i)) + 1);
      mapT.put(t.charAt(i), mapT.get(t.charAt(i)) + 1);
    }

    return mapS.equals(mapT);
  }
}
