package avg;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		double arr[] = new double[n];
		double arr1[] = new double[n];
		double sum = 0;
		double sum1 = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		Arrays.sort(arr);
		/*
		  for (int i = 0; i < arr.length; i++) { 
		  System.out.println(arr[i]); 
		  }
		 */
		for (int i = n1; i < n - n1; i++) {
			sum += arr[i];
			cnt++;
		}

		for (int i = 0; i < n; i++) {
			if(i<=1) {
				arr1[i] = arr[n1];
			}
			else if(i>=n-n1) {
				arr1[i] = arr[n-n1-1];
			}
			else 
				arr1[i] = arr[i];
		}
		
		for (int i = 0; i < n; i++) {
			sum1 += arr1[i];
		}

		System.out.println(String.format("%.2f", (sum / cnt)));
		System.out.println(String.format("%.2f", (sum1 / n)));
	}
}
