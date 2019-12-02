package _191101_io_net;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
public static void main(String[] args)
throws Exception{
	Socket s = new Socket
			("127.0.0.1", 5555);
	System.out.println
	(s.getRemoteSocketAddress()
			+ " 서버로 접속");
	
	OutputStream out = s.getOutputStream();
	PrintWriter oput = new PrintWriter(out);
	oput.write("로그인처리해주세요\n");
	oput.write("id는 hr, 암호는 hr입니다\n");
	oput.flush();
	
	//Thread.sleep(5000);
	
	InputStream in = s.getInputStream();
	Scanner sin = new Scanner(in);
	System.out.println(sin.next());
	System.out.println(sin.next());
	System.out.println(sin.next());

	oput.close();
	sin.close();
	s.close();
	System.out.println("클라이언트연결해제");
}
}