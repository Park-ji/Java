package _191101_io_net;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws IOException {
		//1> 서버 접속 요청 ==> 서버의 3번
		Socket s = new Socket("127.0.0.1",9999); //ip주소, 포트번호
		//Socket s = new Socket("192.168.15.23",9999); //강사pc 주소
		//ip, port 잘못 쓰면? 원하는 서비스 프로그램 못찾고 다운됨
		//cf) 127.0.0.1 : 내 컴퓨터임을 의미!
		//접속한 서버 이름 : s.getRemoteSocketAddress() //나랑 원격으로 연결된 소켓 주소얻는 것이므로
		System.out.println(s.getRemoteSocketAddress()+" 서버로 접속했습니다.");
//-------------------------------------------------------------------------------		
		//2> 서버로 데이터를 출력 ==> 서버의 4번 (데이터를 서버로 전송)
		//s.getOutputStream(); //1byte단위로 출력 -> 한글은 깨짐 ex)"안녕" : 4byte
		OutputStream out = s.getOutputStream();
		//Output할때 자동 형변환 해줘서 해주는 보조 : PrintWriter => Scanner(입력)와 비슷한 개념
		PrintWriter pout = new PrintWriter(out);
		pout.write("테스트 문자열 ");//out을 가지고는 string을 못보냄
		//pout.close();//이렇게 쓰면 소켓 연결이 끝난것으로 본다 --> 쓰면 x
		pout.flush();//지금까지 출력내용만 서버로 전송하고 출력버퍼를 비워놓겠다!
//---------------------------------------------------------------------------		
		//3> 데이터 입력 ==> 서버의 5번
		InputStream in = s.getInputStream();
		Scanner sin = new Scanner(in); //소켓에서 넘어온 것을 읽음 
		String fromServer = sin.nextLine(); 
		System.out.println(fromServer);
//---------------------------------------------------------------------------		
		//4> 접속 종료
		pout.close();
		sin.close();
		s.close();
		System.out.println("서버와의 접속이 해제되었습니다.");
	}

}

//네트워크 프로그램을 할때는 : Console->모니터아이콘 ->역삼각형 단추->콘솔창 선택 가능
//클라이언트 실행 전에? 서버 먼저 실행해놔야함