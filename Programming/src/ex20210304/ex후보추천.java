package ex20210304;

import java.util.*;

public class ex후보추천 {
	static int p = 0;
	static int r_n = 0;
	static int n = 0;
	static int[] pictures;
	static int[] n_arr;
	static int[] r_arr;
	static int[] num_arr;
	static int min = 0;
	static boolean check = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt(); // 사진틀 개수
		r_n = sc.nextInt(); // 총 추천 횟수
		r_arr = new int[101];
		pictures = new int[p];
		num_arr = new int[p];
		
		int index = 1;
		for (int i = 0; i < r_n; i++) {
			// n_arr[i] = n = sc.nextInt(); // 학생 번호
			n = sc.nextInt();
			if (pictures[p - 1] != 0) {
				if (check(pictures,n)) { // 학생 번호가 사진틀에 있는지 검사
					r_arr[n]++;
				} else {
					r_arr[n]++;
					int min = 1;
					for (int j = 1; j < 101; j++) {
						if (r_arr[i] == min) {
							min = r_arr[i];
						} else if (r_arr[i] != 0 && r_arr[i] < min) {
							min = r_arr[i];
							index = i;
						}
					}
					if (min == 1) {
						r_arr[pictures[i % p]] = 0;
						pictures[i % p] = n;
					}
				}
			} else {
				pictures[i] = n; 
				r_arr[n]++;
			}
			System.out.println(index);
		}
		
		for (int i1 = 0; i1 < p; i1++) {
			System.out.print(pictures[i1] + " ");

		}
		System.out.println();

		for (int i1 = 0; i1 < 10; i1++) {
			// n_arr[i] = n = sc.nextInt(); // 학생 번호
			System.out.print(r_arr[i1] + " ");

		}
		System.out.println();
	}
	public static boolean check(int []arr,int n) {
		for(int i =0; i<p; i++) {
			if(arr[i] == n) {
				check = true;
				break;
			}
		}
		return check;
	}
}
