package ex20210902;

import java.util.Scanner;

public class Ä«µå³îÀÌ {
	static int[] A;
	static int[] B;
	static String[] result;
	static int A_score = 0;
	static int B_score = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = new int[10];
		B = new int[10];

		result = new String[10];
		for (int i = 0; i < 10; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			B[i] = sc.nextInt();
		}

		if (check_same(A, B)) {
			System.out.println(10 + " " + 10);
			System.out.println("D");
		} else {
			for (int i = 0; i < 10; i++) {
				if (A[i] > B[i]) {
					A_score += 3;
					result[i] = "A";
				} else if (A[i] == B[i]) {
					A_score += 1;
					B_score += 1;
					result[i] = "D";
				} else {
					B_score += 3;
					result[i] = "B";
				}
			}

			System.out.println(A_score + " " + B_score);

			if (A_score > B_score) {
				System.out.println("A");
			} else if (A_score == B_score) {
				for (int i = 9; i >= 0; i--) {
					if (A[i] != B[i]) {
						System.out.println(result[i]);
						break;
					}
				}
			} else {
				System.out.println("B");
			}
		}
	}

	public static boolean check_same(int[] a, int[] b) {
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i] == b[i]) {
				cnt++;
			}
		}
		if( cnt ==10) {
			return true;
		}
		return false;
	}
}
