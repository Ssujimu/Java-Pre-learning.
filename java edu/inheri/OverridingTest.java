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
		Bb2.test1();	// Bb Ŭ�������� ȣ��
		Bb2.test2();	// Bb Ŭ�������� ȣ��

		Cc2.test1();	// Cc�� test1�� ���⿡ Bb���� test1ȣ��
		Cc2.test2();	// CC Ŭ�������� test2ȣ��
	}
}
