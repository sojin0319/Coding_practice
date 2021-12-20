package bee;
import java.util.*;


public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr1[] = new int[2*m];
		
		
		for(int i =0; i< 2*m -1; i++) {
			arr1[i] =1;
		}
		for(int i =0; i<n; i++) {
			int a =0;
			int b =0;
			int c =0;
			a= sc.nextInt();
			b= sc.nextInt();
			c= sc.nextInt();
			for(int j =a; j<a+b; j++) {
				arr1[j]+=1;
			}
			for(int j =a+b; j < 2*m -1; j++) {
				arr1[j] +=2;
			}
		}
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
		for(int i =0;i<m;i++) {
			for(int j =0; j<m;j++) {
				if(j==0) {
					System.out.print(arr1[m - i -1] + " ");
				}
				else {
					System.out.print(arr1[m + j -1] + " ");
				}
			}
			System.out.println();
		}
	}
}
