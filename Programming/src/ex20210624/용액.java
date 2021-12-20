package ex20210624;

import java.util.*;

public class ฟ๋พื {
	public static int arr[] = { -99, -2, -1, 4, 98 };
//	public static int arr[] = {-100, -2, -1, 103};
	public static int n = arr.length;

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int max = Math.abs(arr[0] + arr[1]);
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];
				if (max >= Math.abs(sum)) {
					max = Math.abs(sum);
					num1 = arr[i];
					num2 = arr[j];
				}
			}
		}
		System.out.println(num1 + " " + num2);
	}
}
