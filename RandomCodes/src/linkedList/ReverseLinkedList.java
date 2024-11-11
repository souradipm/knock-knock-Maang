package linkedList;

public class ReverseLinkedList {

	class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode reverseList(ListNode A) {

		ListNode head = A;
		if (head == null || head.next == null) {
			return head;
		}

		ListNode curr = head;
		ListNode prev = null;

		while (curr != null) {

			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		head = prev;
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
