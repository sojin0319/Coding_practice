package graph;

import java.util.ArrayList;

public class test2 {
	public static void main(String[] args) {
		ArrayList<int[]> path = new ArrayList<int[]>();
		int[] arr = new int[3];
		arr[0] =1;
		arr[1] = 3;
		System.out.println(arr[0]);
		path.add(arr);
		
		for(int i =0;i<path.size();i++)
			System.out.println(path.toArray());
	}
}
