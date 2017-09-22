package com.perqin.lintcode.insertionsortlist;

public class InsertionSortList {
	private static ListNode buildList(int... numbers) {
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

	private static void printList(ListNode list) {
		while (list != null) {
			System.out.print(list.val + " -> ");
			list = list.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode list = buildList(1, 3, 2, 0);
		printList(list);
		ListNode sortedList = solution.insertionSortList(list);
		printList(sortedList);
	}
}
