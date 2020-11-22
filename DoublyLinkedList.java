package IntroductionToDataStructureAndAlgorithm;

public class DoublyLinkedList {
	Node head;

	public static class Node {
		int data;
		Node next;
		Node prev;

		Node(int item) {
			this.data = item;
			this.next = null;
			this.prev = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dllist = new DoublyLinkedList();
		dllist.append(5);
		dllist.append(15);
		dllist.append(45);
		dllist.insertAfter(45, 99);
		dllist.printLinkedList();

	}

	public void prepend(int item) {
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void append(int item) {
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;

			}
			currentNode.next = newNode;
			newNode.prev = currentNode;
		}
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

	public void removeItem(int item) {
		if (head == null) {
			System.out.println("List is empty. No item to remove.");
			return;
		} else if (head.data == item) {
			head = head.next;
			head.prev = null;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				if (currentNode.data == item) {
					if (currentNode.next == null) {
						currentNode.prev.next = null;
						return;
					} else {
						currentNode.prev.next = currentNode.next;
						currentNode.next.prev = currentNode.prev;
						return;
					}
				}
				currentNode = currentNode.next;
			}
			System.out.println(item + " isn't found in the list.");
		}
	}

	public void insertAfter(int item, int value) {
		Node newNode = new Node(value);
		if (head == null) {
			System.out.println("Couldn't insert. " + item + " isn't found in the list.");
			return;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				if (currentNode.data == item) {
					if (currentNode.next == null) {
						currentNode.next = newNode;
						return;
					} else {
						newNode.prev = currentNode;
						newNode.next = currentNode.next;
						currentNode.next.prev = newNode;
						currentNode.next = newNode;
						return;
					}
				}
				currentNode = currentNode.next;
			}
			System.out.println("Couldn't insert. " + item + " isn't found in the list.");
		}
	}

}
