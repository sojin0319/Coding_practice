package ex20210715;

import java.util.Arrays;
import java.util.Scanner;

public class Àú¿ï {
	static int sum = 1;
	static int[] weight;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		weight = new int[n];

        for (int i=0; i<n; i++) {
            weight[i] = sc.nextInt();
        }
        Arrays.sort(weight);
        
        for (int i=0; i<n; i++) {
            if (sum  < weight[i]) {
                break;
            }

            sum += weight[i];
        }

        System.out.println(sum);
	}
}
