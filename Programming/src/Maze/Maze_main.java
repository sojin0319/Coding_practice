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
    /* �� ã�� */
    public static boolean findMaze(int x, int y) {
        /* �� �� �ִ� ���� �ƴ� ���! */
        if (maze[y][x] != 0) {
            return false;
        }
        /* �ⱸ�� ��� */
        else if (x == end_x && y == end_y) {
        	++cnt;
            maze[y][x] = 3; // 3�� �ⱸ������ ���
            System.out.println(cnt+"��° ��� ���");
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
        /* ������ �� �ִ� ���(0�� ���) */
        else {
        	stack_x.push(x);
        	stack_y.push(y);
            maze[y][x] = 3; // �������� �� 3���� ǥ��
            //print(x,y);
            if (findMaze(x, y-1) || findMaze(x+1, y) || findMaze(x, y+1) || findMaze(x-1, y)) {
                // �� -> ������ -> �Ʒ� -> ����
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
    
        System.out.println("�̷��� ����� ����: " + m.cnt);
        System.out.println("�̷��� �ִ� ��ΰ� : " + m.MIN);
    }
}