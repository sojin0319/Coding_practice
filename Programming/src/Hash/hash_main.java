package Hash;

import java.util.Scanner;

import linked_List.LinkedList;

public class hash_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ؽ����̺� ���� �Է�: ");
		int n = sc.nextInt();
		hash_Table hash = new hash_Table(n);
		while (true) {
			System.out.print("1.���  2.�˻�   ���� �Է�: ");
			int n1 = sc.nextInt();
			
			if (n1 == 1) {
				System.out.print("��� �� �Է�: ");
				int value = sc.nextInt();
				hash.insertNode(value);
				hash.printList();
			}
			if (n1 == 2) {
				System.out.print("�˻� �� �Է�: ");
				int value = sc.nextInt();
				hash.searchIndex(value);
			}
		}
	}
}
