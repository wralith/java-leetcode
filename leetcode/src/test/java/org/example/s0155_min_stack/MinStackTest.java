package org.example.s0155_min_stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinStackTest {
  @Test
  void minStackExample1() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    var got = minStack.getMin();
    assertEquals(-3, got);
    minStack.pop();
    got = minStack.top();
    assertEquals(0, got);
    got = minStack.getMin();
    assertEquals(-2, got);
  }
}
