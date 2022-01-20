class ForEx {
	public static void main(String[] args) {
		for (int i = 0 ; i < 3 ; i++ ) {
			System.out.println("I like Java" + i);
		}

		int n = 1;
		for (; n <= 5 ; n += 2 )	{
			System.out.println("n : " + n);
		}
		System.out.println("outer n : " + n);	// for문 밖에서 선언한 변수이므로 사용가능 n : 7

		int m;
		for (m = 1 ; m <= 5 ; m += 2 )	{
		// 외부에서 선언한 변수를 사용할 경우 for문 안에서 값을 새롭게 넣어 사용할 수도 있음
			System.out.println("m : " + m);
		}
		System.out.println("outer m : " + m);

		for (int i = 0, j = 10 ; i < 5 ; i++, j--) {
		// 쉼표로 구분하여 여러 개의 변수를 사용할 수도 있음
			System.out.println("i : " + i + ", j : " + j);
		}
	}
}
