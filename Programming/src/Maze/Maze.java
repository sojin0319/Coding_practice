package Maze;

import java.util.*;

public class Maze {
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
    public static int MIN = maze.length * maze.length; 
    static int arr[][] = new int[100][2];
    
    public static void findMaze(int x, int y, int len) {
    	
        if (maze[y][x] != 0) {
            return;
        }
        arr[len][0] = x;
        arr[len][1] = y;
        if (x == end_x && y == end_y) { // 출구
        	cnt++;
            maze[y][x] = 3;
            System.out.println(cnt+"번째 경로 출력");
            print();
            System.out.println();
            System.out.println(cnt+"번째 이동거리:" + len);
            for(int i =0; i<len;i++) {
            	System.out.print(arr[i][1] + "," + arr[i][0] +"  ");
            }
            System.out.println();
            if (MIN > len) {
                MIN = len;
            }
            maze[y][x] = 0;
            return;
        }
            maze[y][x] = 3; 
           //print(x,y);  
           //위 오 아 왼
            findMaze(x, y-1,len+1);
            findMaze(x+1, y,len+1);
            findMaze(x, y+1,len+1);
            findMaze(x-1, y,len+1);
            //print(x,y);
            len++;
            maze[y][x] = 0; 
            return;
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
        System.out.println();
        Scanner in = new Scanner(System.in); in.nextLine();
    }
    public static void print() {
        System.out.println();
        System.out.println();
        for(int i=0; i<maze.length; i++) {
            for(int j=0; j<maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}