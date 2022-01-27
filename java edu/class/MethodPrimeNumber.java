class MethodPrimeNumber {
	public static void main(String[] args) {
		/*
		1~100 사이의 정수들 중 소수를 구하여 출력.
		단, 전달된 값이 소수인지 여부를 판단해 주는 메소드를 제작하여 작업
		2 3 5 7 11 ...
		*/

		for (int i = 1, j = 0 ; i <= 100 ; i++) {
			if (isPrime(i)) {
				System.out.print((i < 10 ? " " : "") + i + "  ");
				j++;
				if (j % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		// 받아온 매개변수 n의 값이 소수인지 여부를 리턴하는 메소드
		if (n == 1 || (n != 2 && n % 2 == 0))	{
			// 1이거나 2가 아니면서 짝수인 값을 소수가 아님
			return false;
		}
		for (int i = 2 ; i <= n / 2 ; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
