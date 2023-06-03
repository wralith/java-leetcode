package org.example.s0020_valid_parantheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
  // Beats 98% Runtime, 30% Memory
  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (char ch : s.toCharArray()) {
      switch (ch) {
        case '(', '[', '{' -> stack.push(ch);
        case ')' -> {
          if (stack.isEmpty() || stack.pop() != '(') return false;
        }
        case ']' -> {
          if (stack.isEmpty() || stack.pop() != '[') return false;
        }
        case '}' -> {
          if (stack.isEmpty() || stack.pop() != '{') return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
