class NumberEx {
	int num = 0;
	public void addNum(int n) {
		num += n;
	}
	public int getNumber() {
		return num;
	}
}

class FirstInstance {
	public static void main(String[] args) {
		NumberEx nInst = new NumberEx();
		// NumberEx �� �ν��Ͻ� nInst�� ���� �� ����
		System.out.println("�޼ҵ� ȣ�� �� : " + nInst.getNumber());	// 0
		// nInst.getNumber() : nInst �ν��Ͻ� �ȿ� �ִ� getNumber() �޼ҵ� ȣ��

		nInst.addNum(10);
		// nInst.addNum(10) : nInst �ν��Ͻ� �ȿ� �ִ� addNum(10) �޼ҵ带 10�� ������ ȣ��
		System.out.println("�޼ҵ� ȣ�� �� : " + nInst.getNumber());	// 10

		numMethod1(nInst);	// �Ű������� �ν��Ͻ�(��ü)�� ������ �� ����
		// �޼ҵ忡�� ����� �����ͷ� �ν��Ͻ��� ������ ��� �ν��Ͻ��� �ּҰ��� �����ؼ� ������
		// �ּҸ� �������� ������ �� �ּҿ� �ش��ϴ� �ν��Ͻ��� ������ �����ϰ� ��(������ �����)
		System.out.println("nInst.gerNumber : " + nInst.getNumber());	//22

		int test = 10;
		numMethod2(test);
		// �޼ҵ忡�� ����� �����ͷ� ����(�⺻�ڷ���)�� ������ ��� ������ ������ �����ؼ� ������(������ ���� �ȵ�)
		System.out.println("test : " + test);	// 10
	}
	public static void numMethod1(NumberEx num) {
		num.addNum(12);
	}
	public static void numMethod2(int num) {
		num += 12;
	}
}
