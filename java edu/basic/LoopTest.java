class LoopTest {
	public static void main(String[] args) {
		/* 2 ~ 5�ܱ��� ���
		2 X 1 = 2	3 X 1 = 3	...		5 X 1 = 5
		2 X 2 = 4	3 X 2 = 6	...		5 X 2 = 10
		...			...			...		...
		2 X 9 = 18	3 X 9 = 27	...		5 X 9 = 45
		*/
		// �� ����� �� �� �����θ� �����ϴ� 2 X 9�� �ϰ� �ٽ� ������ �Ѿ�� 3 X 1�� ����� �� ����.
		for (int i = 1 ; i < 10 ; i++) {
			for (int j = 2 ; j < 6 ; j++) {
				System.out.print(j + " X " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
