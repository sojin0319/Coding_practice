package ex20210729;

import java.util.Scanner;

public class 색종이만들기 {
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

	// 같은 색인지 확인
	public static boolean check(int n, int y, int x) {

		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (arr[y][x] != arr[j][i]) { // 첫번째 값과 비교
					return false;
				}
			}
		}
		return true;
	}
}
