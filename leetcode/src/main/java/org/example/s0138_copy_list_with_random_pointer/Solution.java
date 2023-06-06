package org.example.s0138_copy_list_with_random_pointer;

import java.util.HashMap;
import org.example.types.ListNodeWithRandomPointer;

public class Solution {
  // Beats 100% Runtime, 10% Memory
  // Replace ListNodeWithRandomPointer with Node type!
  public ListNodeWithRandomPointer copyRandomList(ListNodeWithRandomPointer head) {
    var curr = head;
    var map = new HashMap<ListNodeWithRandomPointer, ListNodeWithRandomPointer>();

    while (curr != null) {
      map.put(curr, new ListNodeWithRandomPointer(curr.val));
      curr = curr.next;
    }

    curr = head;
    while (curr != null) {
      map.get(curr).next = map.get(curr.next);
      map.get(curr).random = map.get(curr.random);
      curr = curr.next;
    }

    return map.get(head);
  }
}
