package ex20210729;

import java.util.Scanner;

public class �����̸���� {
	static int[][] arr;
	static int white = 0;
	static int blue = 0;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		cut(n, 0, 0);
		System.out.println(white);
		System.out.println(blue);
	}

	public static void cut(int n, int y, int x) {
		if (check(n, y, x)) {
			if (arr[y][x] == 0) {
				white++;
			} else {
				blue++;
			}
			return;
		}
		cut(n / 2, y, x); // 2
		cut(n / 2, y, x + n / 2); // 1
		cut(n / 2, y + n / 2, x); // 3
		cut(n / 2, y + n / 2, x + n / 2); // 4
	}

	// ���� ������ Ȯ��
	public static boolean check(int n, int y, int x) {

		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (arr[y][x] != arr[j][i]) { // ù��° ���� ��
					return false;
				}
			}
		}
		return true;
	}
}
