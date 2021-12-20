package ex20210701;

public class 사다리타기 {
	static int k = 10;
	static int n = 5;
	static String[] str = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
	static String[] str1 = { "A", "C", "G", "B", "E", "D", "J", "F", "I", "H" };
	static String[][] arr = { { "*", "-", "*", "*", "*", "-", "*", "*", "*" },
			{ "-", "*", "-", "*", "*", "*", "*", "*", "*" }, 
			{ "?", "?", "?", "?", "?", "?", "?", "?", "?" },
			{ "-", "*", "*", "-", "*", "*", "*", "-", "*" }, 
			{ "*", "*", "-", "*", "-", "*", "-", "*", "-" }, };
	
//	static int k = 11;
//	static int n = 5;
//	static String[] str = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K" };
//	static String[] str1 = { "C", "G", "B", "E", "D", "J", "F", "K", "I", "H","A" };
//	static String[][] arr = { { "*", "-", "*", "*", "*", "-", "*", "*", "*", "*" },
//			{ "-", "*", "-", "*", "*", "*", "*", "*", "*", "-" }, 
//			{ "?", "?", "?", "?", "?", "?", "?", "?", "?", "?" },
//			{ "-", "*", "*", "-", "*", "*", "*", "-", "*", "-" }, 
//			{ "*", "*", "-", "*", "-", "*", "-", "*", "-", "*" }, };
	static String[] result;
	static int line;

	public static void main(String[] args) {
		result = new String[k-1];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k - 1; j++) {
				if (arr[i][j] == "?") {
					line = i;
				}
			}
		}
//		System.out.println(line);
		// 위에서부터 '?'전까지 문자 순서 바꾸기
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < k - 1; j++) {
				if (arr[i][j] == "-") {
					String tmp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = tmp;
				}
			}
		}
		// 아래에서부터 '?'전까지 문자 순서 바꾸기
		for (int i = n - 1; i > line; i--) {
			for (int j = 0; j < k - 1; j++) {
				if (arr[i][j] == "-") {
					String tmp = str1[j];
					str1[j] = str1[j + 1];
					str1[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < k - 1; i++) {
			// 위에 문자  == 아래 문자 : *
			if (str[i] == str1[i]) {
				result[i] = "*";
			}
			// D E, E D 처럼 교차 : -
			else if (str[i] == str1[i + 1] && str[i + 1] == str1[i]) {
				result[i] = "-";
				String tmp = str[i];
				str[i] = str[i + 1];
				str[i + 1] = tmp;
			}
		}
        
		// 결과 출력
		if (result[0]!=null) {
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
		} else {
			for (int i = 0; i < result.length; i++) {
				System.out.print("x");
			}
		}
	}
}
