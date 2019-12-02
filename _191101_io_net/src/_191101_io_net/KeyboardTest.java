package _191101_io_net;

import java.io.IOException;

public class KeyboardTest {

	public static void main(String[] args) {
		//System.in.read(); //반환 타입 : int
		//error!
		//read가 inputstream의 메소드를 사용
		//read의 선언부에 throws IOException을 가지고 있음
		//예외처리를 사용자가 직접 해줘야함(위의 의미 : 내가 안할꺼니까 너네가 해)
		
//		System.out.println("문자 하나를 입력하세요");
//		try {
//			//main시작하면 키보드에서 입력을 받기위해 기다림
//			int result = System.in.read();
//			//키보드에서 딱 하나만 문자 하나를 입력을 받고
//			System.out.println(result);
//			//모니터에 출력한다
//			//ex, 'a'입력시 '97'출력
//			//이유? 컴퓨터는 내부적으로 이진수임 : 즉, 수로 기억함
//			//cf, 숫자'0'으로 입력할 때 컴퓨터는 숫자가 아닌 문자로 봄 => 48로 출력됨
//			System.out.println((char)result);
//			//int값을 형변환
//		}catch(IOException e) {
//			e.printStackTrace();
//			//에러 e 발생시, 추적해서 Stack에 쌓여있는(메모리에 쌓여있는) 내용을 알려줘!
//			
//		}
//		
		//한번이 아니라 여러번 받고 싶으면?
		try {
			int result = 0;
			while((result = System.in.read())!=-1) {
				//언제 -1이 나옴? 키보드 입력을 중단 시킬때
				//키보드 입력 중단 : ctrl+z
				//한글입력시 ? 문자 깨짐(한계)
				System.out.println((char) result);
				//println vs print
				//os가 윈도우일때 -> read사용시 buffer에 /n입력시 : /n, /r이 같이 들어옴
			}//while end
		}catch(IOException e) {
			e.printStackTrace();
		}//catch end		
	}

}
