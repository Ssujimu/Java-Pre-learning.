class StringEx1 {
	public static void main(String[] args) {
		String str1 = "test";	// "test" 인스턴스 생성
		String str2 = "test";	// "test"가 이미 있으므로 기존의 인스턴스를 참조
		String str3 = new String("test");	// new 명령으로 새로운 인스턴스를 생성
		String str4 = new String("test");	// new 명령으로 새로운 인스턴스를 생성

		if (str1 == str2)	System.out.println("동일 인스턴스 참조");	// 0
		else				System.out.println("다른 인스턴스 참조");
		if (str2 == str3)	System.out.println("동일 인스턴스 참조");
		else				System.out.println("다른 인스턴스 참조");	// 0
		if (str1 == str3)	System.out.println("동일 인스턴스 참조");
		else				System.out.println("다른 인스턴스 참조");	// 0
		if (str3 == str4)	System.out.println("동일 인스턴스 참조");
		else				System.out.println("다른 인스턴스 참조");	// 0

		// 인스턴스는 '=='로 비교할 경우 안에 들어있는 데이터가 아닌 참조하는 주소로 비교하므로 정확한 비교가 어려움

		// 그러므로 문자열 인스턴스의 비교는 compareTo()나 equals() 메소드로 해야 함
		if (str1.compareTo(str2) == 0)	System.out.println("동일 문자열");		// 0
		else							System.out.println("다른 문자열");
		if (str2.compareTo(str3) == 0)	System.out.println("동일 문자열");		// 0
		else							System.out.println("다른 문자열");
		if (str1.compareTo(str3) == 0)	System.out.println("동일 문자열");		// 0
		else							System.out.println("다른 문자열");
		if (str2.compareTo(str4) == 0)	System.out.println("동일 문자열");		// 0
		else							System.out.println("다른 문자열");

		System.out.println();

		if (str1.equals(str2))	System.out.println("동일 문자열");		// 0
		else					System.out.println("다른 문자열");
		if (str2.equals(str3))	System.out.println("동일 문자열");		// 0
		else					System.out.println("다른 문자열");
		if (str1.equals(str3))	System.out.println("동일 문자열");		// 0
		else					System.out.println("다른 문자열");
		if (str2.equals(str4))	System.out.println("동일 문자열");		// 0
		else					System.out.println("다른 문자열");
	}
}
