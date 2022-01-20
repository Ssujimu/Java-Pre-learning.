class ArrayEx1 {
	public static void main(String[] args) {
		int[] arrInt = new int[3];	// int형 데이터 3개를 저장할 수 있는 배열 arrInt 생성
		arrInt[0] = 10;	// arrInt배열의 0번 인덱스 칸에 10을 저장
		arrInt[1] = 20;
		arrInt[2] = 30;
		int sum = arrInt[0] + arrInt[1] + arrInt[2];
		System.out.println("sum : " + sum);

		String[] arrStr = new String[3];	// String 인스턴스 3개를 저장할 배열
		arrStr[0] = "Java";
		arrStr[1] = "JSP";
		arrStr[2] = "Servlet";
		for (int i = 0 ; i < arrStr.length ; i++) {
			// length : 메소드가 아닌 배열이 가지는 속성(field : 멤버 변수와 상수)으로 배열의 길이
			System.out.println(arrStr[i]);
		}

		// arrStr 배열에 있는 문자열들을 첫글자만 출력
		for (int i = 0 ; i < arrStr.length ; i++) {
			System.out.println(arrStr[i].charAt(0));
		}

		String str = "ab-cde-fhg-123-456";
		String[] arr = str.split("-");
		// str의 값을 하이픈을 기준으로 하여 잘라서 String배열로 생성
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
