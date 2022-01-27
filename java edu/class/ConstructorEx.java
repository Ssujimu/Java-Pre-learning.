class NumberEx1 {
	int num;
	public NumberEx1() {	// 생성자
		num = 10;
		System.out.println("생성자 호출!!");
	}
/*
	public NumberEx1() {}	// 디폴트 생성자로 생성자가 따로 없으면 JVM에서 자동으로 만들어 주는 생성자
*/
	public int getNumber() { return num; }
}

class NumberEx2 {
	int num;
	public NumberEx2(int n) {	// 생성자
		num = n;
		System.out.println("생성자 호출2!!");
	}
	public int getNumber() { return num; }
}



class ConstructorEx {
	public static void main(String[] args) {
		NumberEx1 num1 = new NumberEx1();
		// NumberEx1 형 인스턴스 num1을 선언 및 생성(NumberEx1 클래스의 생성자 호출)
		System.out.println("num1 : " + num1.getNumber());

		NumberEx2 num2 = new NumberEx2(17);
		System.out.println("num2 : " + num2.getNumber());

	}
}
