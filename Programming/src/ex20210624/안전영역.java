package ex20210624;

import java.util.*;

public class 안전영역 {
	public static int[][] arr;
	public static boolean[][] visited;
	public static ArrayList<Integer> list;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		arr = new int[n][n];
		visited = new boolean[n][n];
		list = new ArrayList<>();
		
		// 가장 큰 높이 찾기
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				if (max < arr[i][j])
					max = arr[i][j];
			}
		}


	}
	
	public static void visited_reset(boolean arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] =false;
			}
		}
	}
	public static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr.length) {
				if (arr[nx][ny] != 0 && !visited[nx][ny])
					dfs(nx, ny);
			}
		}
	}
}
