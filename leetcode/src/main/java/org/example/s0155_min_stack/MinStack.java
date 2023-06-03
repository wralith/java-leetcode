package org.example.s0155_min_stack;

import java.util.ArrayDeque;
import java.util.Deque;

// Beats 90% Runtime, 20% Memory
class MinStack {
  private final Deque<Integer> stack;
  private final Deque<Integer> minStack;

  public MinStack() {
    stack = new ArrayDeque<>();
    minStack = new ArrayDeque<>();
  }

  public void push(int val) {
    stack.push(val);
    val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());
    minStack.push(val);
  }

  public void pop() {
    stack.pop();
    minStack.pop();
  }

  public int top() {
    // We might return Optional instead or IDK
    return stack.peek();
  }

  public int getMin() {
    // We might return Optional instead or IDK
    return minStack.peek();
  }
}
