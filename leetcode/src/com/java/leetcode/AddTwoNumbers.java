package com.java.leetcode;

/**
 * Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int carry = (l1.val + l2.val) / 10;
		ListNode result = new ListNode((l1.val + l2.val) % 10);
		l1 = l1.next;
		l2 = l2.next;
		ListNode tail = result;
		while (l1 != null && l2 != null) {
			int sumDig = carry + l1.val + l2.val;
			carry = sumDig / 10;
			sumDig = sumDig % 10;
			ListNode temp = new ListNode(sumDig);
			tail.next = temp;
			tail = temp;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			int sumDig = carry + l1.val;
			carry = sumDig / 10;
			sumDig = sumDig % 10;
			ListNode temp = new ListNode(sumDig);
			tail.next = temp;
			tail = temp;
			l1 = l1.next;
		}
		while (l2 != null) {
			int sumDig = carry + l2.val;
			carry = sumDig / 10;
			sumDig = sumDig % 10;
			ListNode temp = new ListNode(sumDig);
			tail.next = temp;
			tail = temp;
			l2 = l2.next;
		}
		if (carry > 0) {
			ListNode temp = new ListNode(carry);
			tail.next = temp;
		}
		return result;
	}
}