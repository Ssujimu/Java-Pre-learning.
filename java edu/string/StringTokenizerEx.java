import java.util.*;

class StringTokenizerEx {
	public static void main(String[] args) {
		String str1 = "11 22 33 44";

		String[] arr = str1.split(" ");
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}

		StringTokenizer st1 = new StringTokenizer(str1);
		// str1�� ���ڿ��� ������ �������� �������� StringTokenizer �ν��Ͻ��� ����
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		String str2 = "1+2-3*4/5";
		StringTokenizer st2 = new StringTokenizer(str2, "+-*/");
		// �����ڷ� ���� ���ڸ� �Է��ϸ� �� ���ں��� ������ ���
		while (st2.hasMoreTokens()) {
			System.out.print(st2.nextToken() + " ");	// 1 2 3 4 5
		}
		System.out.println();
		StringTokenizer st3 = new StringTokenizer(str2, "+-*/", true);
		// true : �����ڵ� ��ū���� ����Ͽ� ����
		while (st3.hasMoreTokens()) {
			System.out.print(st3.nextToken() + " ");	// 1 + 2 - 3 * 4 / 5
		}
	}
}
