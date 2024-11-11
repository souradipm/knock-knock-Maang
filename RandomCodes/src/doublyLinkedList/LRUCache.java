package doublyLinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	class Node {
		int key;
		int val;
		Node next;
		Node prev;

		Node(int k, int v) {
			this.key = k;
			this.val = v;
			prev = null;
			next = null;
		}
	}

	Node head = new Node(-1, -1);
	Node tail = new Node(-1, -1);
	Map<Integer, Node> hm;
	static int capacity;

	public LRUCache(int capacity) {

		head.next = tail;
		tail.prev = head;
		this.capacity = capacity;
		hm = new HashMap<>();

	}

	public int get(int key) {

		if (hm.containsKey(key)) {

			Node d = hm.get(key);
			remove(d);
			addToHead(d);
			return d.val;

		} else {

			return -1;

		}

	}

	public void remove(Node x) {

		Node nx = x.next;
		Node np = x.prev;
		np.next = nx;
		nx.prev = np;

	}

	public void addToHead(Node x) {

		x.next = head.next;
		x.prev = head;
		head.next = x;
		x.next.prev = x;

	}

	public void set(int key, int value) {

		if (hm.containsKey(key)) {

			Node x = hm.get(key);
			x.val = value;
			remove(x);
			addToHead(x);

		} else {

			if (hm.size() == capacity) {

				hm.remove(tail.prev.key);
				remove(tail.prev);

			}

			Node newNode = new Node(key, value);
			hm.put(key, newNode);
			addToHead(newNode);

		}

	}

	public static void main(String[] args) {

	}

}
