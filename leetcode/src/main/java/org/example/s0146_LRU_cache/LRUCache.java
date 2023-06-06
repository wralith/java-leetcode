package org.example.s0146_LRU_cache;

import java.util.HashMap;
import java.util.Map;

// You can extend LinkedHashMap

// Beats 12% Runtime, 5% Memory
class LRUCache {
  private final Map<Integer, Node> cache;
  private final int capacity;

  private final Node start;
  private final Node end;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    cache = new HashMap<>();

    this.start = new Node(0, 0);
    this.end = new Node(0, 0);
    this.start.next = this.end;
    this.end.prev = this.start;
  }

  public int get(int key) {
    if (cache.containsKey(key)) {
      remove(cache.get(key));
      insert(cache.get(key));
      return cache.get(key).val;
    } else {
      return -1;
    }
  }

  public void put(int key, int value) {
    if (cache.containsKey(key)) {
      remove(cache.get(key));
    }
    cache.put(key, new Node(key, value));
    insert(cache.get(key));

    if (cache.size() > capacity) {
      var lastUsed = this.start.next;
      remove(lastUsed);
      cache.remove(lastUsed.key);
    }
  }

  private void remove(Node node) {
    var prev = node.prev;
    var next = node.next;

    prev.next = next;
    next.prev = prev;
  }

  private void insert(Node node) {
    var prev = end.prev;
    var next = end;

    prev.next = node;
    next.prev = node;

    node.prev = prev;
    node.next = next;
  }

  private static class Node {
    private final int key;
    private final int val;

    Node next;
    Node prev;

    public Node(int key, int val) {
      this.key = key;
      this.val = val;
    }
  }
}
