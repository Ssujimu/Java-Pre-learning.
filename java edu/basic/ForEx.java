class ForEx {
	public static void main(String[] args) {
		for (int i = 0 ; i < 3 ; i++ ) {
			System.out.println("I like Java" + i);
		}

		int n = 1;
		for (; n <= 5 ; n += 2 )	{
			System.out.println("n : " + n);
		}
		System.out.println("outer n : " + n);	// for�� �ۿ��� ������ �����̹Ƿ� ��밡�� n : 7

		int m;
		for (m = 1 ; m <= 5 ; m += 2 )	{
		// �ܺο��� ������ ������ ����� ��� for�� �ȿ��� ���� ���Ӱ� �־� ����� ���� ����
			System.out.println("m : " + m);
		}
		System.out.println("outer m : " + m);

		for (int i = 0, j = 10 ; i < 5 ; i++, j--) {
		// ��ǥ�� �����Ͽ� ���� ���� ������ ����� ���� ����
			System.out.println("i : " + i + ", j : " + j);
		}
	}
}
