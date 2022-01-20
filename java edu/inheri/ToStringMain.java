class ToStringEx {
	private String name, city;
	public ToStringEx(String name, String city) {
		this.name = name;	this.city = city;
	}
	public String toString() {
		return "이름 : " + name + ", 도시 : " + city;
	}
}

class ToStringMain {
	public static void main(String[] args) {
		ToStringEx ts1 = new ToStringEx("홍길동", "서울");
		System.out.println(ts1);

		ToStringEx ts2 = new ToStringEx("전우치", "부산");
		System.out.println(ts2);
	}
}
