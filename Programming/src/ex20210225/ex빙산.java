package ex20210225;

import java.util.*;

public class ex���� {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int n = 0;
	static int m = 0;
	static int[][] arr;
	static int[][] visited;
	static int[][] melt;
	static int year = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n][m];
		visited = new int[n][m];
		melt = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		while (true) {
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (visited[i][j] == 0 && arr[i][j] != 0) {
						dfs(i, j);
						cnt++; // ���� ��� ����
					}
				}
			}
			if (cnt == 0) {
				System.out.println(0);
				break;
			} else if (cnt >= 2) {
				System.out.println(year);
				break;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] -= melt[i][j]; // ���� ���̱�

					if (arr[i][j] < 0) { // -1 �϶� 0���� ����
						arr[i][j] = 0;
					}

					// �ʱ�ȭ
					visited[i][j] = 0;
					melt[i][j] = 0;
				}
			}
			
			System.out.println();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
			year++;

		}
	}

	static void dfs(int x, int y) {
		visited[x][y] = 1;

		for (int i = 0; i < 4; i++) { // �� �� �� ��  ��
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (0 <= nx && nx < n && 0 <= ny && ny < m) {
				if (arr[nx][ny] == 0) {
					melt[x][y]++; // 0�� ���� ����
				}
				if (visited[nx][ny] == 0 && arr[nx][ny] != 0)
					dfs(nx, ny);
			}
		}

	}
}
