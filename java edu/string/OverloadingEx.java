class StudentInfo {
// �л� ������ ������ Ŭ����(�ϳ��� �ν��Ͻ��� �� ���� �л��� �ǹ�)
	private int stID, korean, math, art;
	public StudentInfo(int stID, int korean, int math, int art) {
		this.stID = stID;	this.korean = korean;	this.math = math;	this.art = art;
		// ��������� �Ű������� �̸��� ������ this�� �̿��Ͽ� ��������� ������ ��
		// this. : "���� �����ǰ� �ִ� �ν��Ͻ��� ~"�� �ǹ��ϴ� ���
	}
	public StudentInfo(int stID, int korean, int math) {
		// �Ű������� ������ �ٸ��� �Ͽ� �����ڸ� �����ε���
		this(stID, korean, math, -1);
		// �Ű��������� �μ��� �Ͽ� �ٸ� �����ڸ� ȣ��
		// this() : �ٸ� ������ ȣ�� - �����ڿ����� ȣ���� ����
	}
	public void showInfo() {
		System.out.println("�й� : " + stID);
		System.out.println("���� : " + korean);
		System.out.println("���� : " + math);
		if (art == -1) {
			System.out.println("�̼� ������ ���� �ʴ� �л�");
		} else {
			System.out.println("�̼� : " + art);
		}
		System.out.println("-----------------------------------");
	}
}

class OverloadingEx {
	public static void main(String[] args) {
		StudentInfo st1 = new StudentInfo(1234, 98, 95, 88);	// �̼� ������ ��� �л� �ν��Ͻ� ����
		st1.showInfo();

		StudentInfo st2 = new StudentInfo(1235, 95, 85);	// �̼� ������ ���� �ʴ� �л� �ν��Ͻ� ����
		st2.showInfo();
	}
}
