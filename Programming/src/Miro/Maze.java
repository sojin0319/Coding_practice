package Miro;

public class Maze {
	 int x = 1;
	 int y = 1;
	 int[][] maze = { { 1, 1, 1, 1, 1, 1, 1 }, 
					  { 1, 0, 0, 0, 1, 1, 1 }, 
					  { 1, 0, 1, 0, 0, 1, 1 },
					  { 1, 0, 0, 1, 0, 1, 1 }, 
					  { 1, 0, 1, 1, 0, 1, 1 }, 
					  { 1, 0, 0, 1, 0, 0, 1 }, 
					  { 1, 1, 1, 1, 1, 1, 1 } };

	public  void printMaze() {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				maze[x][y] = 7;
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public  boolean check(int x, int y) { // ╩С го аб ©Л е╫╩Ж
		if (maze[x][y - 1] == 0) {
			return true;
		} else if (maze[x + 1][y] == 0) {
			return true;
		} else if (maze[x][y + 1] == 0) {
			return true;
		} else if (maze[x - 1][y] == 0) {
			return true;
		}
		return false;
	}

	public void find(int x, int y) {
		while (true) {
			if(check(x,y) == true) {
				if (maze[x][y - 1] == 0) {
					y--;
					maze[x][y] = 3;
					printMaze();
				} else if (maze[x + 1][y] == 0) {
					x++;
					maze[x][y] = 3;
					printMaze();
				} else if (maze[x][y + 1] == 0) {
					y++;
					maze[x][y] = 3;
					printMaze();
				} else if (maze[x - 1][y] == 0) {
					x--;
					maze[x][y] = 3;
					printMaze();
				}
			}
			else {
				maze[x][y] = 3;
				if (maze[x][y -1] == 3) {
					y--;	
					printMaze();
				} else if (maze[x + 1][y] == 3) {
					x++;
					printMaze();
				} else if (maze[x][y + 1] == 3) {
					y++;
					printMaze();
				} else if (maze[x - 1][y] == 3) {
					x--;
					printMaze();
				}
			}
			if (maze[maze.length - 2][maze.length - 2] != 0) {
				maze[x][y] = 7;
				printMaze();
				break;
			}
		}
	}
}