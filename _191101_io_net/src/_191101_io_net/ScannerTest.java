package _191101_io_net;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//아예 다 입력해놓고 실행 => String[] args
		Scanner key = new Scanner(System.in);
		//Scanner안에 키보드 뿐만이 아니라 파일과 같은 것도 가능~
		System.out.println("정수 2개를 입력하세요");
		//구분하는 법? 공백으로 구분함(ex : 10 20)
		int first = key.nextInt();
		int second = key.nextInt();
		System.out.println(first+second);
		System.out.println("한글문자열을 입력하세요.");
		String str = key.next();
		//nextLIne()은 /n값도 받음 
		System.out.println(str);
	}

}
