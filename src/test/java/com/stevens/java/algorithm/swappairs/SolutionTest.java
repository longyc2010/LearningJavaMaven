package com.stevens.java.algorithm.swappairs;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void swapPairs() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        //1-> 2 -> 3 -> 4
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        solution.swapPairs(head);
    }
}