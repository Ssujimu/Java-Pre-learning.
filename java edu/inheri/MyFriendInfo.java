import java.util.*;

/* 친구 주소록 프로그램
1. 친구를 고교와 대학 친구로 분류 
 - 고교친구와 대학친구의 정보를 저장할 수 있는 클래스 : Friend, HighFriend, UnivFriend
2. 친구 정보를 직접 입력하여 저장 및 출력
 - 친구 정보를 입력받고, 저장하고, 출력하는 등의 작업 : FriendHandler
*/

class Friend {
	// 친구의 기본정보를 저장할 클래스
	String name, phone, addr;						// 친구들의 기본정보인 이름, 번호, 주소의 정보를 담을 멤버변수
	public Friend(String name, String phone, String addr) {
		// 생성자로서 받아온 매개변수들을 멤버변수들에 저장(하나의 인스턴스를 생성할 때 바로 친구정보를 저장시킴)
		this.name = name;	this.phone = phone;		this.addr = addr;
	}
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
		System.out.println("주소 : " + addr);
	}
	public void showBasicInfo() {}
	// 특별한 작업을 하지는 않지만 하위 클래스에서 오버라이딩을 시키기 위해 상위클래스에서 정의해 놓음
}

class HighFriend extends Friend {
	// 고교친구의 기본정보를 저장할 클래스로 Friend를 상속받아 기본 정보를 가지게 됨
	String work;
	public HighFriend(String name, String phone, String addr, String work) {
		super(name, phone, addr);
		// 기본정보를 인수로 하여 상위클래스인 Friend클래스의 생성자 호출
		this.work = work;
	}
	public void showData() {
		super.showData();
		// 오버라이딩한 메소드에서 원본 메소드를 호출
		System.out.println("직업 : " + work);
		
	}
	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);}
}

class UnivFriend extends Friend {
	// 대학친구의 기본정보를 저장할 클래스로 HighFriend를 상속받아 기본 정보를 가지게 됨
	String major;
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		// 기본정보를 인수로 하여 상위클래스인 Friend클래스의 생성자 호출
		this.major = major;
	}
	public void showData() {
		super.showData();
		// 오버라이딩한 메소드에서 원본 메소드를 호출
		System.out.println("전공 : " + major);
		
	}
	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
		System.out.println("전공 : " + major);
	}
}

class FriendHandler {
	// Friend, HighFriend, UnivFriend 클래스들을 이용하여 실제 작업을 처리하는 클래스
	private Friend[] myFriends;
	// Friend형 인스턴스(하위클래스 포함)만 저장할 수 있는 배열 선언
	// Friend형으로 선언함으로써 Friend의 하위 클래스인 HighFriend와 UnivFriend 형 인스턴스도 저장가능
	private int numOfFriends;
	// myFriends 배열의 인덱스 번호이자 현재 배열에 저장되어 있는 친구의 수

	public FriendHandler(int num) {
		myFriends = new Friend[num];
		// 배열의 크기를 인수로 받아와 myFriends 배열 생성 : 지정한 크기만큼 친구 정보를 저장할 수 있음
		numOfFriends = 0;
		// 현재 저장된 친구 수이자 myFriends 배열에 저장할 친구정보를 넣을 인덱스 번호
	}
	private void addFriendInfo(Friend fren) {
		// FriendHandler 클래스 내부에서만 사용하므로 외부에서 접근할 수 없게 private으로 선언함
		// myFriends 배열에 추가할 친구 정보 인스턴스를 받아 myFriends 배열에 추가시키는 메소드
		// 매개변수가 Friend형인 이유는 HighFriend와 UnivFriend형 인스턴스 모두 받아야 하므로 두 클래스의 상위 클래스로 선언
		// 매개변수가 Friend형이 아니면 모든 종류의 친구정보 만큼 addFriendInfo() 메소드를 따로 만들어야 함
		myFriends[numOfFriends] = fren;
		// 인수로 받아온 친구정보 인스턴스를 myFriends 배열에 저장
		numOfFriends++;
	}
	public void addFriend(int choice) {
		// 사용자가 입력하는 친구 정보를 받아 저장시키는 메소드
		String name, phone, addr, work, major;					// 친구 정보를 저장할 변수들 선언

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");	name = sc.nextLine();
		System.out.print("번호 : ");	phone = sc.nextLine();
		System.out.print("주소 : ");	addr = sc.nextLine();

		if (choice == 1) {
			System.out.print("직업 : "); work = sc.nextLine();
			addFriendInfo(new HighFriend(name, phone, addr, work));
			// 이름없이 HighFriend인스턴스를 생성 후 그 인스턴스를 인수로하여 addFriendInfo()메소드 호출
		} else {
			System.out.print("전공 : "); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}
		System.out.println("입력 완료\n");
	}
	public void showAllData() {
		// 전체 친구 정보를 출력하는 메소드
		for (int i = 0 ; i < numOfFriends ; i++) {
			// 현재 myFriends 배열에 들어있는 인스턴스 개수만큼만 루프
			myFriends[i].showData();
			System.out.println();
		}
	}
	public void showBasicInfo() {
		// 기본 친구 정보를 출력하는 메소드
		for (int i = 0 ; i < numOfFriends ; i++) {
			// 현재 myFriends 배열에 들어있는 인스턴스 개수만큼만 루프
			myFriends[i].showBasicInfo();
			System.out.println();
		}
	}
}

class MyFriendInfo {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(10);

		while (true) {	// 무한 루프로 돌면서 프로그램 대기 상태를 유지
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 고교친구 저장");
			System.out.println("2. 대학친구 저장");
			System.out.println("3. 전체정보 출력");
			System.out.println("4. 기본정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1: case 2:	// 사용자가 선택한 메뉴(choice)가 1번 이거나 2번인 경우
				handler.addFriend(choice);	break;
			case 3:
				handler.showAllData();		break;
			case 4:
				handler.showBasicInfo();	break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
