import java.util.*;

/* 친구 주소록 프로그램
1. 친구를 고교와 대학 친구로 분류 
 - 고교친구와 대학친구의 정보를 저장할 수 있는 클래스 : Friend, HighFriend, UnivFriend
2. 친구 정보를 직접 입력하여 저장 및 출력
 - 친구 정보를 입력받고, 저장하고, 출력하는 등의 작업 : FriendHandler
*/

class Friend {
	String name, phone, addr;
	public Friend(String name, String phone, String addr) {
		this.name = name;	this.phone = phone;		this.addr = addr;
	}
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
		System.out.println("주소 : " + addr);
	}
}

class HighFriend extends Friend {
	String work;
	public HighFriend(String name, String phone, String addr, String work) {
		super(name, phone, addr);
		this.work = work;
	}
	public void showData() {
		super.showData();
		System.out.println("직업 : " + work);
		
	}
	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
	}
}

class UnivFriend extends Friend {
	String major;
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	public void showData() {
		super.showData();
		System.out.println("전공 : " + major);
		
	}
	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
		System.out.println("전공 : " + major);
	}
}

class FriendHandler {
	private Friend[] myFriends;
	private int numOfFriends;

	public FriendHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	private void addFriendInfo(Friend fren) {
		myFriends[numOfFriends] = fren;
		numOfFriends++;
	}
	public void addFriend(int choice) {
		String name, phone, addr, work, major;					

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");	name = sc.nextLine();
		System.out.print("번호 : ");	phone = sc.nextLine();
		System.out.print("주소 : ");	addr = sc.nextLine();

		if (choice == 1) {
			System.out.print("직업 : "); work = sc.nextLine();
			addFriendInfo(new HighFriend(name, phone, addr, work));
		} else {
			System.out.print("전공 : "); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}
		System.out.println("입력 완료\n");
	}
	public void showAllData() {
		for (int i = 0 ; i < numOfFriends ; i++) {
			myFriends[i].showData();
			System.out.println();
		}
	}
	public void showBasicInfo() {
		for (int i = 0 ; i < numOfFriends ; i++) {
			if (myFriends[i] instanceof HighFriend) {
				// myFriends[i]안에 있는 인스턴스가 HighFriend로 형변환이 가능하면
				((HighFriend)myFriends[i]).showBasicInfo();
			} else {
				((UnivFriend)myFriends[i]).showBasicInfo();
			}
			// 오버라이딩을 할 수 없는 상황일 경우 형변환으로 처리할 수 있음
			// 단, 형변환 하기 전에 형변환이 가능한지 검사 후 하는 것이 좋음
			System.out.println();
		}
	}
}

class MyFriendInfo2 {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(10);

		while (true) {	
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
			case 1: case 2:	
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
