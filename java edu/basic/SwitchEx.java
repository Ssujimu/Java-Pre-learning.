class SwitchEx {
	public static void main(String[] args) {
		int num = 2;
		switch (num) {
		case 1:
			System.out.println("num�� ���� 1");	break;
		case 2:
			System.out.println("num�� ���� 2");	break;
		case 3:
			System.out.println("num�� ���� 3");	break;
		case 4:
			System.out.println("num�� ���� 4");	break;
		default:
			System.out.println("num�� ���� ��?��");
		}
		
		// num�� ���� 1, 2, 3 �̸� "��" 4, 5, 6 �̸� "��" 7, 8, 9 �̸� "��"��� ���

		switch (num) {
		case 1:	case 2: case 3:
		// num�� ���� 1�̰ų� 2�̰ų� 3�̸� (case�� ������ �����ϸ� or�������� ������)
			System.out.println("��");	break;
		case 4:	case 5:	case 6:
			System.out.println("��");	break;
		case 7:	case 8:	case 9:
			System.out.println("��");	break;
		}

		// jdk1.7 �̻���ʹ� ���ڿ��� ��밡��
		switch ("bb") {
		case "ab":
			System.out.println("ab");	break;
		case "bb":
			System.out.println("bb");	break;
		case "cb":
			System.out.println("cb");	break;
		default:
			System.out.println("��?��");	break;
		}

		// score�� ������ 70�̻��̸� 'C', 80�̻��̸� 'B', 90�̻��̸� 'A', 60�̻��̸� 'D', 60�̸��̸� 'F'
		int score = 87;
		switch (score / 10) {
		case 9: case 10:
			System.out.println("A");	break;
		case 8:
			System.out.println("B");	break;
		case 7:
			System.out.println("C");	break;
		case 6:
			System.out.println("D");	break;
		default:
			System.out.println("F");	break;

		
		}
	}
}
