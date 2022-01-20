class BasicBox {
	public void basicWrap() { System.out.println("basic wrap"); }
}

class PaperBox extends BasicBox {
	public void paperWrap() { System.out.println("paper wrap"); }
}

class GoldBox extends PaperBox {
	public void goldWrap() { System.out.println("gold wrap"); }
}

class InstanceOf {
	public static void main(String[] args) {
		BasicBox box1 = new BasicBox();
		PaperBox box2 = new PaperBox();
		GoldBox box3 = new GoldBox();

		wrapBox(box1);		wrapBox(box2);		wrapBox(box3);
	}
	public static void wrapBox(BasicBox box) {
		// �Ű������� ����Ŭ������ BasicBox�� �����߱� ������ �� ����Ŭ������ PaperBox�� GoldBox�� �ν��Ͻ��� ���� �� ����
		// ��, ����Ŭ������ BasicBox������ �޾ұ� ������ PaperBox�� GoldBox�� �ν��Ͻ��� BasicBox������ �ν�
		// ��, BasicBox�� �޼ҵ��� basicWrap()�� �̿��ؾ� ��


		// instanceof : ����ȯ ���ɿ��θ� ���� �����ڷ� ���� �˻�� ������ Ŭ�������� �ؾ� ��
		if (box instanceof GoldBox) {
			// box�� GoldBox�� ����ȯ�� �����ϴٸ�
			((GoldBox)box).goldWrap();
		} else if (box instanceof PaperBox) {
			((PaperBox)box).paperWrap();
		} else {
			box.basicWrap();
		}
	}
}
