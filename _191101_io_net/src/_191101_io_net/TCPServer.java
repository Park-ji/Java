package _191101_io_net;

//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
import java.net.*;
import java.util.*;
import java.io.*;
//cf) BindException error : �̹� ����ǰ� ������ �߻�
public class TCPServer {
	public static void main(String[] args) throws IOException{
		//1> ���� ���� : ip,port�� �����ؾ���
		//ip �ּҴ� ����ǻ���̹Ƿ� �������ص� ��
		ServerSocket ss = new ServerSocket(9999);//port��ȣ : 9999�� �Ҵ�
		//�ǹ�? ip�� port �˸��鼭 �����Ϸ��� �϶�� ��ǥ
		System.out.println("������ 9999��Ʈ���� ���۵Ǿ����ϴ�.");
//----------------------------------------------------------------------------	
		//2> Ŭ���̾�Ʈ ���
		//3> Ŭ���̾�Ʈ ���� �����Ǹ� ���� ���
		//������ �ϳ��̰� �����Ϸ��� Ŭ���̾�Ʈ�� �������̹Ƿ� ���ӽõ��Ҷ����� ����Ǿ����
		while(true) {//���ѷ���
		Socket s = ss.accept();
		//������ ���� �õ��ؼ� ������ ������ذ��̹Ƿ� ����� Ŭ���̾�Ʈ ������ �� ������ ����
		//Ŭ���̾�Ʈ �ּ� : s.getRemoteSocketAddress()
		System.out.println(s.getRemoteSocketAddress()+" Ŭ���̾�Ʈ ���� ����߽��ϴ�.");
		//������ ��ٸ��� �ִٰ� ������ �����Ǹ� ����-> SocketŸ������ ��ȯ
		//Ŭ���̾�Ʈ���� ����� : Socket s
//----------------------------------------------------------------------------		
		//4> Ŭ���̾�Ʈ ��µ����͸� �Է� ==> Ŭ���̾�Ʈ�κ��� �����͸� ����
		//getReadStream()�� ����
		InputStream in = s.getInputStream();
		Scanner sin = new Scanner(in); //���Ͽ��� �Ѿ�� ���� ���� 
		String fromClient = sin.next(); 
		String fromClient2 = sin.next();
		//Ŭ���̾�Ʈ�� ���ڿ� ������ �������Ƿ� 
		//-> Ŭ���̾�Ʈ�� ��� �����Ŀ� ���� Ÿ�� ���������
		//(����, ���� ������ ���� ����ŭ �ϰų� / nextLine()���)
		//���� nextLine()����ҰŸ� -> Ŭ���̾�Ʈ�� �Ѱ��ٶ� �ڿ� '\n'�� �ٿ��� ���������
		System.out.println(fromClient+fromClient2);
//---------------------------------------------------------------------------		
		//5> Ŭ���̾�Ʈ�� �����͸� ���
		OutputStream out = s.getOutputStream();
		PrintWriter pout = new PrintWriter(out);
		pout.write(fromClient+" �޼����� �� �޾ҽ��ϴ�.\n");//'\n'�ǹ� : ��������� Line��
		pout.flush();
//-------------------------------------------------------------------------
		//6> ���� ����
		pout.close();
		sin.close();
		s.close();//���� ���� ��Ʈ��ũ ȸ���� ���̻� ������� �ʰڴٰ� ����
		System.out.println("Ŭ���̾�Ʈ�� ���� �����Ǿ����ϴ�.");
		}
	}

}
