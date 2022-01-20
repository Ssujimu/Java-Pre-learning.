class Speaker {
	private int vol;
	public void showCurrentState() {
		System.out.println("���� ũ�� : " + vol);
	}
	public void setVol(int vol) { this.vol = vol; }
}

class BaseSpeaker extends Speaker {
	private int base;
	public void showCurrentState() {
		// ���� Ŭ������ SpeakerŬ������ �޼ҵ带 �������̵��� �޼ҵ�
		super.showCurrentState();
		// �������̵��� �޼ҵ忡���� ����Ŭ������ ���� �޼ҵ带 superŰ���带 �̿��Ͽ� ȣ���� �� ����
		System.out.println("���̽� ũ�� : " + base);
	}
	public void setBase(int base) {
		this.base = base;
	}
}

class Overriding {
	public static void main(String[] args) {
		BaseSpeaker bs = new BaseSpeaker();
		bs.setVol(10);
		bs.setBase(20);
		bs.showCurrentState();
		// �������̵��� �޼ҵ带 ȣ���� ��� ������ ������ Ŭ������ �������̵��� �޼ҵ尡 ȣ���
	}
}
