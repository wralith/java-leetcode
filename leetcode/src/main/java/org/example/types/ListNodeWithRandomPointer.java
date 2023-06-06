package org.example.types;

public class ListNodeWithRandomPointer {
  public int val;
  public ListNodeWithRandomPointer next;
  public ListNodeWithRandomPointer random;

  public ListNodeWithRandomPointer(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }

  public ListNodeWithRandomPointer(int val, ListNodeWithRandomPointer next) {
    this.val = val;
    this.next = next;
    this.random = null;
  }

  public ListNodeWithRandomPointer(
      int val, ListNodeWithRandomPointer next, ListNodeWithRandomPointer random) {
    this.val = val;
    this.next = next;
    this.random = random;
  }
}
