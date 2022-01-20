import java.util.*;

class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(i + 1 +"��° ���� : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("�ּҰ� : " + minValue(arr));
		System.out.println("�ִ밪 : " + maxValue(arr));
	}

	public static int minValue(int[] arr) {
		// �޾ƿ� �迭�� ������ �ּҰ��� ã�� �����ϴ� �޼ҵ�
		int min = arr[0];	// �ּҰ��� ������ ����
		for (int i = 1 ; i < arr.length ; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			
		}
		return min;
	}

	public static int maxValue(int[] arr) {
		// �޾ƿ� �迭�� ������ �ִ밪�� ã�� �����ϴ� �޼ҵ�
		int max = arr[0];	// �ִ밪�� ������ ����
		for (int i = 0 ; i < arr.length ; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		return max;
	}
}
