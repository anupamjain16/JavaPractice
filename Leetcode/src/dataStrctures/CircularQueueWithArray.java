package dataStrctures;

public class CircularQueueWithArray {

	private int data[];
	private int front;
	private int reare;
	private int size;

	public CircularQueueWithArray() {
		super();
		this.data = new int[3];
		this.front = -1;
		this.reare = -1;
		this.size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {

		return size == 0;

	}

	public int front() {
		if (size == 0)
			System.out.println(" queue is empty");
		return data[front];
	}

	public void enqueue(int element) {

		if (size < data.length) {

			if (size == 0) /// while insterting first element
				front = 0;

			size++;
			reare++;
			if (reare == data.length) {
				reare = 0;
			}
			data[reare] = element;

		} else {
			System.out.println(" Queue is Full");
		}
	}

	public int dequeue() {

		if (size == 0)
			System.out.println(" queue is empty");

		int temp = data[front];
		front++;
		if (front == data.length)
			front = 0;
		size--;
		if (size == 0) {
			front = -1;
			reare = -1;
		}
		return temp;

	}

	public static void main(String[] args) {

		CircularQueueWithArray queue = new CircularQueueWithArray();

		queue.enqueue(4);
		queue.enqueue(3);
		queue.enqueue(2);
		// queue.enqueue(1);

		System.out.println("size " + queue.size);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		// System.out.println(queue.dequeue());

		System.out.println("Front " + queue.front());
		System.out.println("size " + queue.size);

	}

}
