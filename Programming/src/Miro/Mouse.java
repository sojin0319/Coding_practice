package Miro;

import java.util.*;

public class Mouse {
   public int x;
   public int y;
   
   public int[][] maze;
   
   public Stack<Integer> stack_x = new Stack<Integer>();
   public Stack<Integer> stack_y = new Stack<Integer>();
   
   public Mouse() {
      this(new int[5][5],1,1);
   }
   
   public Mouse(int[][] map, int x, int y) {
      this.x = x;
      this.y = y;
      this.maze = map;
//      this.maze = new int[map.length][];
//      for (int i=0; i<map.length; i++) {
//         this.maze[i] = new int[map[i].length];
//         for (int j=0; j<map[i].length; j++) {
//            this.maze[i][j] = map[i][j];
//         }
//      }
      
   }
   
   public boolean isUpAvailable() {
      if (y-1 >= 0 && maze[y-1][x] == 0)
         return true;
      return false;
   }

   public boolean isDownAvailable() {
      if (y+1 < maze.length && maze[y+1][x] == 0)
         return true;
      return false;
   }

   public boolean isLeftAvailable() {
      if (x-1 >= 0 && maze[y][x-1] == 0)
         return true;
      return false;
   }

   public boolean isRightAvailable() {
      if (x+1 < maze[y].length && maze[y][x+1] == 0)
         return true;
      return false;
   }
   
   public Mouse findNext() {
      if (isUpAvailable()) {
         maze[y][x] = 3;
         stack_x.push(x);
         stack_y.push(y);
         y--;   
         return this;
      }

      if (isRightAvailable()) {
         maze[y][x] = 3;
         stack_x.push(x);
         stack_y.push(y);            
         x++;   
         return this;
      }
      
      if (isDownAvailable()) {
         maze[y][x] = 3;
         stack_x.push(x);
         stack_y.push(y);
         y++;
         return this;
      }

      if (isLeftAvailable()) {
         maze[y][x] = 3;   
         stack_x.push(x);
         stack_y.push(y);   
         x--;
         return this;
      }
      else {
         maze[y][x] = 2;
         x = stack_x.pop();
         y = stack_y.pop();
      }
      return this;
   }
}