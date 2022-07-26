package dataStrctures;

public class StackWithLL<T> {

	// Single Linked List

	private Node<T> head;
	private int size;

	// Generic Node of LL
	public class Node<T> {
		T data;
		Node<T> next;

		Node(T data1) {
			this.data = data1;
			this.next = null;
		}

	}

	public int size() {
		return size;

	}

	public T top() {

		if (size == 0) {
			System.out.println(" stack empty");
		} else {
			return head.data;
		}
		return null;

	}

	public boolean isEmpty() {

		return (size == 0);

	}

	public void push(T element) {

		Node<T> node = new Node<T>(element);

		node.next = head;
		head = node;
		size++;

	}

	public void pop() {

		if (size > 0) {

			head = head.next;
			size--;
		} else {
			System.out.println("list is empty");
		}
	}

	public static void main(String[] args) {

		StackWithLL<Integer> stack = new StackWithLL<>();
		stack.push(4);
		stack.push(5);

		System.out.println(stack.top());
		System.out.println(stack.size());
		stack.pop();
		System.out.println(stack.top());

	}

}
