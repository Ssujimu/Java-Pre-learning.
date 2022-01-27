class InstCnt {
	static int clsNum = 0;	// 클래스 변수로 인스턴스와 무관하게 메모리 상에 따로 존재
	int insNum = 0;	// 인스턴스 변수로 인스턴스 내의 멤베로 각 인스턴스 별로 하나씩 존재
	public InstCnt() {
		clsNum++;
		System.out.println("클래스 변수 : " + clsNum);
		insNum++;
		System.out.println("인스턴스 변수 : " + insNum);
	}
}

class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		System.out.println("cnt1 : " + cnt1.clsNum + ", cnt2 : " + cnt2.clsNum + ", cnt3 : " + cnt3.clsNum);
	}
}
