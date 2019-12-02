package _191101_io_net;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
public static void main(String[] args) 
throws Exception{

ServerSocket ss = new ServerSocket(5555);
System.out.println("서버 5555 포트에서 시작");
int cnt = 0;
while(true) {
Socket s = ss.accept();
System.out.println
(s.getInetAddress().getHostAddress()
		+ " 클라이언트 접속");

InputStream in = s.getInputStream();
Scanner sin = new Scanner(in);
System.out.println(sin.nextLine());
System.out.println(sin.nextLine());

OutputStream out = s.getOutputStream();
PrintWriter oput = new PrintWriter(out);
oput.write("정상로그인"+ cnt++);
oput.write
("\n테스트중\n클라이언트에게전송\n");
oput.flush();

sin.close();
oput.close();
s.close();
}

}
}