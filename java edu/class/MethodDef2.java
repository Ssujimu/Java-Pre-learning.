class MethodDef2 {
	public static void main(String[] args) {
		double height = 175.3;
		testMethod1(33, height);
		testMethod2(33, 66);
		testMethod3();
	}
	public static void testMethod1(int age, double height){
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("�� Ű�� " + height + "cm �Դϴ�.");
	}
	public static void testMethod2(int age, int weight){
		// �޼ҵ��� �Ű������� ������ �ڷ����̶� ���� ���� ��������� ��
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("�� �����Դ� " + weight + "kg �Դϴ�.");
	}
	public static void testMethod3(){
		System.out.println("�߰�~~~~~");
	}
}
