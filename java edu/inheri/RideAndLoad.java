class Aa {
	public void testA() { System.out.println("Aa's test"); }
	public void rideMethod() { System.out.println("Aa's Method"); }
	public void loadMethod() { System.out.println("void Method"); }
}

class Bb extends Aa {
	public void testB() { System.out.println("Bb's test"); }
	public void rideMethod() { System.out.println("Bb's Method"); }				// �������̵�
	public void loadMethod(int n) { System.out.println("int Method"); }			// �����ε�
}

class Cc extends Bb {
	public void testC() { System.out.println("Cc's test"); }
	public void rideMethod() { System.out.println("Cc's Method"); }				// �������̵�
	public void loadMethod(double n) { System.out.println("double Method"); }	// �����ε�
}

class RideAndLoad {
	public static void main(String[] args) {
		Aa ref1 = new Cc();
		Bb ref2 = new Cc();
		Cc ref3 = new Cc();
		// ���� Ŭ������ ������ �� ����Ŭ������ �ν��Ͻ� ������ ����
		// JVM���� ���� �ν��Ͻ��� �ڷ����� ����Ŭ������ �ƴ� ������ ����Ŭ������ �ڷ������� �ν��Ͽ� ���� Ŭ������ �޼ҵ�鸸 ��밡��
		// ��, �������̵��� �޼ҵ忡 ���ؼ��� ����Ŭ������ �޼ҵ尡 �����

/*
		- �Ϲ� �޼ҵ��� ���
		ref1.testA(); : ���డ��(ref1�� JVM���� Aa�� �ν��Ͻ��� �ν��ϹǷ� AaŬ������ �޼ҵ� ȣ�Ⱑ��)
		ref1.testB();�� ref1.testC() : ����Ұ�(ref1�� JVM���� Aa�� �ν��Ͻ��� �ν��ϹǷ� AaŬ������ �޼ҵ常 ȣ�Ⱑ��)

		ref2.testB();
		ref2.testA();	// �� ���� ���� ����
		ref2.testC(); : ����Ұ�(ref2�� Bb������ �νĵǹǷ� BbŬ������ ���� Ŭ������ AaŬ������ �޼ҵ�鸸 ���డ��)


*/

		

		ref1.rideMethod();	// Cc's Method
		ref2.rideMethod();	// Cc's Method
		ref3.rideMethod();	// Cc's Method
		// ���� Ŭ������ ������ �� ���� Ŭ������ ������ �ν��Ͻ��δ� ����Ŭ������ �޼ҵ忡�� ������ �����ϳ�
		// �������̵��� �޼ҵ忡�� ���������� ������ Ŭ�������� �������̵��� �޼ҵ尡 �����

		ref1.loadMethod();	// void Method
		ref2.loadMethod(1);	// int Method
		ref3.loadMethod(3.14);	// double Method
		// ������ Ŭ������ �ν��Ͻ������� ����Ŭ�������� �����Ͽ� �̸��� ���� �����ε��� �޼ҵ���� ����� �� ����
	}
}
