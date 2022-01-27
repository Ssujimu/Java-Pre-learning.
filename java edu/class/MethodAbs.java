class MethodAbs {
	public static void main(String[] args) {
		// 두 개의 정수를 전달받아 두 수의 차를 절대값으로 출력해주는 메소드 작성
		printAbs(10, 5);	// 10과 5의 차는 5
		printAbs(10, 25);	// 10과 25의 차는 15
	}
	public static void printAbs(int A, int B){
		// 강사님은 n1, n2로 선언
		int def = 0;	// 두 수의 차를 저장할 변수

		if (A > B) {
			System.out.println(A + "과 " + B + "의 차는 " + (A-B));
		} else {
			System.out.println(A + "과 " + B + "의 차는 " + (B-A));
		}
		if (A > B)		def = A - B;
		else			def = B - A;

		def = A - B;
		if(def < 0)		def = B - A;

		def = A - B;
		if(def < 0)		def *= -1;

		def = A > B ? A - B : B - A;

		System.out.println("두 번째 방법 : " + A + "과 " + B + "의 차는 " + def);
	}
}
