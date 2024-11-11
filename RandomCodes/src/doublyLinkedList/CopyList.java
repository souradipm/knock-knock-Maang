package doublyLinkedList;

public class CopyList {

	class RandomListNode {
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	}

	public RandomListNode copyRandomList(RandomListNode head) {

		// Step 1: Duplicate each node and insert it after the original node.

		RandomListNode newHead = head;
		while (newHead != null) {

			RandomListNode newNode = new RandomListNode(newHead.label);

			// Connecting newNode to the next node of temp.
			newNode.next = newHead.next;
			newHead.next = newNode;
			newHead = newNode.next;

		}

		// Step 2: Update the random pointers for the duplicated nodes.
		RandomListNode t1 = head;
		RandomListNode t2 = head.next;

		while (t1 != null) {

			if (t1.random != null) {

				t2.random = t1.random.next;

			}

			t1 = t2.next;
			if (t1 != null) {
				t2 = t1.next;
			}

		}

		// Step 3: Separate the original and duplicated nodes.
		t1 = head;
		t2 = head.next;
		RandomListNode copiedListHead = t2;

		while (t1 != null) {

			t1.next = t2.next;
			t1 = t1.next;

			if (t1 != null) {

				t2.next = t1.next;

			}
			t2 = t2.next;

		}

		return copiedListHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
