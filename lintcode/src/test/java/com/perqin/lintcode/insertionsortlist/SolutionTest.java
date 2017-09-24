package com.perqin.lintcode.insertionsortlist;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {
    private ListNode buildList(int... numbers) {
        ListNode list = null;
        ListNode tail = null;
        for (int number : numbers) {
            ListNode node = new ListNode(number);
            node.next = null;
            if (list == null) {
                list = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }
        return list;
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        ListNode list = buildList(1, 3, 2, 0);
        ListNode sortedList = solution.insertionSortList(list);
        assertTrue(compareList(new int[]{ 0, 1, 2, 3 }, sortedList));
    }

    private boolean compareList(int[] expected, ListNode tested) {
        int ei = 0;
        ListNode node = tested;
        while (true) {
            if (ei == expected.length && node == null) return true;
            if (ei == expected.length) return false;
            if (ei < expected.length && node == null) return false;
            if (expected[ei] != node.val) return false;
            ++ei;
            node = node.next;
        }
    }
}
