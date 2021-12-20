package ex20210715;

import java.util.*;

public class 전구 {
	static int[] light;
	static int[] arr;
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 0;
		light = new int[n];

		for (int i = 0; i < n; i++) {
			light[i] = sc.nextInt();
		}

		Deduplication(light);
		ListtoArray(list);
		print(arr);

		while (true) {
			if (check(arr)) { // 2 3 2 인지 검사
				for (int i = 1; i < arr.length; i++) {
					if (arr[i - 1] == arr[i + 1]) {
						arr[i] = arr[i - 1];
						cnt++;
						print(arr);
						Deduplication(arr);
						ListtoArray(list);
						print(arr);
						break;
					}
				}
			} else {
				for (int i = 1; i < arr.length; i++) {
					arr[i] = arr[i - 1];
					cnt++;
					print(arr);
					Deduplication(arr);
					ListtoArray(list);
					print(arr);
					break;
				}
			}
			if (arr.length == 1) {
				System.out.println(cnt);
				break;
			}
		}
	}

	public static ArrayList<Integer> Deduplication(int light[]) {
		list = new ArrayList<Integer>();
		for (int i = 0; i < light.length; i++) {
			if (i == light.length - 1) {
				if (light[i] != light[i - 1]) {
					list.add(light[i]);
				}
			} else if (light[i] == light[i + 1]) {
				list.add(light[i]);
				i++;
			} else {
				if (i != 0 && light[i] == light[i - 1]) {
					i++;
					list.add(light[i]);
				} else {
					list.add(light[i]);
				}
			}
		}
		return list;
	}

	public static int[] ListtoArray(ArrayList<Integer> list) {
		int index = 0;
		arr = new int[list.size()];
		for (int temp : list) {
			arr[index++] = temp;
		}
		return arr;
	}

	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static boolean check(int arr[]) {
		boolean able = false;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] == arr[i + 1]) {
				able = true;
				break;
			}
		}
		return able;
	}
}
