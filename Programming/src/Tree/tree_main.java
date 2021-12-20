package Tree;

import java.util.Scanner;

public class tree_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node node = new Node();
		while (true) {
			System.out.print("1.등록  2.삭제  3.검색  4.  숫자 입력: ");
			int n = sc.nextInt();
			if (n == 1) {
				System.out.print("노드 값 입력: ");
				int value = sc.nextInt();
				node.insertnode(value);
				node.inOrder(node.getRoot());
			}
			if (n == 2) {
				System.out.print("삭제 값 입력: ");
				int value = sc.nextInt();
				node.deletenode(value);
				node.inOrder(node.getRoot());
			}
			if (n == 3) {
				System.out.print("검색 값 입력: ");
				int value = sc.nextInt();
				node.searchnode(value);
				if(node.searchnode(value)==true)
					System.out.println("검색 값  " + value + " 있습니다.");
				else
					System.out.println("검색 값이 없습니다.");
				
			}
			System.out.println("\n");
		}
	}
}
