package IntroductionToDataStructureAndAlgorithm;

public class BinaryTree {
	Node root;

	static class Node {
		Node left;
		Node right;
		int data;

		Node(int item) {
			this.data = item;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree binaryTree = new BinaryTree();
		Node two = new Node(2);
		Node seven = new Node(7);
		Node nine = new Node(9);
		Node one = new Node(1);
		Node six = new Node(6);
		Node eight = new Node(8);
		Node five = new Node(5);
		Node ten = new Node(10);
		Node three = new Node(3);
		Node four = new Node(4);
		binaryTree.root = two;
		binaryTree.addLeftChild(two, seven);
		binaryTree.addRightChild(two, nine);

		binaryTree.addLeftChild(seven, one);
		binaryTree.addRightChild(seven, six);

		binaryTree.addRightChild(nine, eight);

		binaryTree.addLeftChild(six, five);
		binaryTree.addRightChild(six, ten);

		binaryTree.addLeftChild(eight, three);
		binaryTree.addRightChild(eight, four);

		System.out.print("Pre-order traversal: ");
		binaryTree.preOrderTraversal(two);

		System.out.print("\nPost-order traversal: ");
		binaryTree.postOrderTraversal(two);
		
		System.out.print("\nIn-order traversal: ");
		binaryTree.inOrderTraversal(two);

	}

	void addLeftChild(Node node, Node child) {
		node.left = child;
	}

	void addRightChild(Node node, Node child) {
		node.right = child;
	}

	void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
		} else if (root == null) {
			System.out.println("Tree is empty.");
			return;
		}
		if (root.left != null) {
			preOrderTraversal(root.left);
		}
		if (root.right != null) {
			preOrderTraversal(root.right);
		}
	}

	void postOrderTraversal(Node root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return;
		}
		if (root.left != null) {
			postOrderTraversal(root.left);
		}
		if (root.right != null) {
			postOrderTraversal(root.right);
		}

		if (root != null) {
			System.out.print(root.data + " ");
		}
	}

	void inOrderTraversal(Node root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return;
		}
		if (root.left != null) {
			inOrderTraversal(root.left);
		}
		if (root != null) {
			System.out.print(root.data + " ");
		}
		if (root.right != null) {
			inOrderTraversal(root.right);
		}

	}

}
