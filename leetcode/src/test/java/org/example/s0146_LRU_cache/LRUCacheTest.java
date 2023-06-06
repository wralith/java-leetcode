package org.example.s0146_LRU_cache;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LRUCacheTest {
  @Test
  public void Scenario1() {
    var cache = new LRUCache(2);
    cache.put(1, 1);
    cache.put(2, 2);

    var got = cache.get(1);
    assertEquals(1, got);

    cache.put(3,3);
    got = cache.get(2);
    assertEquals(-1 , got);

    cache.put(4,4);
    got = cache.get(1);
    assertEquals(-1 , got);

    got = cache.get(3);
    assertEquals(3, got);

    got = cache.get(4);
    assertEquals(4, got);
  }
}
