class MethodReturn3 {
	public static void main(String[] args) {
		char grade = calGrade(78);
		System.out.println("������ " + grade + "�����Դϴ�.");
	}

	public static char calGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80)	{
			return 'B';
		} else if (score >= 70)	{
			return 'C';
		} else if (score >= 60)	{
			return 'D';
		} else {
			return 'F';
		}
		// if�� �ȿ��� return �� ��� �ݵ�� else���� �ְų� if�� �ۿ��� return �ؾ���
	}
}
