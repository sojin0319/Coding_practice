package Hash;

import java.util.Scanner;

import linked_List.LinkedList;

public class hash_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("해시테이블 개수 입력: ");
		int n = sc.nextInt();
		hash_Table hash = new hash_Table(n);
		while (true) {
			System.out.print("1.등록  2.검색   숫자 입력: ");
			int n1 = sc.nextInt();
			
			if (n1 == 1) {
				System.out.print("노드 값 입력: ");
				int value = sc.nextInt();
				hash.insertNode(value);
				hash.printList();
			}
			if (n1 == 2) {
				System.out.print("검색 값 입력: ");
				int value = sc.nextInt();
				hash.searchIndex(value);
			}
		}
	}
}
