class MethodPrimeNumber {
	public static void main(String[] args) {
		/*
		1~100 ������ ������ �� �Ҽ��� ���Ͽ� ���.
		��, ���޵� ���� �Ҽ����� ���θ� �Ǵ��� �ִ� �޼ҵ带 �����Ͽ� �۾�
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
		// �޾ƿ� �Ű����� n�� ���� �Ҽ����� ���θ� �����ϴ� �޼ҵ�
		if (n == 1 || (n != 2 && n % 2 == 0))	{
			// 1�̰ų� 2�� �ƴϸ鼭 ¦���� ���� �Ҽ��� �ƴ�
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
