class WhileDoEx {
	public static void main(String[] args) {
		int num = 0;
		while (num < 3)	{
			System.out.println("I like Java" + num);
			num++;
		}
		

		num = 1;
		// num의 값이 1, 3, 5, 7, 9로 출력되게 작업
		while (num < 10) {
			System.out.println("I like Java " + num);
			num += 2;
		}
		System.out.println("num : " + num);	// num : 11
		System.out.println("-----------------------------");
		
		do {
			System.out.println("I like Java " + num);
			num += 2;
		}
		while (num < 10);
		// 무조건 한 번은 실행시킨 후 조건을 검사하게 됨
		System.out.println("num : " + num);	// num : 13
	}
}
