package linkedList;

public class SortList {

	class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode sortList(ListNode A) {

		if (A == null || A.next == null) {
			return A;
		}

		ListNode middle = findMiddle(A);
		ListNode nextToMiddle = middle.next;
		middle.next = null;

		ListNode left = sortList(A);
		ListNode right = sortList(nextToMiddle);

		ListNode sortedList = mergeTwoLists(left, right);

		return sortedList;
	}

	public ListNode findMiddle(ListNode A) {

		if (A.next == null) {
			return A;
		}

		// start j from second element

		// so that it will get handled in both cases, when number of nodes is either odd
		// or even and it gets split exactly around mid
		ListNode i = A, j = A.next;

		while (j != null && j.next != null) {
			i = i.next;
			j = j.next.next;
		}

		return i;
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

		SortList m = new SortList();
		SortList.ListNode l1 = m.new ListNode(3);
		SortList.ListNode l2 = m.new ListNode(4);
		SortList.ListNode l3 = m.new ListNode(2);
		SortList.ListNode l4 = m.new ListNode(8);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;

		ListNode A = m.sortList(l1);
		while (A.next != null) {
			System.out.print(A.val);
			A = A.next;
		}
		System.out.println(A.val);

	}

}
