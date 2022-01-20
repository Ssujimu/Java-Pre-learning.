/*
FirstJava.java 실행순서
C:\Users\Administrator>d:				// d 드라이브로 이동
D:\>cd java\basic						// .java 파일이 있는 곳으로 이동
D:\java\basic>javac FirstJava.java		// FirstJava.java 파일을 컴파일 하여 FirstJava.class 파일 생성
D:\java\basic>java FirstJava			// 컴파일하여 생성한 클래스 파일을 이용하여 실행시킴
Java를 자바라!!							// FirstJava 클래스 파일을 실행시킨 결과물
*/

class FirstJava {
	public static void main(String[] args) {
		System.out.println("Java를 자바라!!");
		System.out.println("2 + 5 = " + 2 + 5);		// 2 + 5 = 25
		System.out.println("2 + 5 = " + (2 + 5));	// 2 + 5 = 7
		System.out.println(2 + 5 + " = 2 + 5");		// 7 = 2 + 5
		System.out.println(2 + " 2 + 5 " + 5);		// 2 2 + 5 5
	}
}
