class BreakLabel {
	public static void main(String[] args) {
		// i와 j의 값이 둘 다 짝수일 경우 멈춤
		for (int i = 1 ; i < 4 ; i++) {
			for (int j = 1 ; j < 4 ; j++) {
				System.out.print("[" + i + ", " + j + "] ");		
				if (i % 2 == 0 && j % 2 == 0) { break;}
				// 중첩 루프문에서 break를 사용하면 break가 속해 있는 루프문만을 빠져나옴
			}
		}
		System.out.println("\n--------------------------------------");

		outerLoop:	// 명령어 아니고 이름?outerLoop아닌 abcd로 정의해서 사용가능. 콜론만 for문 앞에 붙이면 된다.   ※ 특정 루프문을 표시해주는 레이블(label)
		for (int i = 1 ; i < 4 ; i++) {
			for (int j = 1 ; j < 4 ; j++) {
				System.out.print("[" + i + ", " + j + "] ");		
				if (i % 2 == 0 && j % 2 == 0) { break outerLoop;}
				// outerLoop라는 표식을 가진 루프문을 빠져나감
			}
		}
	}
}
