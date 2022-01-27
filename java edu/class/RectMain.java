/*
가로와 세로를 int형으로 저장할 수 있는 Rect클래스 제작
1. 인스턴스 생성과 동시에 멤버변수들을 초기화 시킴
2. 가로와 세로를 변경할 수 있는 메소드 제작
3. 직사각형의 넓이와 둘레를 계산해서 리턴하는 메소드 제작 - getArea(), getPeri()
 - 밑변 12, 높이 17인 직사각형 인스턴스 생성 후 넓이 출력
 - 밑변을 9, 높이 7로 변경한 후 다시 넓이와 둘레 출력
*/

class Rect {
	private int width, height;
	public Rect(int w, int h) {
		width = w; height = h;
	}

	public void setWidth(int w) { width = w; }
	public void setHeight(int h) { height = h; }

	public int getArea() { return width * height;}
	public int getPeri() { return (width + height) * 2; }
}

class RectMain {
	public static void main(String[] args) {
		Rect re = new Rect(12, 17);
		System.out.println("직사각형의 넓이 : " + re.getArea());
		System.out.println("직사각형의 둘레 : " + re.getPeri());
		System.out.println();

		re.setWidth(9);		re.setHeight(7);
		System.out.println("직사각형의 넓이2 : " + re.getArea());
		System.out.println("직사각형의 둘레2 : " + re.getPeri());
	}
}
