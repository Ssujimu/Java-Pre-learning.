class StringEx3 {
	public static void main(String[] args) {
		String str1 = "test@abc.com";	String str2 = "testabc.com";
		String str3 = "test@abccom";	String str4 = "test.abc@com";

		isEmail(str1);	isEmail(str2);	isEmail(str3);	isEmail(str4);
	}
	public static void isEmail(String email) {
		/* 받아온 email을 검사하여 이메일 주소가 맞는지 출력
		1. 반드시 '@'가 있어야 함 : indexOf()
		2. 반드시 '.'가 있어야 함 : indexOf()
		3. 반드시 '@'가 '.' 보다 앞에 있어야 함 : indexOf()로 구한 위치값으로 비교
		*/
		
		int at = email.indexOf('@');	// email에서 '@'의 위치 인덱스
		int dot = email.indexOf('.');	// email에서 '.'의 위치 인덱스
		

		if (at == -1) {
			System.out.println(email + "은(는) '@'가 없으므로 이메일 주소가 아닙니다.");
		} else if (dot == -1){
			System.out.println(email + "은(는) '.'이 없으므로 이메일 주소가 아닙니다.");
		} else if (at > dot) {
			System.out.println(email + "은(는) '@'가 '.'보다 뒤에 있으므로 이메일 주소가 아닙니다.");
		}
	}
}
