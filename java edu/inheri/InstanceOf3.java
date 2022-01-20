class BasicBox {
	public void basicWrap() { System.out.println("basic wrap"); }
}

class PaperBox extends BasicBox {
	public void paperWrap() { System.out.println("paper wrap"); }
}

class GoldBox extends PaperBox {
	public void goldWrap() { System.out.println("gold wrap"); }
}

class InstanceOf3 {
	public static void main(String[] args) {
		BasicBox box1 = new BasicBox();
		PaperBox box2 = new PaperBox();
		GoldBox box3 = new GoldBox();

		wrapBox(box1);		wrapBox(box2);		wrapBox(box3);
	}
	public static void wrapBox(Object box) {
		// 매개변수를 Object형으로 받기 때문에 box 인스턴스로 접근할 수 있는 메소드는 Object 클래스에 있는 메소드만 가능함
		if (box instanceof GoldBox) {
			((GoldBox)box).goldWrap();
		} else if (box instanceof PaperBox) {
			((PaperBox)box).paperWrap();
		} else {
			((BasicBox)box).basicWrap();
		}
	}
}
