class StudentInfo {
// 학생 정보를 저장할 클래스(하나의 인스턴스가 한 명의 학생을 의미)
	private int stID, korean, math, art;
	public StudentInfo(int stID, int korean, int math, int art) {
		this.stID = stID;	this.korean = korean;	this.math = math;	this.art = art;
		// 멤버변수와 매개변수의 이름이 같으면 this를 이용하여 멤버변수를 구분해 줌
		// this. : "현재 생성되고 있는 인스턴스의 ~"를 의미하는 명령
	}
	public StudentInfo(int stID, int korean, int math) {
		// 매개변수의 개수를 다르게 하여 생성자를 오버로딩함
		this(stID, korean, math, -1);
		// 매개변수들을 인수로 하여 다른 생성자를 호출
		// this() : 다른 생성자 호출 - 생성자에서만 호출이 가능
	}
	public void showInfo() {
		System.out.println("학번 : " + stID);
		System.out.println("국어 : " + korean);
		System.out.println("수학 : " + math);
		if (art == -1) {
			System.out.println("미술 수업을 듣지 않는 학생");
		} else {
			System.out.println("미술 : " + art);
		}
		System.out.println("-----------------------------------");
	}
}

class OverloadingEx {
	public static void main(String[] args) {
		StudentInfo st1 = new StudentInfo(1234, 98, 95, 88);	// 미술 수업을 듣는 학생 인스턴스 생성
		st1.showInfo();

		StudentInfo st2 = new StudentInfo(1235, 95, 85);	// 미술 수업을 듣지 않는 학생 인스턴스 생성
		st2.showInfo();
	}
}
