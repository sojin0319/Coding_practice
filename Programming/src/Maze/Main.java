package Maze;

public class Main {
	public static void main(String[] args) {
		Maze m = new Maze();
		System.out.print("ó�� �̷�");
		m.print();
		m.findMaze(m.start_x, m.start_y, 0);

		System.out.println("�̷��� ����� ����: " + m.cnt);
		System.out.println("�̷��� �ִ� �Ÿ��� : " + m.MIN);
	}
}
