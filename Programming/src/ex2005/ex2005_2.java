package ex2005;

import java.util.*;

public class ex2005_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] point = new int[num][2];
		int max_x = 0;
		int max_y = 0;
		int index = 0;
		for (int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (y > max_y) {
				max_y = y;
				max_x = x;
			}
			point[i][0] = x;
			point[i][1] = y;

		}
		System.out.println(max_y);
		// 0��° �ε��� �������� 2���� �迭 ����
		Arrays.sort(point, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(point[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < num; i++) {
			if(point[i][1]==max_y) {
				index = i;
			}
		}
		
		int[][] left = new int[index][index]; // 3
		int leftmax = point[0][1];
		left[0][0] = point[0][0];
		left[0][1] = point[0][1];
		// ������
		int[][] right = new int[num - index - 1][num - index - 1]; // 3
		int rightmax = point[num - 1][1];
		right[0][0] = point[num - 1][0];
		right[0][1] = point[num - 1][1];

		for (int i = 0; i < num; i++) {
			// ����
			if (i < index) {
				if (leftmax < point[i][1]) { // ó�� ������ �˻�
					left[i][0] = point[i][0];
					left[i][1] = point[i][1];
				}
			} else if (i == index) {

			} else { // ������
				if (rightmax < point[i][1]) { // �� ������ �˻�
					right[i][0] = point[i][0];
					right[i][1] = point[i][1];
				}
			}

		}
		for (int i = 0; i < index; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(left[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < index; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(right[i][j] + " ");
			}
			System.out.println();
		}
		int area = 0;
		// ����
		for (int i = 0; i < num; i++) {
			// ����
			if (i < index) {
				
			} else if (i == index) {

			} else { // ������

			}

		}
	}
}
