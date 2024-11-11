package linkedList;

public class PalindromeList {

	class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public int lPalin(ListNode A) {

		int len = 0;
		ListNode temp = A;
		while (temp.next != null) {
			temp = temp.next;
			len++;
		}

		int mid = (len + 1) / 2;

		ListNode tempHead = A;

		for (int i = 1; i < mid; i++) {
			tempHead = tempHead.next;
		}

		ListNode head1 = A;
		ListNode head2 = reverseList(tempHead.next);

		while (head1 != null && head2 != null) {

			if (head1.val != head2.val) {
				ListNode head3 = reverseList(head2);
				tempHead.next = head3;
				return 0;
			}

			head1 = head1.next;
			head2 = head2.next;

		}

		ListNode head3 = reverseList(head2);
		tempHead.next = head3;

		return 1;
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
