package Maze;

public class Main {
	public static void main(String[] args) {
		Maze m = new Maze();
		System.out.print("처음 미로");
		m.print();
		m.findMaze(m.start_x, m.start_y, 0);

		System.out.println("미로의 경우의 수는: " + m.cnt);
		System.out.println("미로의 최단 거리값 : " + m.MIN);
	}
}
