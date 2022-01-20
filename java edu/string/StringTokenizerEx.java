import java.util.*;

class StringTokenizerEx {
	public static void main(String[] args) {
		String str1 = "11 22 33 44";

		String[] arr = str1.split(" ");
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}

		StringTokenizer st1 = new StringTokenizer(str1);
		// str1의 문자열을 공백을 기준으로 조각내어 StringTokenizer 인스턴스를 생성
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		String str2 = "1+2-3*4/5";
		StringTokenizer st2 = new StringTokenizer(str2, "+-*/");
		// 구분자로 여러 글자를 입력하면 각 글자별로 구분자 취급
		while (st2.hasMoreTokens()) {
			System.out.print(st2.nextToken() + " ");	// 1 2 3 4 5
		}
		System.out.println();
		StringTokenizer st3 = new StringTokenizer(str2, "+-*/", true);
		// true : 구분자도 토큰으로 취급하여 포함
		while (st3.hasMoreTokens()) {
			System.out.print(st3.nextToken() + " ");	// 1 + 2 - 3 * 4 / 5
		}
	}
}
