package olympic;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int grade = 1;
		
		int[][] arr = new int[n][4];
		int[][] score = new int[n][2];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
/*
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
*/
		for (int i = 0; i < n; i++) {
			score[i][0] = arr[i][0];
			score[i][1] = (arr[i][1] * 3) + (arr[i][2] * 2) + (arr[i][3] * 1); 
																					
		}
		
		for (int i = 0; i < n; i++) {
			if (score[i][0] == n1) {
				for (int j = 0; j < n; j++) {
					if (score[i][1] < score[j][1])
						grade++;
				}
			}
		}
		System.out.println(grade);
	}
}
