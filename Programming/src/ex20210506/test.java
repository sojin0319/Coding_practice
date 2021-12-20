package ex20210506;

import java.util.Arrays;
import java.util.Comparator;

public class test {
	public static int[][] arr = { { 5, 0, 0, 3, 0, 2, 2, 0, 3, 0, 0, 5, 4, 0, 1, 1, 0, 4 },
			{ 4, 1, 0, 3, 0, 2, 4, 1, 0, 1, 1, 3, 0, 0, 5, 1, 1, 3 },
			{ 5, 0, 0, 4, 0, 1, 2, 2, 1, 2, 0, 3, 1, 0, 4, 0, 0, 5 },
			{ 5, 0, 0, 3, 1, 1, 2, 1, 2, 2, 0, 3, 0, 0, 5, 1, 0, 4 } };
	public static int[][] games = new int[6][3];
	static int answer[] =new int[4];
	public static int[][] game = { {5, 0, 0}, 
			{3, 0, 2}, {2, 0, 3}, {0, 0, 5}, {4, 0, 1}, {1, 0, 4} };
	public static void print(int[][] arr1) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			int a = 0;
			int b = 0;
			int c = 0;
			int bcount =0;
			for (int j = 0; j < 18; j++) {
				if(j%3==0) {
					//System.out.println(j);
					a += arr[i][j];
				}
				if(j%3==1) {
					if(arr[i][j]!=0) {
						bcount++;
					}
					b += arr[i][j];
				}
				if(j%3==2) {
					c += arr[i][j];
				}
			}
			if(a==c && bcount %2 ==0) {
				answer[i] = 1;
			}
			System.out.println(a);
			System.out.println(b);
			System.out.println(bcount);
			System.out.println(c);
		}
		for(int i =0; i<answer.length;i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();
	}
}
