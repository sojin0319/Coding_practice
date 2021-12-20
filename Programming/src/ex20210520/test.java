package ex20210520;

import java.util.Arrays;

public class test {
	public static int t[] = { 1, 2, 6, 7, 11, 12, 13, 15, 17, 20, 23 };
	public static int t1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	public static int[] result = new int[5];

	public static void main(String[] args) {

		for (int i = 1; i <= t.length; i++) {
			for (int j = 0; j < t.length; j++) {

				int a = t[j];
				int index = 0;
				result[index] = a;
				while (contains(t, a + i)) {
					index++;
					a = a + i;
					result[index] = a;
				}
			}
			for(int k =0; k<result.length; k++) {
	        	System.out.print(result[k] + " ");
	        }
	        System.out.println();

		}
	}

	public static boolean contains( int[] arr,  int key) {
		return Arrays.stream(arr).anyMatch(i -> i == key);
	}
}
