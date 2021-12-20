package linked_List;

import java.util.Scanner;

public class Linked_List_Test {
	public static void main(String[] args) {
		LinkedList head = new LinkedList();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1.등록  2.삭제  3.검색   숫자 입력: ");
			int n = sc.nextInt();
			if (n == 1) {
				System.out.print("노드 값 입력: ");
				int value = sc.nextInt();
				head.insertNode(value);
				head.printList();
			}
			// System.out.println(head.size);
			if (n == 2) {
				System.out.print("삭제할 인덱스 입력: ");
				int index = sc.nextInt();
				head.deleteNode(index);
				head.printList();
			}
			if (n == 3) {
				System.out.print("검색 값 입력: ");
				int value = sc.nextInt();
				head.searchIndex(value);
				
			}
		}

	}

}
