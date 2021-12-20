package paper;

public class test5 {
	public static void main(String[] args) {
		int n = 10;
		int n1 = 12;
		int vertex = 14;
		int vertex_xarr[] = { 9, 5, 5, 10, 10, 1, 1, 0, 0, 5, 5, 7, 7, 9 };
		int vertex_yarr[] = { 6, 6, 8, 8, 10, 10, 4, 4, 2, 2, 0, 0, 3, 3 };
//		int n = 8;
//		int n1 = 7;
//		int vertex = 6;
//		int vertex_xarr[] = { 1, 1, 5, 5, 3, 3 };
//		int vertex_yarr[] = { 3, 2, 2, 5, 5, 3 };
		int vertex_xarr1[] = { 0, 0, 10, 10 };
		int vertex_yarr1[] = { 0, 12, 0, 12 };
		int cnt=0;
		int p = 1;
		int vertex_x[] = new int[14];
		int vertex_y[] = new int[14];
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int cnt1 = 0;
		for (int i = 0; i < vertex; i++) {
			if (vertex_xarr[i] == 0 || vertex_yarr[i] == 0 || vertex_xarr[i] == n || vertex_yarr[i] == n1) {
				cnt++;
				vertex_x[cnt1] = vertex_xarr[i];
				vertex_y[cnt1] = vertex_yarr[i];
				cnt1++;
				if (cnt == 3) {
					cnt = 1;
					p++;
				}
			}
			if(cnt==2) {
				for(int j =0; j<vertex_x.length; j++) {
					if(j==vertex-1) {
						if(vertex_x[j]>vertex_x[0]) {
							if(vertex_x[j]==0)
								sum+=n;
							else {
								int len = vertex_x[j]-vertex_x[0];
							//	sum += Math.abs(len);
								System.out.println(Math.abs(len)); 
							}
						}
					}
					else if(vertex_y[j]>vertex_y[j+1] && vertex_x[j]>vertex_x[j+1]) {
						if(vertex_x[j+1]==0)
							sum+=n;
					}
				}
			}
		}
		System.out.println("1:" + sum); 
		System.out.println("2:" + sum1); 
		System.out.println("3:" + sum2);
	}
}
