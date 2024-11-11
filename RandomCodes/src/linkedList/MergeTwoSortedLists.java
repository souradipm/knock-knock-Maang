package linkedList;

public class MergeTwoSortedLists {

	class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode mergeTwoLists(ListNode A, ListNode B) {

		ListNode ansHead = null;
		if (A == null) {
			return B;
		} else if (B == null) {
			return A;
		} else {

			ListNode curr = null;
			while (A != null && B != null) {

				if (A.val < B.val) {
					ansHead = A;
					A = A.next;
				} else {
					ansHead = B;
					B = B.next;
				}
				curr = ansHead;

				while (A != null && B != null) {

					if (A.val < B.val) {
						curr.next = A;
						A = A.next;

					} else {
						curr.next = B;
						B = B.next;
					}

					curr = curr.next;

				}

				if (A != null) {
					curr.next = A;
				}

				if (B != null) {
					curr.next = B;
				}
			}

		}

		return ansHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedLists m = new MergeTwoSortedLists();
		MergeTwoSortedLists.ListNode l1 = m.new ListNode(5);
		MergeTwoSortedLists.ListNode l2 = m.new ListNode(8);
		MergeTwoSortedLists.ListNode l3 = m.new ListNode(20);
		l1.next = l2;
		l2.next = l3;

		MergeTwoSortedLists.ListNode l4 = m.new ListNode(4);
		MergeTwoSortedLists.ListNode l5 = m.new ListNode(11);
		MergeTwoSortedLists.ListNode l6 = m.new ListNode(15);
		l4.next = l5;
		l5.next = l6;

		ListNode ans = m.mergeTwoLists(l1, l4);

		while (ans.next != null) {
			System.out.print(ans.val + " -> ");
			ans = ans.next;
		}

		System.out.println(ans.val);

	}

}
