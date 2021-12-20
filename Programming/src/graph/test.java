package graph;

import java.io.*;
import java.util.*;

class ArrGraph {
	int sum = 0;
	private int[][] arr_graph;
	private boolean[] visit;
	 int[] visited;

	public ArrGraph(int size) {
		this.arr_graph = new int[size + 1][size + 1];
		this.visit = new boolean[size + 1];
		this.visited = new int[size + 1];
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

	public void dfs(int s, int e) {
//		Stack<Integer> stack = new Stack<>();
//		ArrayList<Integer> path = new ArrayList<Integer>();
		this.visit[s] = true;
		
		if (s == e) {
			System.out.print(s);
		}
		for (int i = 1; i <= 6; i++) {
		//	stack.push(i);
			//System.out.print(stack + " ");
			if (arr_graph[s][i] != 0 && visit[i] == false) {
		//		sum++;
		//		System.out.println(s + "->" + i + "로 이동합니다. => 값: " + arr_graph[s][i]);
		//		visited[sum]=i;
				dfs(i, e); // dfs() 재귀호출
			//	sum = s-1;
		//		System.out.println(i + "->" + s + "로 이동합니다. => 값: " + arr_graph[s][i]);
				visit[i] = false;
			}
		}
//		if(s==e) {
//			for(int j =0;j<visited.length;j++) {
//				System.out.print(visited[j] + " ");
//			}
//			System.out.println();
//		}
	}
}

public class test {

	public static void main(String[] args) {
		String path = "D:\\DSEM\\graph.txt";

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int point = 6;

		ArrGraph ag = new ArrGraph(point);

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
		//ag.visited[0] = start;
		ag.dfs(start, end);
		
	}

}
