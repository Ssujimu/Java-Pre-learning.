class Aa {
	public void test1() { System.out.println("Aa's test1()"); }
	public void test2() { System.out.println("Aa's test2()"); }
}

class Bb extends Aa {
	public void test1() { System.out.println("Bb's test1()"); }
	public void test2() { System.out.println("Bb's test2()"); }
}

class Cc extends Bb {
	public void test2() { System.out.println("Cc's test2()"); }
}

class OverridingTest {
	public static void main(String[] args) {
		Bb Bb2 = new Bb();
		Cc Cc2 = new Cc();
		Bb2.test1();	// Bb 클래스에서 호출
		Bb2.test2();	// Bb 클래스에서 호출

		Cc2.test1();	// Cc엔 test1이 없기에 Bb에서 test1호출
		Cc2.test2();	// CC 클래스에서 test2호출
	}
}
