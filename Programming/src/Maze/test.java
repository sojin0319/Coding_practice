package Maze;

import java.util.*;

public class test {
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
	    static int MIN = maze.length * maze.length; 
	    static Queue<Integer> q_x = new LinkedList<Integer>();
	    static Queue<Integer> q_y = new LinkedList<Integer>();
	    private boolean findMazePath(int x, int y) {
            // bc1: 갈 수 없는 곳일 때
            if (maze[y][x] != 0) {
                return false;
            }
            //  bc2: 현재 위치가 출구일때
            else if (x == end_x && y == end_y) {
                maze[y][x] = 3;
                print();
                return true;
            } else {
            	q_x.add(x);
    	    	q_y.add(y);
    	    	System.out.println(q_x);
            	System.out.println(q_y);
                maze[y][x] = 3;
                cnt++;
                print();
                // 만약 여기와 인접한 곳에 출구가 있고 여기도 길이라면
                if (findMazePath(x, y-1) || findMazePath(x+1, y) || findMazePath(x, y+1)|| findMazePath(x-1, y)) {
                	q_x.add(x);
        	    	q_y.add(y);
                	maze[y][x] = 3;
                    return true;
                } else {
                	x = q_x.poll();
                	y = q_y.poll();
                	System.out.println(q_x);
                	System.out.println(q_y);
                    cnt++;
                    print();
                    return false;
                }
            }
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
	    public static void main(String[] args) {
	    	test m = new test();
	        m.findMazePath(start_x, start_y);
	        print();
	        System.out.println("미로의 경우의 수는: " + m.cnt);
	        System.out.println("미로의 최단 경로값 : " + m.MIN);
	    }
}
