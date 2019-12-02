package _191101_io_net;

//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
import java.net.*;
import java.util.*;
import java.io.*;
//cf) BindException error : 이미 실행되고 있을때 발생
public class TCPServer {
	public static void main(String[] args) throws IOException{
		//1> 서버 오픈 : ip,port를 공개해야함
		//ip 주소는 내컴퓨터이므로 공개안해도 앎
		ServerSocket ss = new ServerSocket(9999);//port번호 : 9999로 할당
		//의미? ip와 port 알리면서 접속하려면 하라고 공표
		System.out.println("서버가 9999포트에서 시작되었습니다.");
//----------------------------------------------------------------------------	
		//2> 클라이언트 대기
		//3> 클라이언트 접속 감지되면 접속 허락
		//서버는 하나이고 접속하려는 클라이언트는 여러개이므로 접속시도할때마다 실행되어야함
		while(true) {//무한루프
		Socket s = ss.accept();
		//나한테 연결 시도해서 연결을 허락해준것이므로 연결된 클라이언트 정보를 다 가지고 있음
		//클라이언트 주소 : s.getRemoteSocketAddress()
		System.out.println(s.getRemoteSocketAddress()+" 클라이언트 접속 허락했습니다.");
		//접속을 기다리고 있다가 접속이 감지되면 수락-> Socket타입으로 반환
		//클라이언트와의 연결고리 : Socket s
//----------------------------------------------------------------------------		
		//4> 클라이언트 출력데이터를 입력 ==> 클라이언트로부터 데이터를 받음
		//getReadStream()은 없음
		InputStream in = s.getInputStream();
		Scanner sin = new Scanner(in); //소켓에서 넘어온 것을 읽음 
		String fromClient = sin.next(); 
		String fromClient2 = sin.next();
		//클라이언트가 문자열 정보를 보냈으므로 
		//-> 클라이언트가 어떻게 보내냐에 따라서 타입 정해줘야함
		//(만약, 공백 있으면 공백 수만큼 하거나 / nextLine()사용)
		//만약 nextLine()사용할거면 -> 클라이언트가 넘겨줄때 뒤에 '\n'를 붙여서 보내줘야함
		System.out.println(fromClient+fromClient2);
//---------------------------------------------------------------------------		
		//5> 클라이언트로 데이터를 출력
		OutputStream out = s.getOutputStream();
		PrintWriter pout = new PrintWriter(out);
		pout.write(fromClient+" 메세지를 잘 받았습니다.\n");//'\n'의미 : 여기까지가 Line임
		pout.flush();
//-------------------------------------------------------------------------
		//6> 접속 종료
		pout.close();
		sin.close();
		s.close();//소켓 사용시 네트워크 회선을 더이상 사용하지 않겠다고 종료
		System.out.println("클라이언트와 접속 해제되었습니다.");
		}
	}

}
