package ex20210708;

import java.util.Scanner;

public class ����� {
	static boolean isAble = true;
	static int n1 = 0;
	static int n2 = 0;
	static int resultn1 = 0;
	static int resultn2 = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt(); // �ִ�����
		int l = sc.nextInt(); // �ּҰ����
		// A = �ִ����� * a
		// B = �ִ����� * b
		// �ּҰ���� = a * b * �ּҰ����
		int tmp = l / g;

		for (int i = 1; i * i <= tmp; i++) {
			if (tmp % i == 0) { // ������ϱ�
				n1 = i;
				n2 = tmp / i;
				System.out.println(n1 + " " + n2);
				int cnt = 0;
				isAble = true;
				for (int j = 1; j <= n1; j++) {
					if (n1 % j == 0 && n2 % j == 0) { // ���μ����� �Ǻ�
						cnt++;
					}
					// ���μ� �ƴ�
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
