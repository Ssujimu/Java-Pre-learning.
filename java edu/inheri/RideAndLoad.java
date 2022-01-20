class Aa {
	public void testA() { System.out.println("Aa's test"); }
	public void rideMethod() { System.out.println("Aa's Method"); }
	public void loadMethod() { System.out.println("void Method"); }
}

class Bb extends Aa {
	public void testB() { System.out.println("Bb's test"); }
	public void rideMethod() { System.out.println("Bb's Method"); }				// 오버라이딩
	public void loadMethod(int n) { System.out.println("int Method"); }			// 오버로딩
}

class Cc extends Bb {
	public void testC() { System.out.println("Cc's test"); }
	public void rideMethod() { System.out.println("Cc's Method"); }				// 오버라이딩
	public void loadMethod(double n) { System.out.println("double Method"); }	// 오버로딩
}

class RideAndLoad {
	public static void main(String[] args) {
		Aa ref1 = new Cc();
		Bb ref2 = new Cc();
		Cc ref3 = new Cc();
		// 상위 클래스로 선언한 후 하위클래스로 인스턴스 생성이 가능
		// JVM에선 실제 인스턴스의 자료형인 하위클래스가 아닌 선언한 상위클래스의 자료형으로 인식하여 상위 클래스의 메소드들만 사용가능
		// 단, 오버라이딩된 메소드에 한해서는 하위클래스의 메소드가 실행됨

/*
		- 일반 메소드일 경우
		ref1.testA(); : 실행가능(ref1을 JVM에서 Aa형 인스턴스로 인식하므로 Aa클래스의 메소드 호출가능)
		ref1.testB();와 ref1.testC() : 실행불가(ref1을 JVM에서 Aa형 인스턴스로 인식하므로 Aa클래스의 메소드만 호출가능)

		ref2.testB();
		ref2.testA();	// 이 둘은 실행 가능
		ref2.testC(); : 실행불가(ref2가 Bb형으로 인식되므로 Bb클래스와 상위 클래스인 Aa클래스의 메소드들만 실행가능)


*/

		

		ref1.rideMethod();	// Cc's Method
		ref2.rideMethod();	// Cc's Method
		ref3.rideMethod();	// Cc's Method
		// 상위 클래스로 선언한 후 하위 클래스로 생성한 인스턴스로는 상위클래스의 메소드에만 접근이 가능하나
		// 오버라이딩된 메소드에는 예외적으로 최하위 클래스에서 오버라이딩된 메소드가 실행됨

		ref1.loadMethod();	// void Method
		ref2.loadMethod(1);	// int Method
		ref3.loadMethod(3.14);	// double Method
		// 최하위 클래스형 인스턴스에서는 상위클래스까지 포함하여 이름이 같은 오버로딩된 메소드들을 사용할 수 있음
	}
}
