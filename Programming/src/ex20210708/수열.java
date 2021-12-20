package ex20210708;

import java.util.*;

public class ¼ö¿­ {
	static int[] arr, result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		arr = new int[n];
		result = new int[n-k+1];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<n-k+1; i++) {
			int sum =0;
			for ( int j=i; j<i+k; j++) {
				sum += arr[j];
			}
			result[i] = sum;
		}
		int max = result[0];
		for(int i=0 ; i<result.length ; i++) {
			if(result[i]>max) {
				max = result[i];
			}
		}
		System.out.println(max);
	}
}
