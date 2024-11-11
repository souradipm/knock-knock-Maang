package linkedList;

public class RemoveLoopFromLinkedList {

	class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode solve(ListNode A) {
		
		if (A == null || A.next == null) {
            return A;
        }

        ListNode slow = A;
        ListNode fast = A;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Break the loop
                ListNode start = A;
                while (start.next != slow.next) {
                    start = start.next;
                    slow = slow.next;
                }
                slow.next = null;
                return A;
            }
        }

        return A;
    }
		
	
	public ListNode solve1(ListNode A) {

		if (A == null || A.next == null) {
			return A;
		}

		ListNode slow1 = A;
		ListNode slow2 = A;
		ListNode prev = null;
		ListNode fast = A.next;

		while (fast != null && fast.next != null) {

			slow1 = slow1.next;
			fast = fast.next.next;

			if (slow1 == fast) {

				prev = slow1;
				slow1 = slow1.next;
				slow2 = slow2.next;

				if (slow1 == slow2) {
					prev.next = null;
					return A;
				}

			}

		}

		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveLoopFromLinkedList m = new RemoveLoopFromLinkedList();
		RemoveLoopFromLinkedList.ListNode l1 = m.new ListNode(6);
		RemoveLoopFromLinkedList.ListNode l2 = m.new ListNode(5);
		RemoveLoopFromLinkedList.ListNode l3 = m.new ListNode(5);
		RemoveLoopFromLinkedList.ListNode l4 = m.new ListNode(3);
		RemoveLoopFromLinkedList.ListNode l5 = m.new ListNode(8);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l3;

		ListNode A = m.solve(l1);

		while (A.next != null) {
			System.out.print(A.val + "->");
			A = A.next;
		}
		System.out.println(A.val);

	}

}
