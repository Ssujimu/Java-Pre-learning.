import java.util.*;

class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(i + 1 +"번째 정수 : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("최소값 : " + minValue(arr));
		System.out.println("최대값 : " + maxValue(arr));
	}

	public static int minValue(int[] arr) {
		// 받아온 배열의 값들중 최소값을 찾아 리턴하는 메소드
		int min = arr[0];	// 최소값을 저장할 변수
		for (int i = 1 ; i < arr.length ; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			
		}
		return min;
	}

	public static int maxValue(int[] arr) {
		// 받아온 배열의 값들중 최대값을 찾아 리턴하는 메소드
		int max = arr[0];	// 최대값을 저장할 변수
		for (int i = 0 ; i < arr.length ; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		return max;
	}
}
