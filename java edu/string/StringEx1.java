class StringEx1 {
	public static void main(String[] args) {
		String str1 = "test";	// "test" �ν��Ͻ� ����
		String str2 = "test";	// "test"�� �̹� �����Ƿ� ������ �ν��Ͻ��� ����
		String str3 = new String("test");	// new ������� ���ο� �ν��Ͻ��� ����
		String str4 = new String("test");	// new ������� ���ο� �ν��Ͻ��� ����

		if (str1 == str2)	System.out.println("���� �ν��Ͻ� ����");	// 0
		else				System.out.println("�ٸ� �ν��Ͻ� ����");
		if (str2 == str3)	System.out.println("���� �ν��Ͻ� ����");
		else				System.out.println("�ٸ� �ν��Ͻ� ����");	// 0
		if (str1 == str3)	System.out.println("���� �ν��Ͻ� ����");
		else				System.out.println("�ٸ� �ν��Ͻ� ����");	// 0
		if (str3 == str4)	System.out.println("���� �ν��Ͻ� ����");
		else				System.out.println("�ٸ� �ν��Ͻ� ����");	// 0

		// �ν��Ͻ��� '=='�� ���� ��� �ȿ� ����ִ� �����Ͱ� �ƴ� �����ϴ� �ּҷ� ���ϹǷ� ��Ȯ�� �񱳰� �����

		// �׷��Ƿ� ���ڿ� �ν��Ͻ��� �񱳴� compareTo()�� equals() �޼ҵ�� �ؾ� ��
		if (str1.compareTo(str2) == 0)	System.out.println("���� ���ڿ�");		// 0
		else							System.out.println("�ٸ� ���ڿ�");
		if (str2.compareTo(str3) == 0)	System.out.println("���� ���ڿ�");		// 0
		else							System.out.println("�ٸ� ���ڿ�");
		if (str1.compareTo(str3) == 0)	System.out.println("���� ���ڿ�");		// 0
		else							System.out.println("�ٸ� ���ڿ�");
		if (str2.compareTo(str4) == 0)	System.out.println("���� ���ڿ�");		// 0
		else							System.out.println("�ٸ� ���ڿ�");

		System.out.println();

		if (str1.equals(str2))	System.out.println("���� ���ڿ�");		// 0
		else					System.out.println("�ٸ� ���ڿ�");
		if (str2.equals(str3))	System.out.println("���� ���ڿ�");		// 0
		else					System.out.println("�ٸ� ���ڿ�");
		if (str1.equals(str3))	System.out.println("���� ���ڿ�");		// 0
		else					System.out.println("�ٸ� ���ڿ�");
		if (str2.equals(str4))	System.out.println("���� ���ڿ�");		// 0
		else					System.out.println("�ٸ� ���ڿ�");
	}
}
