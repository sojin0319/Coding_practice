package Tree;

import java.util.Scanner;

public class tree_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node node = new Node();
		while (true) {
			System.out.print("1.���  2.����  3.�˻�  4.  ���� �Է�: ");
			int n = sc.nextInt();
			if (n == 1) {
				System.out.print("��� �� �Է�: ");
				int value = sc.nextInt();
				node.insertnode(value);
				node.inOrder(node.getRoot());
			}
			if (n == 2) {
				System.out.print("���� �� �Է�: ");
				int value = sc.nextInt();
				node.deletenode(value);
				node.inOrder(node.getRoot());
			}
			if (n == 3) {
				System.out.print("�˻� �� �Է�: ");
				int value = sc.nextInt();
				node.searchnode(value);
				if(node.searchnode(value)==true)
					System.out.println("�˻� ��  " + value + " �ֽ��ϴ�.");
				else
					System.out.println("�˻� ���� �����ϴ�.");
				
			}
			System.out.println("\n");
		}
	}
}
