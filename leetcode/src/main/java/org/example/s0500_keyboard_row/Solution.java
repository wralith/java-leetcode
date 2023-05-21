package org.example.s0500_keyboard_row;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
  // Beats 60% Runtime 1ms, 74% Memory
  public String[] findWords(String[] words) {
    // Rows in qwerty keyboard
    String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    // Map of which char belongs to which row
    var rowsMap = new HashMap<Character, Integer>();
    // Results!
    var foundWords = new ArrayList<String>();

    // Populate map with rows
    for (int i = 0; i < rows.length; i++) {
      for (char c : rows[i].toCharArray()) {
        rowsMap.put(c, i);
      }
    }

    // Determine which row with the char at first index
    // Check if they are at that row and increment count
    // If all chars done, add it to result array
    for (String word : words) {
      var count = 0;
      var lower = word.toLowerCase();
      int row = rowsMap.get(lower.charAt(count));
      for (; count < lower.length(); ++count) {
        if (rowsMap.get(lower.charAt(count)) != row) break;
      }
      if (count == lower.length()) foundWords.add(word);
    }

    return foundWords.toArray(new String[0]);
  }
}
