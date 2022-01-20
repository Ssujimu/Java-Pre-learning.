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
		// 주민등록번호를 이용하여 생년월일을 출력하는 메소드 (앞의 6자리를 이용하여 "yyyy년 mm월 dd일 생"으로 출력)

		int i = 6;	// 성별 구분자의 위치를 저장할 변수
		if (str.indexOf('-') >= 0) {
			 i = 7;	//str에 하이픈(-)이 있으면 성별 구분자의 인덱스는 7
		}
		/*if (str.length() == 14) {
			i = 7;	//str의 글자 개수가 13이면 성별 구분자의 인덱스는 7
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


		System.out.println(year + "년 " + month + "월 " + day + "일 생");
	}
	public static void showGender(String str) {
		// 주민등록번호를 이용하여 성별을 출력하는 메소드 (성별구분자를 이용하여 "남자" 또는 "여자"로 출력)

		int i = 6;	// 성별 구분자의 위치를 저장할 변수
		if (str.indexOf('-') >= 0) {
			 i = 7;	//str에 하이픈(-)이 있으면 성별 구분자의 인덱스는 7
		}
		char g = str.charAt(i);

		if (g == '1' || g == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}
}
