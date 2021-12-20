package Maze;

import java.util.*;

public class Maze_main {
    static int[][] maze = {
    		{1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,1},
            {1,0,1,1,1,0,1,1},
            {1,0,1,1,1,0,1,1},
            {1,0,0,1,0,0,0,1},
            {1,1,0,1,0,1,0,1},
            {1,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1}};
    
    static int size_y = maze.length;
    static int size_x = maze[0].length;
    static int start_x = 1;
    static int start_y = 1;
    static int end_x = size_x-2;
    static int end_y  = size_y-2;
    static int cnt = 0;
    static int a = 0;
    static int MIN = 0;
    public static Stack<Integer> stack_x = new Stack<Integer>();
    public static Stack<Integer> stack_y = new Stack<Integer>();
    static int[] arr = new int[maze.length*maze.length];
    /* 길 찾기 */
    public static boolean findMaze(int x, int y) {
        /* 갈 수 있는 길이 아닌 경우! */
        if (maze[y][x] != 0) {
            return false;
        }
        /* 출구의 경우 */
        else if (x == end_x && y == end_y) {
        	++cnt;
            maze[y][x] = 3; // 3은 출구까지의 경로
            System.out.println(cnt+"번째 경로 출력");
            for(int i=0; i<maze.length; i++) {
                for(int j=0; j<maze[i].length; j++) {
                    System.out.print(maze[i][j] + " ");
                }
                System.out.println();
            }
            a = stack_x.size();
            arr[cnt] = a;
            System.out.println(arr[cnt]);
            maze[y][x] = 0;
            //print(x,y);
            if(arr[cnt] < MIN) {
            	MIN = arr[cnt];
            	System.out.println(MIN);
            }
            return false;
        }
        /* 지나갈 수 있는 경우(0인 경우) */
        else {
        	stack_x.push(x);
        	stack_y.push(y);
            maze[y][x] = 3; // 지나가는 길 3으로 표시
            //print(x,y);
            if (findMaze(x, y-1) || findMaze(x+1, y) || findMaze(x, y+1) || findMaze(x-1, y)) {
                // 위 -> 오른쪽 -> 아래 -> 왼쪽
                return true;
            }
           // print(x,y);
            else {
            	maze[y][x] = 2;
            }
            maze[y][x] = 0;
            return false;
        }
    }

    public static void print(int x, int y) {
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < size_y; i++) {
            for (int j = 0; j < size_x; j++) {
                if (i==y && j==x) {
                    System.out.print("* ");
                } else {
                    System.out.print(maze[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("x : " + stack_x);
        System.out.println("y : " + stack_y);
        Scanner in = new Scanner(System.in); in.nextLine();
    }
    public static void print() {
        System.out.println();

        for(int i=0; i<maze.length; i++) {
            for(int j=0; j<maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
    	Maze_main m = new Maze_main();
        findMaze(start_x, start_y);
    
        System.out.println("미로의 경우의 수는: " + m.cnt);
        System.out.println("미로의 최단 경로값 : " + m.MIN);
    }
}