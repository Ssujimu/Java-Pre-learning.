class BreakContinue {
	public static void main(String[] args) {
		// 100������ �ڿ��� �� 5�� 7�� �ּҰ������ ���Ͽ� ��� - while�� �̿�
		int num = 1;	// 1���� 100���� ������ ������ ����� ����
		while (num <= 100) {
			if (num % 5 == 0 && num % 7 == 0) {
				break;	// ���� �����ִ� �������� ��������
			}
			num++;
		}
		System.out.println("5�� 7�� �ּҰ���� : " + num);

		// 100������ �ڿ��� �� 5�� 7�� ������� �� ������ ���Ͽ� ��� - continue
		num = 0;		// 1���� 100���� ������ ������ ����� ����
		int count = 0;	// 5�� 7�� ����� ������ ������ ����
		while (num <= 100) {
			num++;

			if (!(num % 5 == 0 && num % 7 == 0)) { // 5�� 7�� ������� �ƴϸ�
				continue;	// �Ʒ��ʿ� �ִ� ���๮���� �����ϰ� �������� �ٷ� �ö�
			}

			count++;
			System.out.println("5�� 7�� ����� : " + num);
		}
		System.out.println("5�� 7�� ����� ���� : " + count);
	}
}
