class DupLoop {
	public static void main(String[] args) {
		for (int i = 0 ; i < 3 ; i++ ) {
			System.out.println("���� i�� �� : " + i);
			for (int j =0 ; j < 3 ; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		// ���� for���� while������ ����
		int i = 0, j;
		while (i < 3) {
			System.out.println("���� i�� �� : " + i);
			j = 0;
			while (j < 3) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
