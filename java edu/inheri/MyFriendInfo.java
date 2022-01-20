import java.util.*;

/* ģ�� �ּҷ� ���α׷�
1. ģ���� ���� ���� ģ���� �з� 
 - ��ģ���� ����ģ���� ������ ������ �� �ִ� Ŭ���� : Friend, HighFriend, UnivFriend
2. ģ�� ������ ���� �Է��Ͽ� ���� �� ���
 - ģ�� ������ �Է¹ް�, �����ϰ�, ����ϴ� ���� �۾� : FriendHandler
*/

class Friend {
	// ģ���� �⺻������ ������ Ŭ����
	String name, phone, addr;						// ģ������ �⺻������ �̸�, ��ȣ, �ּ��� ������ ���� �������
	public Friend(String name, String phone, String addr) {
		// �����ڷμ� �޾ƿ� �Ű��������� ��������鿡 ����(�ϳ��� �ν��Ͻ��� ������ �� �ٷ� ģ�������� �����Ŵ)
		this.name = name;	this.phone = phone;		this.addr = addr;
	}
	public void showData() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);
		System.out.println("�ּ� : " + addr);
	}
	public void showBasicInfo() {}
	// Ư���� �۾��� ������ ������ ���� Ŭ�������� �������̵��� ��Ű�� ���� ����Ŭ�������� ������ ����
}

class HighFriend extends Friend {
	// ��ģ���� �⺻������ ������ Ŭ������ Friend�� ��ӹ޾� �⺻ ������ ������ ��
	String work;
	public HighFriend(String name, String phone, String addr, String work) {
		super(name, phone, addr);
		// �⺻������ �μ��� �Ͽ� ����Ŭ������ FriendŬ������ ������ ȣ��
		this.work = work;
	}
	public void showData() {
		super.showData();
		// �������̵��� �޼ҵ忡�� ���� �޼ҵ带 ȣ��
		System.out.println("���� : " + work);
		
	}
	public void showBasicInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);}
}

class UnivFriend extends Friend {
	// ����ģ���� �⺻������ ������ Ŭ������ HighFriend�� ��ӹ޾� �⺻ ������ ������ ��
	String major;
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		// �⺻������ �μ��� �Ͽ� ����Ŭ������ FriendŬ������ ������ ȣ��
		this.major = major;
	}
	public void showData() {
		super.showData();
		// �������̵��� �޼ҵ忡�� ���� �޼ҵ带 ȣ��
		System.out.println("���� : " + major);
		
	}
	public void showBasicInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);
		System.out.println("���� : " + major);
	}
}

class FriendHandler {
	// Friend, HighFriend, UnivFriend Ŭ�������� �̿��Ͽ� ���� �۾��� ó���ϴ� Ŭ����
	private Friend[] myFriends;
	// Friend�� �ν��Ͻ�(����Ŭ���� ����)�� ������ �� �ִ� �迭 ����
	// Friend������ ���������ν� Friend�� ���� Ŭ������ HighFriend�� UnivFriend �� �ν��Ͻ��� ���尡��
	private int numOfFriends;
	// myFriends �迭�� �ε��� ��ȣ���� ���� �迭�� ����Ǿ� �ִ� ģ���� ��

	public FriendHandler(int num) {
		myFriends = new Friend[num];
		// �迭�� ũ�⸦ �μ��� �޾ƿ� myFriends �迭 ���� : ������ ũ�⸸ŭ ģ�� ������ ������ �� ����
		numOfFriends = 0;
		// ���� ����� ģ�� ������ myFriends �迭�� ������ ģ�������� ���� �ε��� ��ȣ
	}
	private void addFriendInfo(Friend fren) {
		// FriendHandler Ŭ���� ���ο����� ����ϹǷ� �ܺο��� ������ �� ���� private���� ������
		// myFriends �迭�� �߰��� ģ�� ���� �ν��Ͻ��� �޾� myFriends �迭�� �߰���Ű�� �޼ҵ�
		// �Ű������� Friend���� ������ HighFriend�� UnivFriend�� �ν��Ͻ� ��� �޾ƾ� �ϹǷ� �� Ŭ������ ���� Ŭ������ ����
		// �Ű������� Friend���� �ƴϸ� ��� ������ ģ������ ��ŭ addFriendInfo() �޼ҵ带 ���� ������ ��
		myFriends[numOfFriends] = fren;
		// �μ��� �޾ƿ� ģ������ �ν��Ͻ��� myFriends �迭�� ����
		numOfFriends++;
	}
	public void addFriend(int choice) {
		// ����ڰ� �Է��ϴ� ģ�� ������ �޾� �����Ű�� �޼ҵ�
		String name, phone, addr, work, major;					// ģ�� ������ ������ ������ ����

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");	name = sc.nextLine();
		System.out.print("��ȣ : ");	phone = sc.nextLine();
		System.out.print("�ּ� : ");	addr = sc.nextLine();

		if (choice == 1) {
			System.out.print("���� : "); work = sc.nextLine();
			addFriendInfo(new HighFriend(name, phone, addr, work));
			// �̸����� HighFriend�ν��Ͻ��� ���� �� �� �ν��Ͻ��� �μ����Ͽ� addFriendInfo()�޼ҵ� ȣ��
		} else {
			System.out.print("���� : "); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}
		System.out.println("�Է� �Ϸ�\n");
	}
	public void showAllData() {
		// ��ü ģ�� ������ ����ϴ� �޼ҵ�
		for (int i = 0 ; i < numOfFriends ; i++) {
			// ���� myFriends �迭�� ����ִ� �ν��Ͻ� ������ŭ�� ����
			myFriends[i].showData();
			System.out.println();
		}
	}
	public void showBasicInfo() {
		// �⺻ ģ�� ������ ����ϴ� �޼ҵ�
		for (int i = 0 ; i < numOfFriends ; i++) {
			// ���� myFriends �迭�� ����ִ� �ν��Ͻ� ������ŭ�� ����
			myFriends[i].showBasicInfo();
			System.out.println();
		}
	}
}

class MyFriendInfo {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(10);

		while (true) {	// ���� ������ ���鼭 ���α׷� ��� ���¸� ����
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
			case 1: case 2:	// ����ڰ� ������ �޴�(choice)�� 1�� �̰ų� 2���� ���
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
