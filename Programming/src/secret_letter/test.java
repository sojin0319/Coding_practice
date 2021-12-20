package secret_letter;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		int[] A = {0,0,0,0,0,0};
//		int[] B = {0,0,1,1,1,1};
		String[] al = { "000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010" };
		String[] al1 = { "A", "B", "C", "D", "E", "F", "G", "H" };
//		int n = 5;
		String text = "011111000000111111000000111111";
		int n = 3;
//		String text = "001110000100011100";
		int[] arr = new int[n * 6];
		String[] t = new String[n];
		char[] a1 = new char[6];
		char[] a2 = new char[6];
		String[] result = new String[n];
		int[] result1 = new int[8];
		boolean check = true;

		for (int i = 0; i < n; i++) {
			String a = text.substring(6 * i, 6 * (i + 1));
			t[i] = a;
			a1 = t[i].toCharArray();
			int cnt;
			int g = 0;
			for (int j = 0; j < al.length; j++) {
				a2 = al[j].toCharArray();
				cnt = 0;
				for (int k = 0; k < 6; k++) {
					if (a1[k] != a2[k])
						cnt++;
				}
				if (cnt <= 1) {
					result[i] = al1[j];
				} else {
					if (cnt == 6) {
						result[i] = "null";
						result1[i] = i + 1;
					}
				}
			}
		}

		int cnt1 = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == "null") {
				cnt1++;
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (cnt1 == 0) {
				System.out.print(result[i]);
			} else {
				if (result1[i] != 0) {
					int m = result1[i];
					int min = result1[0];
					if (min < m) {
						min = m;
						System.out.println(min);
						break;
					}
				}
			}
		}
	}
}
