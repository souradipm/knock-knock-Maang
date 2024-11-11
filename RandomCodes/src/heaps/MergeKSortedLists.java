package heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedLists {

	class ListNode {
		public int val;
		public ListNode next;
		ListNode head;

		ListNode() {

		}

		ListNode(int x) {
			val = x;
			next = null;
		}

		public void insert(int data) {
			ListNode newNode = new ListNode(data);

			if (head == null) {
				head = newNode;
			} else {
				ListNode current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = newNode;
			}
		}
	}

	public ListNode mergeKLists(ArrayList<ListNode> a) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (ListNode n : a) {

			while (n != null) {
				int x = n.val;
				pq.add(x);
				n = n.next;
			}

		}

		ListNode head = new ListNode(pq.poll());
		ListNode temp = head;
		while (pq.size() > 0) {

			ListNode n = new ListNode(pq.poll());
			temp.next = n;
			temp = n;

		}

		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ListNode> a = new ArrayList<>();

		MergeKSortedLists mm = new MergeKSortedLists();

		MergeKSortedLists.ListNode head1 = mm.new ListNode(1);
		MergeKSortedLists.ListNode temp = head1;
		MergeKSortedLists.ListNode n1 = mm.new ListNode(10);
		temp.next = n1;
		temp = n1;

		MergeKSortedLists.ListNode n2 = mm.new ListNode(20);
		temp.next = n2;
		temp = n2;

		a.add(head1);

		MergeKSortedLists.ListNode head2 = mm.new ListNode(4);
		MergeKSortedLists.ListNode temp2 = head2;
		MergeKSortedLists.ListNode n3 = mm.new ListNode(11);
		temp2.next = n3;
		temp2 = n3;

		MergeKSortedLists.ListNode n4 = mm.new ListNode(13);
		temp2.next = n4;
		temp2 = n4;

		a.add(head2);

		MergeKSortedLists.ListNode head3 = mm.new ListNode(3);
		MergeKSortedLists.ListNode temp3 = head3;
		MergeKSortedLists.ListNode n5 = mm.new ListNode(8);
		temp3.next = n5;
		temp3 = n5;

		MergeKSortedLists.ListNode n6 = mm.new ListNode(9);
		temp3.next = n6;
		temp3 = n6;

		a.add(head3);

		mm.mergeKLists(a);

	}

}
