class LoopTest {
	public static void main(String[] args) {
		/* 2 ~ 5단까지 출력
		2 X 1 = 2	3 X 1 = 3	...		5 X 1 = 5
		2 X 2 = 4	3 X 2 = 6	...		5 X 2 = 10
		...			...			...		...
		2 X 9 = 18	3 X 9 = 27	...		5 X 9 = 45
		*/
		// ※ 출력은 한 줄 단위로만 가능하다 2 X 9를 하고 다시 옆으로 넘어가서 3 X 1을 출력할 순 없다.
		for (int i = 1 ; i < 10 ; i++) {
			for (int j = 2 ; j < 6 ; j++) {
				System.out.print(j + " X " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
