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
System.out.println("���� 5555 ��Ʈ���� ����");
int cnt = 0;
while(true) {
Socket s = ss.accept();
System.out.println
(s.getInetAddress().getHostAddress()
		+ " Ŭ���̾�Ʈ ����");

InputStream in = s.getInputStream();
Scanner sin = new Scanner(in);
System.out.println(sin.nextLine());
System.out.println(sin.nextLine());

OutputStream out = s.getOutputStream();
PrintWriter oput = new PrintWriter(out);
oput.write("����α���"+ cnt++);
oput.write
("\n�׽�Ʈ��\nŬ���̾�Ʈ��������\n");
oput.flush();

sin.close();
oput.close();
s.close();
}

}
}