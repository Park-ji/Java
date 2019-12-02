package _191101_io_net;

import java.net.InetAddress;
import java.net.UnknownHostException;


//getLocalHost()에서 발생할수 있는 예외를 따로 Unknown~Exception을 따로 해도 되지만
//Exception을 통으로 해줘도 ok ==> throws Exception
public class IPTest {
	public static void main(String[] args) throws UnknownHostException  {
		//1) cmd -> ipconfig /all 로  ip주소 확인 ==> windows(os)에서 제공
		//2) java를 이용해 ip주소 확인
		System.out.println("내 컴퓨터 ip = "+ InetAddress.getLocalHost().getHostAddress() );
		//내 컴퓨터의 ip를 확인하는 static method

		
		//www.daum.net의 서버를 접속하고 싶을때?
		//내컴퓨터는 클라이언트가 됨
		//클라이언트가 서버에 접속하고 싶으면? ip, port알아야함
		//ip+port를 하나로 묶어서 --> 하나의 이름을 부여하고 등록해 놓음 : domain(중복 x)
		//ex) www.daum.net : domain
		
		//매개변수 host => domain입력
		//getAllByName : 해당 domain에 관련된거 다 줘~
		//인터넷 연결이 되어야 가능!
		InetAddress[] domains 
		= InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress i : domains) {
			System.out.println(i);
		}
		
		
	}
}

