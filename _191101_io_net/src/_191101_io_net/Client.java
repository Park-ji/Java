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
			+ " ������ ����");
	
	OutputStream out = s.getOutputStream();
	PrintWriter oput = new PrintWriter(out);
	oput.write("�α���ó�����ּ���\n");
	oput.write("id�� hr, ��ȣ�� hr�Դϴ�\n");
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
	System.out.println("Ŭ���̾�Ʈ��������");
}
}