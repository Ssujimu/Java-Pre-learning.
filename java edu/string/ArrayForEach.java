class ArrayForEach {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("�迭 ��ҵ��� ��(for) : " + sum);
		sum = 0;
		for (int e : arr) {
			sum += e;
		}	// arr �迭�� ��ҵ��� ���ʴ�� �ϳ��� ���� e�� ��� ������ ��
			// �迭�� ó�� ���� ������ ������ ����(������ ��ȯ�̳� ���� Ƚ���� ������ �Ұ���)
		System.out.println("�迭 ��ҵ��� ��(for-each) : " + sum);

		for (int e : arr) {
			e += 1;	// arr �迭�� ���� e�� ��� 1����(������ ���� ������ ����)
			System.out.print(e + "  ");	// 2 3 4 5 6
		}
		System.out.println();

		for (int e : arr) {
			System.out.print(e + "  ");	// 1 2 3 4 5
		}
		System.out.println();

		for (int i = 0 ; i < arr.length; i++) {
			arr[i] += 1;	// arr �迭�� ���� i�ε����� �ش��ϴ� ���� 1����(���� ����) 
			System.out.print(arr[i] + "  ");	// 2 3 4 5 6
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");	// 2 3 4 5 6
		}
		System.out.println();
	}
}
