class ToStringEx {
	private String name, city;
	public ToStringEx(String name, String city) {
		this.name = name;	this.city = city;
	}
	public String toString() {
		return "�̸� : " + name + ", ���� : " + city;
	}
}

class ToStringMain {
	public static void main(String[] args) {
		ToStringEx ts1 = new ToStringEx("ȫ�浿", "����");
		System.out.println(ts1);

		ToStringEx ts2 = new ToStringEx("����ġ", "�λ�");
		System.out.println(ts2);
	}
}
