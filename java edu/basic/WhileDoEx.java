class WhileDoEx {
	public static void main(String[] args) {
		int num = 0;
		while (num < 3)	{
			System.out.println("I like Java" + num);
			num++;
		}
		

		num = 1;
		// num�� ���� 1, 3, 5, 7, 9�� ��µǰ� �۾�
		while (num < 10) {
			System.out.println("I like Java " + num);
			num += 2;
		}
		System.out.println("num : " + num);	// num : 11
		System.out.println("-----------------------------");
		
		do {
			System.out.println("I like Java " + num);
			num += 2;
		}
		while (num < 10);
		// ������ �� ���� �����Ų �� ������ �˻��ϰ� ��
		System.out.println("num : " + num);	// num : 13
	}
}
