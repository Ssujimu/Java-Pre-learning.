class Gun {
	int bullet;
	public Gun(int num) { bullet = num; }
	public void shot() {
		System.out.println("BBANG!!");
		bullet--;
	}
}

class Police extends Gun {
	// 모든 Police가 Gun을 소유한다는 관계가 성립할 때 가능한 상속
	// 만약 Gun을 소유하지 않는 Police가 있다면 그 Police의 인스턴스를 생성할 때 문제가 발생
	int handcuff;
	public Police(int num, int hcuff) {
		super(num);
		handcuff = hcuff;
	}
	public void putHandcuff() {
		System.out.println("SNAP!!");
		handcuff--;
	}
}

class HASInheritance {
	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shot();
		pman.putHandcuff();
	}
}
