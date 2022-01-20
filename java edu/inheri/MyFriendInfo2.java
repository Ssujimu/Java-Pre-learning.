import java.util.*;

/* ģ�� �ּҷ� ���α׷�
1. ģ���� ���� ���� ģ���� �з� 
 - ��ģ���� ����ģ���� ������ ������ �� �ִ� Ŭ���� : Friend, HighFriend, UnivFriend
2. ģ�� ������ ���� �Է��Ͽ� ���� �� ���
 - ģ�� ������ �Է¹ް�, �����ϰ�, ����ϴ� ���� �۾� : FriendHandler
*/

class Friend {
	String name, phone, addr;
	public Friend(String name, String phone, String addr) {
		this.name = name;	this.phone = phone;		this.addr = addr;
	}
	public void showData() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);
		System.out.println("�ּ� : " + addr);
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
		System.out.println("���� : " + work);
		
	}
	public void showBasicInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);
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
		System.out.println("���� : " + major);
		
	}
	public void showBasicInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);
		System.out.println("���� : " + major);
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
		System.out.print("�̸� : ");	name = sc.nextLine();
		System.out.print("��ȣ : ");	phone = sc.nextLine();
		System.out.print("�ּ� : ");	addr = sc.nextLine();

		if (choice == 1) {
			System.out.print("���� : "); work = sc.nextLine();
			addFriendInfo(new HighFriend(name, phone, addr, work));
		} else {
			System.out.print("���� : "); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}
		System.out.println("�Է� �Ϸ�\n");
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
				// myFriends[i]�ȿ� �ִ� �ν��Ͻ��� HighFriend�� ����ȯ�� �����ϸ�
				((HighFriend)myFriends[i]).showBasicInfo();
			} else {
				((UnivFriend)myFriends[i]).showBasicInfo();
			}
			// �������̵��� �� �� ���� ��Ȳ�� ��� ����ȯ���� ó���� �� ����
			// ��, ����ȯ �ϱ� ���� ����ȯ�� �������� �˻� �� �ϴ� ���� ����
			System.out.println();
		}
	}
}

class MyFriendInfo2 {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(10);

		while (true) {	
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. ��ģ�� ����");
			System.out.println("2. ����ģ�� ����");
			System.out.println("3. ��ü���� ���");
			System.out.println("4. �⺻���� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� >> ");

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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
