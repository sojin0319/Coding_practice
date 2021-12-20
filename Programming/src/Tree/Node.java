package Tree;

public class Node {
	int value;
	Node left;
	Node right;
	Node root;

	public Node getRoot() {
		return this.root;
	}

	public Node() {
		this.value = 0;
		this.left = null;
		this.right = null;
	}

	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public int getValue() {
		return value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void insertnode(int value) {
		Node newnode = new Node(value);
		if (root == null)
			root = newnode;
		else
			insertnode(root, value);
	}

	public void insertnode(Node root, int value) {
		Node node = new Node();
		if (value <= root.value) {
			if (root.getLeft() == null) {
				node.setValue(value);
				root.setLeft(node);
			} else
				insertnode(root.getLeft(), value);
		} else {
			if (root.getRight() == null) {
				node.setValue(value);
				root.setRight(node);
			} else
				insertnode(root.getRight(), value);
		}
	}

	public void deletenode(int value) {
		if (root != null)
			root = deletenode(root,value);
	}

	public Node deletenode(Node root, int value) {
		Node node = new Node();

		if (root == null) 
			return root;
		
		if (value < root.getValue()) 
			root.left = deletenode(root.getLeft(), value);
		else if (value > root.getValue()) 
			root.right = deletenode(root.getRight(), value);
		else {
			if (root.getLeft() == null && root.getRight() == null) 	
				return null;
			if (root.getLeft() == null) {
				node = root.getRight();
				root = null;
				return node;
			} 
			else if (root.getRight() == null) {
				node = root.getLeft();
				root = null;
				return node;
			} 
			else {
				node = min_value_node(root.getRight());

				root.setValue(node.getValue());
				root.right = deletenode(root.getRight(), node.getValue());
			}
		}
		return root;
	}

	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node.value + " ");
			inOrder(node.getRight());
		}
	}

	public boolean searchnode(int data) {
		Node node = root;
		while (node != null) {
			if (node.getValue() == data)
				return true;
			else if (data < node.getValue())
				node = node.getLeft();
			else
				node = node.getRight();
		}
		return false;
	}

	public Node min_value_node(Node root) {
		Node node = new Node();
		node = root;
		while (node.left != null)
			node = node.left;

		return node;
	}
}