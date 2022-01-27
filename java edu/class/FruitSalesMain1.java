/* ��� �Ǹ� ���α׷�
��� �Ǹ��� : class FruitSeller
 - ������� : �����������, �����, �������
 - �޼ҵ� : �Ǹ�(), ����Ȳ����()

��� ������ : class FruitBuyer
 - ������� : ������ ��, ������ ��� ����
 - �޼ҵ� : ����(), ����Ȳ����()

���α׷� ���� : class FruitSalesMain1
 - FruitSeller�� FruitBuyer�� �ν��Ͻ��� �����Ͽ� ��� �Ǹ� �� ���Ÿ� ��Ű�� ��Ȳ�� ��
*/

class FruitSeller {	// ��� �Ǹ��� Ŭ����
	int numOfApple = 20;	// ��� ��������
	int myMoney = 0;		// �����
	final int APPLE_PRICE = 1000;	// ��� ����

	public int saleApple(int money) {	// ��� �Ǹ� �޼ҵ�
		int num = money / APPLE_PRICE;	// �Ǹ��� ��������� ���ϴ� ������ �����ڰ� ������ �ݾ׸�ŭ�� ��� ������ ����
		myMoney += money;	// �����ڰ� �� ����ŭ ����� ����
		numOfApple -= num;	// �Ǹ��� ����� ���� ����������� ����
		return num;			// �����ڿ��� ����� �ѱ�
	}
	public void showSaleResult() {
		System.out.println("���� ��� : " + numOfApple);
		System.out.println("�Ǹ� ���� : " + myMoney);
	}
}

class FruitBuyer {	// ��� ������ Ŭ����
	int numOfApple = 0;		// ������ ��� ����
	int myMoney = 10000;	// ������ ��

	public void buyApple(FruitSeller seller, int money) {	// ��� ���� �޼ҵ�
		numOfApple += seller.saleApple(money);	// (line 19)
		// ��� ������ ��(money)�� �μ��� �Ͽ� seller �ν��Ͻ��� saleApple()�޼ҵ带 ȣ��
		// seller���� 2000�� ��ġ ��� �ּ���
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("��� ���� : " + numOfApple);
		System.out.println("���� �ܾ� : " + myMoney);
	}
}

class FruitSalesMain1 {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();	// ��� �Ǹ��� ��ü ����
		FruitBuyer buyer = new FruitBuyer();	// ��� ������ ��ü ����

		buyer.buyApple(seller, 2000);	// (line 35)
		// buyer�ν��Ͻ� ���� buyApple()�޼ҵ� ȣ��
		// seller : ����� �����Ϸ��� �Ǹ��ڰ� �ʿ��ϹǷ� seller�ν��Ͻ��� ������
		// 2000 : ��� ������ ��

		System.out.println("��� �Ǹ��� ��Ȳ");
		seller.showSaleResult();

		System.out.println("��� ������ ��Ȳ");
		buyer.showBuyResult();
	}
}

/*
������
 - �Ǹ��ڳ� ������ �ν��Ͻ��� ���� �����ص� ��� ������ ��(�������)�� ������ ����

�ذ�å
 - �ν��Ͻ� ���� ��������� ���� �ٸ��� ������ �� �־�� ��
*/