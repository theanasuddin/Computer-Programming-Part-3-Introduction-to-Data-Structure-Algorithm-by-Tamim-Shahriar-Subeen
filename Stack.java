package IntroductionToDataStructureAndAlgorithm;

public class Stack {
	static final int STACK_MAX = 1000;
	int top;
	int data[] = new int[STACK_MAX];

	Stack() {
		top = 0;
	}

	void push(int item) {
		if (top < STACK_MAX) {
			data[top] = item;
			top++;
		} else {
			System.out.println("Stack is full!");
		}
	}

	int pop() {
		int item;
		if (top <= 0) {
			System.out.println("Stack is empty!");
			return -1;
		} else {
			top--;
			item = data[top];
		}
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);

		int item;
		item = myStack.pop();
		System.out.println(item);
		item = myStack.pop();
		System.out.println(item);
		item = myStack.pop();
		System.out.println(item);

	}

}
