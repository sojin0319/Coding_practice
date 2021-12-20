package Hash;

import linked_List.*;

public class hash_Table {
	int size;
	private LinkedList[] hash_Table;
	
	public hash_Table(int size) {
		hash_Table = new LinkedList[size];
		for (int i = 0; i < size; i++)
			hash_Table[i] = null;
		this.size = size;
	}
	public int size() {
		return size;
	}
	public void insertNode(int value) {
		int key = value % size;
		LinkedList newnode = new LinkedList(value);
		LinkedList node =new LinkedList();
		if (hash_Table[key] == null)
			hash_Table[key] = newnode;
		else {
			node.next = hash_Table[key];

			while (node.next != null)
				node = node.next;
		}
		node.next = newnode;
	}
	
	public void searchIndex(int data) {
		int key = data % size;
		int index = 0;
		LinkedList node = new LinkedList();
		node = this.hash_Table[key];
		while ( node.value != data) {
			node = node.next;
			index++;
		}
		System.out.println(key + "번째 테이블의 인덱스: " + index);
	}

	public void printList() {
		LinkedList node = new LinkedList();
		for (int i = 0; i < size; i++) {
			node = this.hash_Table[i];
			while (node != null) {
				System.out.print(node.getvalue() + "->");
				node = node.next;
			}
			System.out.println();
		}
		System.out.println();
	}
}
