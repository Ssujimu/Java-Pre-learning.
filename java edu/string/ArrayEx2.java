class ArrayEx2 {
	public static void main(String[] args) {
		int[] arrInt = {2, 4, 6, 8};


		// arrInt�迭�� �����͵��� �������� ���
		for (int i = 0 ; i < arrInt.length ; i++) {
			System.out.println(arrInt[arrInt.length - i - 1] + "  ");
		}

		System.out.println();

		for (int i = arrInt.length - 1 ; i >= 0 ; i--) {
			System.out.println(arrInt[i] + "  ");
		}
	}
}
