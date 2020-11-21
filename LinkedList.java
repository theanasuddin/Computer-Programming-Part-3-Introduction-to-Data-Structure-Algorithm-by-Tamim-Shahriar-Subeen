package IntroductionToDataStructureAndAlgorithm;

public class LinkedList {
	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int item) {
			this.data = item;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList llist = new LinkedList();
		llist.prepend(6);
		llist.append(8);
		llist.append(10);

		llist.removeAtPosition(0);
		llist.removeAtPosition(2);
		llist.removeAtPosition(1);
		llist.removeAtPosition(3);

		System.out.println(llist.count());
		llist.printLinkedList();

	}

	public void prepend(int item) {
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void append(int item) {
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}

	public void printLinkedList() {
		if (head == null) {
			System.out.println("List is empty.");
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}

	public int count() {
		int count = 0;
		if (head == null) {
			return count;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				count++;
				currentNode = currentNode.next;
			}
		}
		return count;

	}

	public Node search(int item) {
		if (head == null) {
			System.out.println("Not found.");
			return null;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				if (currentNode.data == item) {
					System.out.println("Found.");
					return currentNode;
				}
				currentNode = currentNode.next;
			}
		}
		System.out.println("Not found.");
		return null;

	}

	public void insertAtPosition(int position, int item) {
		if (position == 0) {
			prepend(item);
		} else if (position == count()) {
			append(item);
		} else if (position > 0 && position < count()) {
			Node newNode = new Node(item);
			Node currentNode = head;
			for (int i = 0; i < position - 1; i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		} else {
			System.out.println("Can't insert at position " + position);
		}
	}

	public boolean isEmpty() {
		if (count() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("No item to remove.");
		} else {
			head = head.next;
		}
	}

	public void removeLast() {
		if (isEmpty()) {
			System.out.println("No item to remove.");
		} else if (count() == 1) {
			head = null;
		} else {
			Node currentNode = head;
			for (int i = 0; i < (count() - 2); i++) {
				currentNode = currentNode.next;
			}
			currentNode.next = null;
		}
	}

	public void removeAtPosition(int position) {
		if (position == 0) {
			removeFirst();
		} else if (position == count()) {
			removeLast();
		} else if (position > 0 && position < count()) {
			Node currentNode = head;
			for (int i = 0; i < position - 1; i++) {
				currentNode = currentNode.next;
			}
			currentNode.next = currentNode.next.next;
		} else {
			System.out.println("Position " + position + " is invalid.");
		}
	}

	// add another method | removeValue(int item)

}
