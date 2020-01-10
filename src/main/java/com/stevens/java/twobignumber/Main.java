package com.stevens.java.twobignumber;

public class Main {
    public static void main(String[] args) {
        //[2,4,3]
        //[5,6,4]
        ListNode first = new ListNode(2);
        first.next = new ListNode(4);
        first.next.next = new ListNode(3);

        ListNode second = new ListNode(2);
        second.next = new ListNode(4);
        second.next.next = new ListNode(3);
        Solution solution = new Solution();
        solution.addTwoNumbers(first, second);
    }
}
