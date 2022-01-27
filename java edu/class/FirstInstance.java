class NumberEx {
	int num = 0;
	public void addNum(int n) {
		num += n;
	}
	public int getNumber() {
		return num;
	}
}

class FirstInstance {
	public static void main(String[] args) {
		NumberEx nInst = new NumberEx();
		// NumberEx 형 인스턴스 nInst를 선언 및 생성
		System.out.println("메소드 호출 전 : " + nInst.getNumber());	// 0
		// nInst.getNumber() : nInst 인스턴스 안에 있는 getNumber() 메소드 호출

		nInst.addNum(10);
		// nInst.addNum(10) : nInst 인스턴스 안에 있는 addNum(10) 메소드를 10을 가지고 호출
		System.out.println("메소드 호출 후 : " + nInst.getNumber());	// 10

		numMethod1(nInst);	// 매개변수로 인스턴스(객체)를 가져갈 수 있음
		// 메소드에서 사용할 데이터로 인스턴스를 가져갈 경우 인스턴스의 주소값을 복사해서 가져감
		// 주소를 가져가기 때문에 그 주소에 해당하는 인스턴스의 내용을 편집하게 됨(원본이 변경됨)
		System.out.println("nInst.gerNumber : " + nInst.getNumber());	//22

		int test = 10;
		numMethod2(test);
		// 메소드에서 사용할 데이터로 변수(기본자료형)를 가져갈 경우 변수의 값만을 복사해서 가져감(원본은 변경 안됨)
		System.out.println("test : " + test);	// 10
	}
	public static void numMethod1(NumberEx num) {
		num.addNum(12);
	}
	public static void numMethod2(int num) {
		num += 12;
	}
}
