class IfEx {
	public static void main(String[] args) {
		/*
		int num = 120;	// int�� ���� num�� �����ϰ� �� �ȿ� 120�� �ִ´�.
		if (num < 0) {
			System.out.println("0 �̸�");
		} else {
			System.out.println("0 �̻�");

			if (num < 100) {
				System.out.println("0 �̻� 100 �̸�");
			} else {
				System.out.println("100 �̻�");
			}
		}

		0�̻�
		100�̻�
		*/

		// num ������ ���� ����̸鼭(and) ¦�������� ����ϴ� if�� �ۼ�
		// ��°� : 120�� ����̸鼭 ¦��

		int num = 120;	// int�� ���� num�� �����ϰ� �� �ȿ� 120�� �ִ´�.
		if (num > 0 && num % 2 == 0) {
			System.out.println(num + "�� ����̸鼭 ¦��");
		} else {
			System.out.println(num + "�� �����̰ų� Ȧ���̰ų� 0");
		}

		char c1 = 'b';
		if (c1 == 'a') {
			System.out.println("���� 'a'");
		} else if (c1 == 'b') {
			System.out.println("���� 'b'");
		} else if (c1 == 'c') {
			System.out.println("���� 'c'");
		} else if (c1 == 'd') {
			System.out.println("���� 'd'");
		} else {
			System.out.println("��?��");
		}

		// score�� ������ 70�̻��̸� 'C', 80�̻��̸� 'B', 90�̻��̸� 'A', 60�̻��̸� 'D', 60�̸��̸� 'F'
		int score = 77;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70)	{
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		// �̻��̳� �ʰ��� ��� ���� ���ں��� ������ �ְ�, ���ϳ� �̸��� ��� ���� ���ں��� ������ �Է��ؾ� ��
	}
}
