package linked_List;

import java.util.Scanner;

public class Linked_List_Test {
	public static void main(String[] args) {
		LinkedList head = new LinkedList();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1.���  2.����  3.�˻�   ���� �Է�: ");
			int n = sc.nextInt();
			if (n == 1) {
				System.out.print("��� �� �Է�: ");
				int value = sc.nextInt();
				head.insertNode(value);
				head.printList();
			}
			// System.out.println(head.size);
			if (n == 2) {
				System.out.print("������ �ε��� �Է�: ");
				int index = sc.nextInt();
				head.deleteNode(index);
				head.printList();
			}
			if (n == 3) {
				System.out.print("�˻� �� �Է�: ");
				int value = sc.nextInt();
				head.searchIndex(value);
				
			}
		}

	}

}
