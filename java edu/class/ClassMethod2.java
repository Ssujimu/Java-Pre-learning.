class SimpleMath {
	public static final double PI = 3.1415;
	public static double add(double n1, double n2) {return n1 + n2;}
	public static double mul(double n1, double n2) {return n1 * n2;}
}

class AreaMath {
	public static double calCircleArea(double rad) {
		// SimpleMath sm = new SimpleMath();
		double result = SimpleMath.mul(rad, rad);
		result = SimpleMath.mul(result, SimpleMath.PI);
		return result;
	}
	public static double calRectArea(double width, double height) {
		// SimpleMath sm = new SimpleMath();
		return SimpleMath.mul(width, height);
	}
}
class ClassMethod2 {
	public static void main(String[] args) {
		// AreaMath am = new AreaMath();
		System.out.println("동그라미의 넓이 : " + AreaMath.calCircleArea(2.4));
		System.out.println("직사각형의 넓이 : " + AreaMath.calRectArea(2.0, 4.0));
	}
}
