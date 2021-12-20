package graph;

import java.io.*;
import java.util.*;

class ArrGraph1 {

	private int[][] arr_graph;
	private boolean[][] visit;
	private int[][] visited;

	public ArrGraph1(int size) {
		this.arr_graph = new int[size + 1][size + 1];
		this.visit = new boolean[size + 1][size + 1];
		this.visited = new int[size + 1][size + 1];
	}

	public void put(int x, int y, int v) {
		arr_graph[x][y] = arr_graph[y][x] = v;
	}

	public void print() {
		for (int i = 0; i < arr_graph.length; i++) {
			for (int j = 0; j < arr_graph[0].length; j++) {
				System.out.print(arr_graph[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void clearVisitArr() {
		for (int i = 0; i < this.arr_graph.length; i++) {
			this.visit[i][i] = false;
		}
	}

	public void dfs(int s, int e) {
		Stack<Integer> stack = new Stack<>();

		stack.push(s);
		this.visit[s][s] = true;
		boolean flag = true;
		// System.out.print(s + " ");

		while (!stack.isEmpty()) {

			flag = false;
			int a = stack.peek();
			for (int i = 1; i <= 6; i++) {
				if (arr_graph[a][i] != 0 && visit[a][i] == false) {
					if (i > a) {
						stack.push(i);
						System.out.print(stack + " ");
					}
					// System.out.print(i + " ");

					visit[a][i] = true;
					flag = true;
					break;
				}

			}
			if (!flag) {
				stack.pop();
				System.out.print(stack + " ");
			}
		}
	}
}

public class test1 {

	public static void main(String[] args) {
		String path = "D:\\DSEM\\graph.txt";

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int point = 6;

		ArrGraph1 ag = new ArrGraph1(point);

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));

			for (int i = 0; i < 1; i++) {
				sc = new Scanner(br);

				while (sc.hasNext()) {
					String line = sc.nextLine();
					String[] split = line.split(" ");

					int x = Integer.parseInt(split[0]);
					int y = Integer.parseInt(split[1]);
					int v = Integer.parseInt(split[2]);

					ag.put(x, y, v);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		ag.print();
		ag.dfs(start, end);


	}

}
