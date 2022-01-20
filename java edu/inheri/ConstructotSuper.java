class Car {
	int gasolineGauge;
	public Car(int g) {
		gasolineGauge = g;
	}
}

class HybridCar extends Car {
	int electricGauge;
	public HybridCar(int g, int e) {
		super(g);
		electricGauge = e;
	}
}

class HybridWaterCar extends HybridCar {
	int waterGauge;
	public HybridWaterCar(int g, int e, int w) {
		super(g, e);
		waterGauge = w;
	}
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ� : " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ : " + electricGauge);
		System.out.println("�ܿ� ���ͷ� : " + waterGauge);
	}
}

class ConstructotSuper {
	public static void main(String[] args) {
		HybridWaterCar hwc = new HybridWaterCar(5, 7, 3);
		hwc.showCurrentGauge();
	}
}
