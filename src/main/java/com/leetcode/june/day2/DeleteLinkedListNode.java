package com.leetcode.june.day2;



  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class DeleteLinkedListNode {
    public void deleteNode(ListNode node) {

        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;

    }
}
