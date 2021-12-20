package ex2005;

import java.util.*;

public class ex2005_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] arr = new int[num][5];
		int[] score = new int[100];
		int max = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 5; j++) {
				int n = sc.nextInt();
				arr[i][j] = n;
			}
		}

//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();

		for (int i = 0; i < num; i++) {
			// 5개 카드중 3개조합 모든 경우 수
			for (int j = 0; j < 5; j++) {
				for (int k = j + 1; k < 5; k++) {
					for (int l = k + 1; l < 5; l++) {
						// 각 인원의 일의 자리 수 최대값 저장
						score[i] = Math.max(score[i], (arr[i][j] + arr[i][k] + arr[i][l]) % 10);
					}
				}
			}		
		}

		for (int i = 0; i < num; i++) {
			// 점수 최대값 저장
			max = Math.max(max, score[i]);
			if (score[i] == max) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
