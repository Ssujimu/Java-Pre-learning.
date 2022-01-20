class DupLoop2 {
	public static void main(String[] args) {
		/* ������ �� 5�� ���
		5 X 1 = 5
		5 X 2 = 10
		...
		5 X 9 = 45
		*/
		for (int i = 1 ; i < 10 ; i++) {
			System.out.println("5 X " + i + " = " + (5 * i));
		}

		/* 2~4�� ���
		2��
		2 X 1 = 2
		...
		2 X 9 = 18

		3��
		3 X 1 = 3
		...
		3 X 9 = 27

		4��
		4 X 1 = 4
		...
		4 X 9 = 36
		*/

		for (int i = 2 ; i < 5 ; i ++) {
			System.out.println(i + "��");
			for (int j = 1 ; j < 10 ; j ++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
