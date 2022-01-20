class Gun {
	int bullet;
	public Gun(int num) { bullet = num; }
	public void shot() {
		System.out.println("BBANG!!");
		bullet--;
	}
}

class Police {
	Gun pistol;	// Gun형 인스턴스 pistol을 선언(생성 안한 상태)
	int handcuff;
	public Police(int num, int hcuff) {
		handcuff = hcuff;
		if (num > 0) {
			pistol = new Gun(num);
			// 총알이 있으면 Gun클래스의 인스턴스를 생성함(Gun을 가진 Police인스턴스 생성)
		} else {
			pistol = null;
			// 총알이 없으면 Gun클래스의 인스턴스를 생성 안함(Gun이 없는 Police인스턴스 생성)
		}
	}
	public void putHandcuff() {
		System.out.println("SNAP!!");
		handcuff--;
	}
	public void shot() {
		if (pistol == null) {
			System.out.println("총이 없는데영??");
		} else {
			pistol.shot();
		}
	}
}

class HASComposite {
	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shot();
		pman.putHandcuff();

		Police pman2 = new Police(0, 3);
		pman2.shot();
	}
}
