/*
FirstJava.java �������
C:\Users\Administrator>d:				// d ����̺�� �̵�
D:\>cd java\basic						// .java ������ �ִ� ������ �̵�
D:\java\basic>javac FirstJava.java		// FirstJava.java ������ ������ �Ͽ� FirstJava.class ���� ����
D:\java\basic>java FirstJava			// �������Ͽ� ������ Ŭ���� ������ �̿��Ͽ� �����Ŵ
Java�� �ڹٶ�!!							// FirstJava Ŭ���� ������ �����Ų �����
*/

class FirstJava {
	public static void main(String[] args) {
		System.out.println("Java�� �ڹٶ�!!");
		System.out.println("2 + 5 = " + 2 + 5);		// 2 + 5 = 25
		System.out.println("2 + 5 = " + (2 + 5));	// 2 + 5 = 7
		System.out.println(2 + 5 + " = 2 + 5");		// 7 = 2 + 5
		System.out.println(2 + " 2 + 5 " + 5);		// 2 2 + 5 5
	}
}
