class VariableEx {
	public static void main(String[] args) {
		int num1 = 10;	// int형 변수 num1을 선언 및 생성한 후 10을 저장
		int num2 = 20, num3 = num1 + num2;
		// 같은 자료형의 변수일 경우 두 개 이상을 동시에 선언 및 생성할 수 있음
		System.out.println("num1 : " + num1 + ", num2 : " + num2 +  ", num3 : " + num3);
		//num1 : 10, num2 : 20, num3 : 30

		char c1 = 'a';  // char형이므로 작은 따옴표로 묶어서 저장
		char c2 = 65;	// 정수는 char형 변수에 저장 가능하며, 저장할 경우 char형이므로 유니코드의 문자로 변환
		System.out.println("c1 : " + c1 + ", c2 : " + c2);
		//c1 : a, c2 : A

		long num4 = 10000000000L;	
		// 100억 int형은 21억까지만 저장가능 long으로 바꿔도 에러가 난다. 대신 숫자 뒤 L을 붙임.
		// 정수형 리터럴 값을 사용시 int의 범위를 벗어나는 경우 접미사로 엘(L)을 붙여서 lon형이라는 표시를 해줌
		// 접미사에 사용된 영문자 엘은 대소문자 구분이 없으나 보통 대문자를 사용함 (알아보기 쉽게 하기 위해)
		System.out.println("num4 : " + num4);
		/*VariableEx.java:14: error: integer number too large: 10000000000
          int num4 = 10000000000;
                     ^
		1 error*/

		double d1 = 3.14;
		float f1 = 3.14F;
		// 실수의 기본형이 double이므로 실수의 리터럴 값을 float에 넣으려면 접미사 에프(F)를 붙여야 함
		System.out.println("d1 : " + d1 + ", f1 : " + f1);	// d1 : 3.14, f1 : 3.14
		/*
		VariableEx.java:25: error: incompatible types: possible lossy conversion(형변환) from double to float
                float f1 = 3.14;
                           ^
		1 error*/

		final int NUM;	// 상수 NUM을 선언
		NUM = 100;		// 상수에 값을 초기화시킴
		System.out.println("NUM : " + NUM);

		// NUM = 20;	// 상수이므로 초기화된 값을 변경할 수 없음
	}
}
