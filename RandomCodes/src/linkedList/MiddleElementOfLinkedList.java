package linkedList;

public class MiddleElementOfLinkedList {

	class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public int solve1(ListNode A) {

		ListNode tmp = A;
		int len = 0;
		int mid = 0;

		while (tmp.next != null) {

			tmp = tmp.next;
			len++;
		}
		len++;
		mid = (len / 2) + 1;

		ListNode temp = A;
		for (int i = 1; i < mid; i++) {

			temp = temp.next;

		}

		return temp.val;
	}

	public int solve(ListNode A) {

		if (A.next == null) {
			return A.val;
		}

		ListNode i = A, j = A;

		while (j != null && j.next != null) {
			i = i.next;
			j = j.next.next;
		}

		return i.val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleElementOfLinkedList m = new MiddleElementOfLinkedList();
		MiddleElementOfLinkedList.ListNode l1 = m.new ListNode(39);
		MiddleElementOfLinkedList.ListNode l2 = m.new ListNode(95);
		l1.next = l2;
		System.out.println(m.solve(l1));

	}

}
