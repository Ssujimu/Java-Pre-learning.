class IfEx {
	public static void main(String[] args) {
		/*
		int num = 120;	// int형 변수 num을 선언하고 그 안에 120을 넣는다.
		if (num < 0) {
			System.out.println("0 미만");
		} else {
			System.out.println("0 이상");

			if (num < 100) {
				System.out.println("0 이상 100 미만");
			} else {
				System.out.println("100 이상");
			}
		}

		0이상
		100이상
		*/

		// num 변수의 값이 양수이면서(and) 짝수인지를 출력하는 if문 작성
		// 출력값 : 120은 양수이면서 짝수

		int num = 120;	// int형 변수 num을 선언하고 그 안에 120을 넣는다.
		if (num > 0 && num % 2 == 0) {
			System.out.println(num + "은 양수이면서 짝수");
		} else {
			System.out.println(num + "은 음수이거나 홀수이거나 0");
		}

		char c1 = 'b';
		if (c1 == 'a') {
			System.out.println("값은 'a'");
		} else if (c1 == 'b') {
			System.out.println("값은 'b'");
		} else if (c1 == 'c') {
			System.out.println("값은 'c'");
		} else if (c1 == 'd') {
			System.out.println("값은 'd'");
		} else {
			System.out.println("몰?루");
		}

		// score의 점수가 70이상이면 'C', 80이상이면 'B', 90이상이면 'A', 60이상이면 'D', 60미만이면 'F'
		int score = 77;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70)	{
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		// 이상이나 초과의 경우 높은 숫자부터 조건을 주고, 이하나 미만의 경우 낮은 숫자부터 조건을 입력해야 함
	}
}
