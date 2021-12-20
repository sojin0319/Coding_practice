package ex20210708;

import java.util.Scanner;

public class 공약수 {
	static boolean isAble = true;
	static int n1 = 0;
	static int n2 = 0;
	static int resultn1 = 0;
	static int resultn2 = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt(); // 최대공약수
		int l = sc.nextInt(); // 최소공배수
		// A = 최대공약수 * a
		// B = 최대공약수 * b
		// 최소공배수 = a * b * 최소공약수
		int tmp = l / g;

		for (int i = 1; i * i <= tmp; i++) {
			if (tmp % i == 0) { // 약수구하기
				n1 = i;
				n2 = tmp / i;
				System.out.println(n1 + " " + n2);
				int cnt = 0;
				isAble = true;
				for (int j = 1; j <= n1; j++) {
					if (n1 % j == 0 && n2 % j == 0) { // 서로소인지 판별
						cnt++;
					}
					// 서로소 아님
					if (cnt > 1) {
						isAble = false;
						break;
					}
				}
			}
			if (isAble) {
				resultn1 = n1 * g;
				resultn2 = n2 * g;
			}
		}
		System.out.println(resultn1 + " " + resultn2);
	}
}
