class StringEx3 {
	public static void main(String[] args) {
		String str1 = "test@abc.com";	String str2 = "testabc.com";
		String str3 = "test@abccom";	String str4 = "test.abc@com";

		isEmail(str1);	isEmail(str2);	isEmail(str3);	isEmail(str4);
	}
	public static void isEmail(String email) {
		/* �޾ƿ� email�� �˻��Ͽ� �̸��� �ּҰ� �´��� ���
		1. �ݵ�� '@'�� �־�� �� : indexOf()
		2. �ݵ�� '.'�� �־�� �� : indexOf()
		3. �ݵ�� '@'�� '.' ���� �տ� �־�� �� : indexOf()�� ���� ��ġ������ ��
		*/
		
		int at = email.indexOf('@');	// email���� '@'�� ��ġ �ε���
		int dot = email.indexOf('.');	// email���� '.'�� ��ġ �ε���
		

		if (at == -1) {
			System.out.println(email + "��(��) '@'�� �����Ƿ� �̸��� �ּҰ� �ƴմϴ�.");
		} else if (dot == -1){
			System.out.println(email + "��(��) '.'�� �����Ƿ� �̸��� �ּҰ� �ƴմϴ�.");
		} else if (at > dot) {
			System.out.println(email + "��(��) '@'�� '.'���� �ڿ� �����Ƿ� �̸��� �ּҰ� �ƴմϴ�.");
		}
	}
}
