class MethodAbs {
	public static void main(String[] args) {
		// �� ���� ������ ���޹޾� �� ���� ���� ���밪���� ������ִ� �޼ҵ� �ۼ�
		printAbs(10, 5);	// 10�� 5�� ���� 5
		printAbs(10, 25);	// 10�� 25�� ���� 15
	}
	public static void printAbs(int A, int B){
		// ������� n1, n2�� ����
		int def = 0;	// �� ���� ���� ������ ����

		if (A > B) {
			System.out.println(A + "�� " + B + "�� ���� " + (A-B));
		} else {
			System.out.println(A + "�� " + B + "�� ���� " + (B-A));
		}
		if (A > B)		def = A - B;
		else			def = B - A;

		def = A - B;
		if(def < 0)		def = B - A;

		def = A - B;
		if(def < 0)		def *= -1;

		def = A > B ? A - B : B - A;

		System.out.println("�� ��° ��� : " + A + "�� " + B + "�� ���� " + def);
	}
}
