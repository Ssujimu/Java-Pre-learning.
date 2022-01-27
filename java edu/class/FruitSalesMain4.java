class FruitSeller {
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;

	public FruitSeller(int num, int money, int price) {
		numOfApple = num;
		myMoney = money;
		APPLE_PRICE = price;
	}

	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		myMoney += money;
		numOfApple -= num;
		return num;	
	}

	public void showSaleResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer {
	int numOfApple = 0;	
	int myMoney = 10000;

	public FruitBuyer(int num, int money) {
		numOfApple = num;
		myMoney = money;
	}
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}

class FruitSalesMain4 {
	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller(30, 0, 1500);
		FruitSeller seller2 = new FruitSeller(20, 0, 1000);
		FruitBuyer buyer = new FruitBuyer(0, 10000);

		seller1.myMoney += 500;		buyer.myMoney -= 500;
		seller1.numOfApple -= 20;	buyer.numOfApple += 20;

		seller2.myMoney += 500;		buyer.myMoney -= 500;
		seller2.numOfApple -= 20;	buyer.numOfApple += 20;
		// 인스턴스를 통해 멤버변수에 직접 접근이 가능하여 아무 값이 변수에 넣을 수 있는 문제점

		System.out.println("사과 판매자1 현황");
		seller1.showSaleResult();

		System.out.println("사과 판매자2 현황");
		seller2.showSaleResult();

		System.out.println("사과 구매자 현황");
		buyer.showBuyResult();
	}
}

/*
문제점
 - 인스턴스의 멤버변수에 직접 접근할 수 있어서 값을 자유롭게 변경할 수 있음

해결책
 - 인스턴스의 멤버변수에는 직접적으로 접근할 수 없게 해야 함(정보은닉)
*/