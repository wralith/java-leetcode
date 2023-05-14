package org.example.s0049_group_anagrams;

import java.util.*;

public class Solution {
  // Beats %97 Runtime, %71 Memory
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      var chars = str.toCharArray();
      Arrays.sort(chars);
      var key = new String(chars);

      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
  }

  // Beats %25 Runtime, %23 Memory
  public List<List<String>> groupAnagramsSortWithStreamApi(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      var sorted =
          str.chars()
              .sorted()
              .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
              .toString();

      map.computeIfAbsent(sorted, k -> new ArrayList<>());
      map.get(sorted).add(str);
    }
    return map.values().stream().toList();
  }
}
