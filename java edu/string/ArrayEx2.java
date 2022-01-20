class ArrayEx2 {
	public static void main(String[] args) {
		int[] arrInt = {2, 4, 6, 8};


		// arrInt배열의 데이터들을 역순으로 출력
		for (int i = 0 ; i < arrInt.length ; i++) {
			System.out.println(arrInt[arrInt.length - i - 1] + "  ");
		}

		System.out.println();

		for (int i = arrInt.length - 1 ; i >= 0 ; i--) {
			System.out.println(arrInt[i] + "  ");
		}
	}
}
