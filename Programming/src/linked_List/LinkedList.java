package linked_List;

public class LinkedList {
	public int value;
	public LinkedList next;
	LinkedList head;

	public LinkedList() {
		this.value = 0;
		this.next = null;
	}

	public LinkedList(int value) {
		this.value = value;
		this.next = null;
	}

	public int getvalue() {
		return this.value;
	}

	public void insertNode(int value) {
		LinkedList newnode = new LinkedList(value);
		LinkedList node = new LinkedList();
		if (head == null)
			this.head = newnode;
		else {
			node.next = head;

			while (node.next != null)
				node = node.next;
		}
		node.next = newnode;
	}

	public LinkedList searchNode(int index) {
		LinkedList node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void deleteNode(int index) {
		LinkedList prenode = new LinkedList();
		LinkedList delnode = new LinkedList();
		if (index == 0) {
			prenode = head;
			head = head.next;
			prenode = null;
		}
		else {
			prenode = searchNode(index - 1);
			delnode = prenode.next;
			prenode.next = prenode.next.next;
			delnode = null;
		}
	}

	public void searchIndex(int data) {
		LinkedList node = head;
		int index = 0;
		while (node.value != data) {
			node = node.next;
			index++;
		}
		System.out.println("ÀÎµ¦½º: " + index);
	}

	public void printList() {
		LinkedList node = head;

		while (node != null) {
			System.out.print(node.getvalue() + " ");
			node = node.next;
		}
		System.out.println();
	}

}
