class BreakLabel {
	public static void main(String[] args) {
		// i�� j�� ���� �� �� ¦���� ��� ����
		for (int i = 1 ; i < 4 ; i++) {
			for (int j = 1 ; j < 4 ; j++) {
				System.out.print("[" + i + ", " + j + "] ");		
				if (i % 2 == 0 && j % 2 == 0) { break;}
				// ��ø ���������� break�� ����ϸ� break�� ���� �ִ� ���������� ��������
			}
		}
		System.out.println("\n--------------------------------------");

		outerLoop:	// ��ɾ� �ƴϰ� �̸�?outerLoop�ƴ� abcd�� �����ؼ� ��밡��. �ݷи� for�� �տ� ���̸� �ȴ�.   �� Ư�� �������� ǥ�����ִ� ���̺�(label)
		for (int i = 1 ; i < 4 ; i++) {
			for (int j = 1 ; j < 4 ; j++) {
				System.out.print("[" + i + ", " + j + "] ");		
				if (i % 2 == 0 && j % 2 == 0) { break outerLoop;}
				// outerLoop��� ǥ���� ���� �������� ��������
			}
		}
	}
}
