class InstCnt {
	static int clsNum = 0;	// Ŭ���� ������ �ν��Ͻ��� �����ϰ� �޸� �� ���� ����
	int insNum = 0;	// �ν��Ͻ� ������ �ν��Ͻ� ���� �⺣�� �� �ν��Ͻ� ���� �ϳ��� ����
	public InstCnt() {
		clsNum++;
		System.out.println("Ŭ���� ���� : " + clsNum);
		insNum++;
		System.out.println("�ν��Ͻ� ���� : " + insNum);
	}
}

class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		System.out.println("cnt1 : " + cnt1.clsNum + ", cnt2 : " + cnt2.clsNum + ", cnt3 : " + cnt3.clsNum);
	}
}
