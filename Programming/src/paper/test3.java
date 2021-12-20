package paper;

public class test3 {
	public static void main(String[] args) {
		int n = 10;
		int n1 = 12;
		int[][] arr = new int[n1][n];

		int vertex = 14;
		int[][] direction = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		int vertex_xarr[] = { 9, 5, 5, 10, 10, 1, 1, 0, 0, 5, 5, 7, 7, 9 };
		int vertex_yarr[] = { 6, 6, 8, 8, 10, 10, 4, 4, 2, 2, 0, 0, 3, 3 };
		int vertex_xarr1[] = { 0, 0, 10, 10 };
		int vertex_yarr1[] = { 0, 12, 0, 12 };
		int[] lenarr = new int[vertex];
		int[] lenarr1 = new int[vertex];
		int[] lenarr2 = new int[vertex];
		int cnt = 0;
		int p = 0;
		int k = 0;
		int k1 = 0;
		int vertex_x[] = new int[14];
		int vertex_y[] = new int[14];
		int len1 = 0;
		int len2 = 0;
		int sum =0;
		int sum1 =0;
		int sum2 =0;
		for (int i = 0; i < vertex; i++) {
			if (vertex_xarr[i] == 0 || vertex_yarr[i] == 0 || vertex_xarr[i] == n || vertex_yarr[i] == n1) {
				cnt++;
				vertex_x[i] = vertex_xarr[i];
				vertex_y[i] = vertex_yarr[i];
			}
			if(cnt==0) {
				if (vertex_xarr[i] == vertex_xarr[i + 1]) { 
					int len = vertex_yarr[i + 1] - vertex_yarr[i];
					sum2 += Math.abs(len); 
					//System.out.println(Math.abs(len)); 
				} else if(vertex_yarr[i + 1] == vertex_yarr[i]) {
					int len = vertex_xarr[i + 1] - vertex_xarr[i];
					sum2 += Math.abs(len);  
			//		System.out.println(Math.abs(len)); 
				}
			}
			if(cnt==1) {
				if (vertex_xarr[i] == n) {
					if (vertex_yarr[i] == vertex_y[i] && vertex_xarr[i] == vertex_x[i]) {
						for (int j = 0; j < vertex_xarr1.length; j++) {
							if (vertex_x[i] == vertex_xarr1[j] && vertex_yarr1[j] < vertex_y[i]) {
								len2 = vertex_y[i] - vertex_yarr1[j];
								sum2 += Math.abs(len2);
							//	System.out.println(Math.abs(len2));
							}
						}
					}
				}
			}
			if (cnt == 2) {
				if (vertex_xarr[i] == vertex_xarr[i + 1]) { 
					int len = vertex_yarr[i + 1] - vertex_yarr[i];
					sum += Math.abs(len); 
				//	System.out.println(Math.abs(len)); 
				} else if(vertex_yarr[i + 1] == vertex_yarr[i]) {
					int len = vertex_xarr[i + 1] - vertex_xarr[i];
					sum += Math.abs(len);  
				//	System.out.println(Math.abs(len)); 
				}
				if (vertex_xarr[i] == n) {
					if (vertex_yarr[i] == vertex_y[i] && vertex_xarr[i] == vertex_x[i]) {
						for (int j = 0; j < vertex_xarr1.length; j++) {
							if (vertex_x[i] == vertex_xarr1[j] && vertex_yarr1[j] > vertex_y[i]) {
								len2 = vertex_y[i] - vertex_yarr1[j];
								sum += Math.abs(len2);
							//	System.out.println(Math.abs(len2));
							}
						}
					}
				}
				else if (vertex_yarr[i] != n1 ) {
					for (int j = 0; j < vertex_xarr1.length; j++) {
						if (vertex_y[i] != vertex_yarr1[j]) {
							len2 = n;
						}
					}
					//sum += len2;
				}
			}
			if(cnt==3) {
				if (vertex_xarr[i] == 0) {
					if (vertex_yarr[i] == vertex_y[i] && vertex_xarr[i] == vertex_x[i]) {
						for (int j = 0; j < vertex_xarr1.length; j++) {
							if (vertex_x[i] == vertex_xarr1[j] && vertex_yarr1[j] > vertex_y[i]) {
								len2 = vertex_y[i] - vertex_yarr1[j];
								sum += Math.abs(len2);
							//	System.out.println(Math.abs(len2));
							}
						}
					}
				} 
			}
			if(cnt==4) {
				if (vertex_xarr[i] == vertex_xarr[i + 1]) { 
					int len = vertex_yarr[i + 1] - vertex_yarr[i];
					sum1 += Math.abs(len); 
				//	System.out.println(Math.abs(len)); 
				} else if(vertex_yarr[i + 1] == vertex_yarr[i]) {
					int len = vertex_xarr[i + 1] - vertex_xarr[i];
					sum1 += Math.abs(len);  
				//	System.out.println(Math.abs(len)); 
				}
				if (vertex_xarr[i] == 0) {
					if (vertex_yarr[i] == vertex_y[i] && vertex_xarr[i] == vertex_x[i]) {
						for (int j = 0; j < vertex_xarr1.length; j++) {
							if (vertex_x[i] == vertex_xarr1[j] && vertex_yarr1[j] < vertex_y[i]) {
								len2 = vertex_y[i] - vertex_yarr1[j];
								sum1 += Math.abs(len2);
						//		System.out.println(Math.abs(len2));
							}
						}
					}
					
				}  
			}
			if(cnt==5) {
				if (vertex_yarr[i] == 0) {
					if (vertex_yarr[i] == vertex_y[i] && vertex_xarr[i] == vertex_x[i]) {
						for (int j = 0; j < vertex_xarr1.length; j++) {
							if (vertex_y[i] == vertex_yarr1[j] && vertex_xarr1[j] < vertex_x[i]) {
								len2 = vertex_x[i] - vertex_xarr1[j];
								sum1 += Math.abs(len2);
						//		System.out.println(Math.abs(len2));
							}
						}
					}
				}
			}
			if(cnt==6) {
				if (vertex_yarr[i] == 0) {
					if (vertex_yarr[i] == vertex_y[i] && vertex_xarr[i] == vertex_x[i]) {
						for (int j = 0; j < vertex_xarr1.length; j++) {
							if (vertex_y[i] == vertex_yarr1[j] && vertex_xarr1[j] > vertex_x[i]) {
								len2 = vertex_x[i] - vertex_xarr1[j];
								sum2 += Math.abs(len2);
							//	System.out.println(Math.abs(len2));
							}
						}
					}
				}
				if(i==13) {
					if (vertex_xarr[i] == vertex_xarr[0]) { 
						int len = vertex_yarr[i] - vertex_yarr[0];
						sum2 += Math.abs(len); 
					//	System.out.println(Math.abs(len)); 
					} else if(vertex_yarr[i] == vertex_yarr[0]) {
						int len = vertex_xarr[i] - vertex_xarr[0];
						sum2 += Math.abs(len);  
					//	System.out.println(Math.abs(len)); 
					}
				}
				else if (vertex_xarr[i] == vertex_xarr[i + 1]) { 
					int len = vertex_yarr[i + 1] - vertex_yarr[i];
					sum2 += Math.abs(len); 
				//	System.out.println(Math.abs(len)); 
				} else if(vertex_yarr[i + 1] == vertex_yarr[i]) {
					int len = vertex_xarr[i + 1] - vertex_xarr[i];
					sum2 += Math.abs(len);  
					//System.out.println(Math.abs(len)); 
				}
			}
		}
		System.out.println("1:" + sum); 
		System.out.println("2:" + sum1); 
		System.out.println("3:" + sum2); 
	}
}
