package _191017;

import java.util.*;//Scanner Api는 java.util. 패키지에 들어있음

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int Math;
		System.out.println("이름?");
		name = sc.next();
		System.out.println("수학?");
		Math = sc.nextInt();
		System.out.println(name +":"+Math);
		
//		System.out.println("메세지 입력:");
//		System.out.println("프로그램 종료하려면 q 입력");
//		Scanner scanner = new Scanner(System.in);
//		String inputString;
//		
//		do {
//			inputString = scanner.nextLine();
//			System.out.println(inputString);
//		}while(!inputString.equals("q"));
		
		
//		//Scanner라는 Api 사용 (이를 위해서 외부에서 class받아와야함 : import) -> scanner 변수 할당  -> 객체화
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();//Sacnner에 들어있는 메서드
//		//String타입은 레퍼런스 타입이라서 가능
//		int in = scanner.nextInt();
//		System.out.println(in);
//		//System.out.println(str);
	}

}
