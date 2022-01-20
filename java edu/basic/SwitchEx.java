class SwitchEx {
	public static void main(String[] args) {
		int num = 2;
		switch (num) {
		case 1:
			System.out.println("num의 값은 1");	break;
		case 2:
			System.out.println("num의 값은 2");	break;
		case 3:
			System.out.println("num의 값은 3");	break;
		case 4:
			System.out.println("num의 값은 4");	break;
		default:
			System.out.println("num의 값은 몰?루");
		}
		
		// num의 값이 1, 2, 3 이면 "상" 4, 5, 6 이면 "중" 7, 8, 9 이면 "하"라고 출력

		switch (num) {
		case 1:	case 2: case 3:
		// num의 값이 1이거나 2이거나 3이면 (case를 옆으로 나열하면 or조건으로 묶어줌)
			System.out.println("상");	break;
		case 4:	case 5:	case 6:
			System.out.println("중");	break;
		case 7:	case 8:	case 9:
			System.out.println("하");	break;
		}

		// jdk1.7 이상부터는 문자열도 사용가능
		switch ("bb") {
		case "ab":
			System.out.println("ab");	break;
		case "bb":
			System.out.println("bb");	break;
		case "cb":
			System.out.println("cb");	break;
		default:
			System.out.println("몰?루");	break;
		}

		// score의 점수가 70이상이면 'C', 80이상이면 'B', 90이상이면 'A', 60이상이면 'D', 60미만이면 'F'
		int score = 87;
		switch (score / 10) {
		case 9: case 10:
			System.out.println("A");	break;
		case 8:
			System.out.println("B");	break;
		case 7:
			System.out.println("C");	break;
		case 6:
			System.out.println("D");	break;
		default:
			System.out.println("F");	break;

		
		}
	}
}
