package IntroductionToDataStructureAndAlgorithm;

public class Queue {
	static final int Q_SIZE = 5;
	int head;
	int tail;
	int data[] = new int[Q_SIZE + 1];

	void enqueue(int item) {
		if ((tail + 1) % (Q_SIZE + 1) == head) {
			System.out.println("Queue is full");
			return;
		}
		data[tail] = item;
		tail = (tail + 1) % (Q_SIZE + 1);
	}

	int dequeue() {
		int item;
		if (head == tail) {
			System.out.println("Queue is empty");
			return -1;
		}
		item = data[head];
		head = (head + 1) % (Q_SIZE + 1);
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int item;
		Queue my_q = new Queue();
		my_q.head = 0;
		my_q.tail = 0;

		my_q.enqueue(1);
		System.out.println(my_q.tail);
		my_q.enqueue(2);
		System.out.println(my_q.tail);
		my_q.enqueue(3);
		System.out.println(my_q.tail);
		my_q.enqueue(4);
		System.out.println(my_q.tail);
		my_q.enqueue(5);
		System.out.println(my_q.tail);
		my_q.enqueue(6);
		System.out.println(my_q.tail);
//		output
//		1
//		2
//		3
//		4
//		5
//		Queue is full
//		5

		System.out.println("beginning head = " + my_q.head);
		item = my_q.dequeue();
		System.out.println("item = " + item + ", head = " + my_q.head);
		item = my_q.dequeue();
		System.out.println("item = " + item + ", head = " + my_q.head);
		item = my_q.dequeue();
		System.out.println("item = " + item + ", head = " + my_q.head);
		item = my_q.dequeue();
		System.out.println("item = " + item + ", head = " + my_q.head);
		item = my_q.dequeue();
		System.out.println("item = " + item + ", head = " + my_q.head);
		item = my_q.dequeue();
		System.out.println("item = " + item + ", head = " + my_q.head);
//		output
//		beginning head = 0
//		item = 1, head = 1
//		item = 2, head = 2
//		item = 3, head = 3
//		item = 4, head = 4
//		item = 5, head = 5
//		Queue is empty
//		item = -1, head = 5

	}

}
