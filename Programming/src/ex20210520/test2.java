package ex20210520;

import java.util.Arrays;

public class test2 {
	public static int t[] = { 1, 2, 6, 7, 11, 12, 13, 15, 17, 20, 23 };
	public static int t1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public static int[] result = new int[3];
	public static void main(String[] args) {

		for (int i = 1; i <= t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				int a = t[j];
				result[0] = a;
				//System.out.println(result[0]);
				if(contains(t,a+i)) {
					a = a+i;
					result[1] = a;
					//System.out.println(result[1]);
					if(contains(t,a+i)) {
						a = a+i;
				        result[2] = a;
				        //System.out.println(result[2]);
				        for(int k =0; k<result.length; k++) {
				        	System.out.print(result[k] + " ");
				        }
				        System.out.println();
				    }
					
					else {
						result[0] = 0;
						result[1] = 0;
						result[2] = 0;
					}
			    } else {
			    	result[0] = 0;
					result[1] = 0;
					result[2] = 0;
			    }
			}

		}
	}

	public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
