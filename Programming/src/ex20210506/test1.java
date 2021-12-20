package ex20210506;

import java.util.Arrays;
import java.util.Comparator;

public class test1 {
	public static int[][] arr = { { 5, 0, 0, 3, 0, 2, 2, 0, 3, 0, 0, 5, 4, 0, 1, 1, 0, 4 },
			{ 4, 1, 0, 3, 0, 2, 4, 1, 0, 1, 1, 3, 0, 0, 5, 1, 1, 3 },
			{ 5, 0, 0, 4, 0, 1, 2, 2, 1, 2, 0, 3, 1, 0, 4, 0, 0, 5 },
			{ 5, 0, 0, 3, 1, 1, 2, 1, 2, 2, 0, 3, 0, 0, 5, 1, 0, 4 } };
	public static int[][] games = new int[6][3];
	static int team1[] = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4 };
	static int team2[] = { 1, 2, 3, 4, 5, 2, 3, 4, 5, 3, 4, 5, 4, 5, 5 };
	public static int[][] game = { { 5, 0, 0 }, { 3, 0, 2 }, { 2, 0, 3 }, { 0, 0, 5 }, { 4, 0, 1 }, { 1, 0, 4 } };

	public static void print(int[][] arr1) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void save(int[][] arr1) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 18; j++) {
				if (j % 3 == 0)
					games[i][j] = arr1[i][j];
				if (j % 3 == 1)
					games[i][j] = arr1[i][j];
				if (j % 3 == 2)
					games[i][j] = arr1[i][j];
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Arrays.sort(game, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[0] - o1[0];
			}
		});
		print(game);

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < arr[i][0]; j++) {
				game[j][2]--;
			}
			game[0][0] = 0;
		}

		print(game);

		// save(arr);
	}
}
