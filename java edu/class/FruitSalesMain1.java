/* 사과 판매 프로그램
사과 판매자 : class FruitSeller
 - 멤버변수 : 사과보유개수, 매출액, 사과가격
 - 메소드 : 판매(), 현상황보기()

사과 구매자 : class FruitBuyer
 - 멤버변수 : 구매할 돈, 구매한 사과 개수
 - 메소드 : 구매(), 현상황보기()

프로그램 제어 : class FruitSalesMain1
 - FruitSeller와 FruitBuyer의 인스턴스를 생성하여 사과 판매 및 구매를 시키고 상황을 봄
*/

class FruitSeller {	// 사과 판매자 클래스
	int numOfApple = 20;	// 사과 보유개수
	int myMoney = 0;		// 매출액
	final int APPLE_PRICE = 1000;	// 사과 가격

	public int saleApple(int money) {	// 사과 판매 메소드
		int num = money / APPLE_PRICE;	// 판매할 사과개수를 구하는 식으로 구매자가 지불한 금액만큼의 사과 개수를 구함
		myMoney += money;	// 구매자가 낸 돈만큼 매출액 증가
		numOfApple -= num;	// 판매한 사과로 인한 사과보유개수 감소
		return num;			// 구매자에게 사과를 넘김
	}
	public void showSaleResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer {	// 사과 구매자 클래스
	int numOfApple = 0;		// 구매한 사과 개수
	int myMoney = 10000;	// 구매할 돈

	public void buyApple(FruitSeller seller, int money) {	// 사과 구매 메소드
		numOfApple += seller.saleApple(money);	// (line 19)
		// 사과 구매할 돈(money)을 인수로 하여 seller 인스턴스의 saleApple()메소드를 호출
		// seller에게 2000원 어치 사과 주세요
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}

class FruitSalesMain1 {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();	// 사과 판매자 객체 생성
		FruitBuyer buyer = new FruitBuyer();	// 사과 구매자 객체 생성

		buyer.buyApple(seller, 2000);	// (line 35)
		// buyer인스턴스 내의 buyApple()메소드 호출
		// seller : 사과를 구매하려면 판매자가 필요하므로 seller인스턴스를 가져감
		// 2000 : 사과 구매할 돈

		System.out.println("사과 판매자 현황");
		seller.showSaleResult();

		System.out.println("사과 구매자 현황");
		buyer.showBuyResult();
	}
}

/*
문제점
 - 판매자나 구매자 인스턴스를 여럿 생성해도 모두 동일한 값(멤버변수)을 가지고 있음

해결책
 - 인스턴스 별로 멤버변수의 값을 다르게 지정할 수 있어야 함
*/