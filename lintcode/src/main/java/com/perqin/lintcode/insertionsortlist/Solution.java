package com.perqin.lintcode.insertionsortlist;

public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return The head of linked list.
     */
    ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prePicked = head;
        ListNode picked = head.next;
        while (picked != null) {
            // Pick one node! Now pick first bigger node
            if (head.val > picked.val) {
                // Head picked and should be replaced
                prePicked.next = picked.next;
                picked.next = head;
                head = picked;
                picked = prePicked.next;
            } else {
                ListNode newPrePicked = head;
                ListNode newPicked = head.next;
                while (newPicked.val < picked.val) {
                    newPrePicked = newPrePicked.next;
                    newPicked = newPicked.next;
                }
                if (newPicked != picked) {
                    // We pick a new bigger one
                    prePicked.next = picked.next;
                    picked.next = newPicked;
                    newPrePicked.next = picked;
                    picked = prePicked.next;
                } else {
                    prePicked = prePicked.next;
                    picked = picked.next;
                }
            }
        }
        return head;
    }
}
