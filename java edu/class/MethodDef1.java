class MethodDef1 {
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");

		testMethod(33);	// 33�̶�� ���� ������ testMethod()��� �޼ҵ带 ȣ��
		testMethod(23);

		System.out.println("���α׷��� ����");
	}

	public static void testMethod(int age) {
		System.out.println("�� ���̴� " + age + " �Դϴ�. ����");
	}
}
