package ex20210506;


public class ex������ {
	public static int[][] arr = { { 5, 0, 0, 3, 0, 2, 2, 0, 3, 0, 0, 5, 4, 0, 1, 1, 0, 4 },
			{ 4, 1, 0, 3, 0, 2, 4, 1, 0, 1, 1, 3, 0, 0, 5, 1, 1, 3 },
			{ 5, 0, 0, 4, 0, 1, 2, 2, 1, 2, 0, 3, 1, 0, 4, 0, 0, 5 },
			{ 5, 0, 0, 3, 1, 1, 2, 1, 2, 2, 0, 3, 0, 0, 5, 1, 0, 4 } };
	static boolean use[] = new boolean[4];
	static int score[][] = new int[10][10];

	public static void main(String[] args) {
		bf(1,2);
		for (int i = 0; i < 4; i++) {
	        if (use[i]) {
	            System.out.print("1 ");
	        }
	        else {
	        	System.out.print("0 ");
	        }
	    }

	}

	public static void bf(int now, int opponent) {
		if (now >= 6) {
			// ������ ������� �˻�
			for (int i = 0; i < 4; i++) {
				boolean chk = true;
				int a = 1, b = 1;
				for (int j = 0; j < 18; j++) {
					if (!use[i]) {
						if (arr[i][j] != score[a][b]) {
							chk = false;
							break;
						}

						if ((j + 1) % 3 == 0) {
							++a;
						}

						if (++b == 4) {
							b = 1;
						}
					} else {
						chk = false;
						break;
					}
				}

				if (chk) {
					use[i] = true;
				}
			}

			return;
		}
		if (opponent == 7) {
	        bf(now + 1, now + 2);
	        return;
	    }

	    ++score[now][1]; // �� �¸� ����
	    ++score[opponent][3]; // �� �й� ����
	    bf(now, opponent + 1);
	    --score[now][1]; // �� �¸� �������
	    --score[opponent][3]; // �� �й� �������

	    ++score[now][2]; // �� ���º� ����
	    ++score[opponent][2]; // �� ���º� ����
	    bf(now, opponent + 1);
	    --score[now][2]; // �� ���º� �������
	    --score[opponent][2]; // �� ���º� �������

	    ++score[now][3]; // �� ���� ����
	    ++score[opponent][1]; // �� �¸� ����
	    bf(now, opponent + 1);
	    --score[now][3]; // �� ���� �������
	    --score[opponent][1]; // �� �¸� �������
	}
}