class MethodDef2 {
	public static void main(String[] args) {
		double height = 175.3;
		testMethod1(33, height);
		testMethod2(33, 66);
		testMethod3();
	}
	public static void testMethod1(int age, double height){
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 키는 " + height + "cm 입니다.");
	}
	public static void testMethod2(int age, int weight){
		// 메소드의 매개변수는 동일한 자료형이라도 각각 따로 선언해줘야 함
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 몸무게는 " + weight + "kg 입니다.");
	}
	public static void testMethod3(){
		System.out.println("잘가~~~~~");
	}
}
