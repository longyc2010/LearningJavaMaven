package com.stevens.java.algorithm.swappairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {

        return swap(head);
    }

    private ListNode swap(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = head.next;
        head.next = temp;


        head.next.next = swap(head.next.next);
        return head;
    }
}
