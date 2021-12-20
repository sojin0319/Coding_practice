package bee;

import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int arr[][] = new int[m][m];
		int arr1[] = new int[2*m -1];
		
		for(int i =0; i< 2*m -1; i++) {
			arr1[i] =1;
		}
		
		for(int i =0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			for(int j =a; j<a+b; j++) {
				arr1[j]+=1;
			}
			for(int j =a+b; j < 2*m -1; j++) {
				arr1[j] +=2;
			}
		}
	/*	for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
	 */		
		for(int i =0; i<m;i++) {
			for(int j = 0; j<m;j++) {
				if(j==0) {
					arr[i][j] = arr1[m - i -1];
				}
				else {
					arr[i][j] = arr1[m + j -1];
				}
			}
		}
		
		for(int i =0;i<m;i++) {
			for(int j =0; j<m;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
