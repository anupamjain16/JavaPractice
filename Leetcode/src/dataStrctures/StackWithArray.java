package dataStrctures;

public class StackWithArray {

	private int top;
	private int arr[];

	StackWithArray() {
		top = -1;
		arr = new int[10];
	}

	StackWithArray(int capacity) {
		top = -1;
		arr = new int[capacity];
	}

	public int size() {
		return (top + 1);
	}

	public void push(int element) {

		if (size() == arr.length) {
			System.out.println("Array is full");

		} else {
			top++;
			arr[top] = element;
		}

	}

	public void pop() {

		if (size() == 0) {
			System.out.println("Array is empty");
		} else {

			top--;
		}

	}

	public int top() {

		return arr[top];
	}

	public static void main(String[] args) {

		StackWithArray stack2 = new StackWithArray(10);

		stack2.push(1);

		System.out.println(stack2.top());

		stack2.push(2);

		System.out.println(stack2.top());

		stack2.pop();

		System.out.println(stack2.top());

		System.out.println("Size " + stack2.size());

	}

}
