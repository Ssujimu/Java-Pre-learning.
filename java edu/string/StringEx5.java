class StringEx5 {
	public static void main(String[] args) {
		String str1 = "880525-1234567";
		String str2 = "890515-2234567";
		String str3 = "0805153234567";
		String str4 = "0905154234567";

		showBirth(str1);	showBirth(str2);	showBirth(str3);	showBirth(str4);
		showGender(str1);	showGender(str2);	showGender(str3);	showGender(str4);
	}
	public static void showBirth(String str) {
		// �ֹε�Ϲ�ȣ�� �̿��Ͽ� ��������� ����ϴ� �޼ҵ� (���� 6�ڸ��� �̿��Ͽ� "yyyy�� mm�� dd�� ��"���� ���)

		int i = 6;	// ���� �������� ��ġ�� ������ ����
		if (str.indexOf('-') >= 0) {
			 i = 7;	//str�� ������(-)�� ������ ���� �������� �ε����� 7
		}
		/*if (str.length() == 14) {
			i = 7;	//str�� ���� ������ 13�̸� ���� �������� �ε����� 7
		}
		*/

		char g = str.charAt(i);
		String tmp = "19";
		if (g == '3' || g == '4') {
			tmp = "20";
		} else {
			tmp = "19";
		}

		String year = tmp + str.substring(0, 2);
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);


		System.out.println(year + "�� " + month + "�� " + day + "�� ��");
	}
	public static void showGender(String str) {
		// �ֹε�Ϲ�ȣ�� �̿��Ͽ� ������ ����ϴ� �޼ҵ� (���������ڸ� �̿��Ͽ� "����" �Ǵ� "����"�� ���)

		int i = 6;	// ���� �������� ��ġ�� ������ ����
		if (str.indexOf('-') >= 0) {
			 i = 7;	//str�� ������(-)�� ������ ���� �������� �ε����� 7
		}
		char g = str.charAt(i);

		if (g == '1' || g == '3') {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}
