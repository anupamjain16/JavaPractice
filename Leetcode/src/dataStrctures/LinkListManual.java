package dataStrctures;

public class LinkListManual {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		LinkListManual list = new LinkListManual();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}

}

////Detect cycle in ll
/* public static boolean detectLoop(Node head){
        
         Node slow = head;
         Node fast = head.next;
         
         while(fast != slow)
         {
             
              
              if( fast == null || fast.next == null)
                 return false;
              
              fast = fast.next.next; 
              slow = slow.next;
             
         }
        
        return  true; 
        
    }*/
