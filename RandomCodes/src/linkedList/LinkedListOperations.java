package linkedList;

public class LinkedListOperations {

	static class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}

		Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	public static Node head = null;
	public static int n = 1;

	public static void insert_node(int position, int value) {

		 if (position > n+1) {
             return;
         }
 
         if (position == 1) {
             Node newNode=new Node(value);
             newNode.next=head;
             head=newNode;
             
 
         } else {
 
             Node temp = head;
             for (int i = 1; i < position - 1; i++) {
                 temp = temp.next;
             }
 
             Node newNode = new Node(value);
             newNode.next = temp.next;
             temp.next = newNode;
 
         }
         n++;

	}

	public static void delete_node(int position) {

		if (position > n) {
            return;
        }

        if (position == 1) {
            head = head.next;
        } else {

            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }

            if(temp.next!=null) {
            	 temp.next = temp.next.next;
            }
               
            

        }
        n--;
	}

	public static void print_ll() {
		// Output each element followed by a space
		 if (n == 0) {
             return;
         }
 
         Node temp = head;
         while (temp.next != null) {
             System.out.print(temp.value + " ");
             temp = temp.next;
         }
         System.out.print(temp.value);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListOperations.insert_node(1, 23);
		LinkedListOperations.insert_node(2, 24);
		LinkedListOperations.print_ll();
		LinkedListOperations.delete_node(1);
		LinkedListOperations.print_ll();

	}

}
