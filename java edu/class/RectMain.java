/*
���ο� ���θ� int������ ������ �� �ִ� RectŬ���� ����
1. �ν��Ͻ� ������ ���ÿ� ����������� �ʱ�ȭ ��Ŵ
2. ���ο� ���θ� ������ �� �ִ� �޼ҵ� ����
3. ���簢���� ���̿� �ѷ��� ����ؼ� �����ϴ� �޼ҵ� ���� - getArea(), getPeri()
 - �غ� 12, ���� 17�� ���簢�� �ν��Ͻ� ���� �� ���� ���
 - �غ��� 9, ���� 7�� ������ �� �ٽ� ���̿� �ѷ� ���
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
		System.out.println("���簢���� ���� : " + re.getArea());
		System.out.println("���簢���� �ѷ� : " + re.getPeri());
		System.out.println();

		re.setWidth(9);		re.setHeight(7);
		System.out.println("���簢���� ����2 : " + re.getArea());
		System.out.println("���簢���� �ѷ�2 : " + re.getPeri());
	}
}
