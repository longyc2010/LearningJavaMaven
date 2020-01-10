package com.stevens.java.twobignumber;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode firstNext = l1.next;
        ListNode secondNext = l2.next;
        int val = l1.val + l2.val;
        int ten = 10;
        int add = val / ten;
        ListNode head = new ListNode(val % ten);

        ListNode tail = head;

        ListNode temp;
        int first = 0;
        int second = 0;
        while (firstNext != null || secondNext != null) {


            if (firstNext == null) {
                first = 0;
            } else {
                first = firstNext.val;
                firstNext = firstNext.next;

            }

            if (secondNext == null) {
                second = 0;


            } else {
                second = secondNext.val;
                secondNext = secondNext.next;
            }
            val = first + second + add;
            add = val / ten;

            tail.next = new ListNode(val % ten);
            tail = tail.next;

        }

        if (add > 0) {
            tail.next = new ListNode(1);
        }

        StringBuffer sb = new StringBuffer();
        sb.append(head.val);
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
            sb.insert(0, temp.val);
        }
        System.out.println(sb.toString());
        return head;


    }
}
