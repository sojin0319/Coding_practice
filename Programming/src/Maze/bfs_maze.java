package Maze;

import java.util.*;

public class bfs_maze {
	public static void main(String[] args) {
		bfs(1, 1);
		print();
	}

	public static Queue<Integer> qx = new LinkedList<Integer>();
	public static Queue<Integer> qy = new LinkedList<Integer>();

	static int[][] maze = { 
			{ 1, 1, 1, 1, 1, 1, 1, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 1, 1, 1, 0, 1, 1 },
			{ 1, 0, 1, 1, 1, 0, 1, 1 }, 
			{ 1, 0, 1, 1, 1, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 0, 1 }, 
			{ 1, 1, 1, 1, 1, 1, 1, 1 } };

	static int size_y = maze.length;
	static int size_x = maze[0].length;
	static int start_x = 1;
	static int start_y = 1;
	static int end_x = size_x - 2;
	static int end_y = size_y - 2;
	static int cnt = 0;
	public static int MIN = maze.length * maze.length;
	static int arr[][] = new int[100][2];
	static boolean[][] visit = new boolean[size_y][size_x];
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static void bfs(int x, int y) {
		qx.add(x);
		qy.add(y);
		while (!qx.isEmpty() && !qy.isEmpty()) {
			x = qx.poll();
			y = qy.poll();
			visit[x][y] = true;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < size_y && ny < size_x) {
					if (maze[nx][ny]==0) {
						qx.add(nx);
						qy.add(ny);
						visit[nx][ny] = true;
						maze[nx][ny] = maze[x][y] + 1;
					}
				}
			}
		}
	}
	public static void print(int x, int y) {
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = 0; i < size_y; i++) {
			for (int j = 0; j < size_x; j++) {
				if (i == y && j == x) {
					System.out.print("* ");
				} else {
					System.out.print(maze[i][j] + " ");
				}
			}

			System.out.println();
		}
		System.out.println();
		Scanner in = new Scanner(System.in);
		in.nextLine();
	}

	public static void print() {
		System.out.println();
		System.out.println();
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
