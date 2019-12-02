package _191101_io_net;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws IOException {
		//1> ���� ���� ��û ==> ������ 3��
		Socket s = new Socket("127.0.0.1",9999); //ip�ּ�, ��Ʈ��ȣ
		//Socket s = new Socket("192.168.15.23",9999); //����pc �ּ�
		//ip, port �߸� ����? ���ϴ� ���� ���α׷� ��ã�� �ٿ��
		//cf) 127.0.0.1 : �� ��ǻ������ �ǹ�!
		//������ ���� �̸� : s.getRemoteSocketAddress() //���� �������� ����� ���� �ּҾ�� ���̹Ƿ�
		System.out.println(s.getRemoteSocketAddress()+" ������ �����߽��ϴ�.");
//-------------------------------------------------------------------------------		
		//2> ������ �����͸� ��� ==> ������ 4�� (�����͸� ������ ����)
		//s.getOutputStream(); //1byte������ ��� -> �ѱ��� ���� ex)"�ȳ�" : 4byte
		OutputStream out = s.getOutputStream();
		//Output�Ҷ� �ڵ� ����ȯ ���༭ ���ִ� ���� : PrintWriter => Scanner(�Է�)�� ����� ����
		PrintWriter pout = new PrintWriter(out);
		pout.write("�׽�Ʈ ���ڿ� ");//out�� ������� string�� ������
		//pout.close();//�̷��� ���� ���� ������ ���������� ���� --> ���� x
		pout.flush();//���ݱ��� ��³��븸 ������ �����ϰ� ��¹��۸� ������ڴ�!
//---------------------------------------------------------------------------		
		//3> ������ �Է� ==> ������ 5��
		InputStream in = s.getInputStream();
		Scanner sin = new Scanner(in); //���Ͽ��� �Ѿ�� ���� ���� 
		String fromServer = sin.nextLine(); 
		System.out.println(fromServer);
//---------------------------------------------------------------------------		
		//4> ���� ����
		pout.close();
		sin.close();
		s.close();
		System.out.println("�������� ������ �����Ǿ����ϴ�.");
	}

}

//��Ʈ��ũ ���α׷��� �Ҷ��� : Console->����;����� ->���ﰢ�� ����->�ܼ�â ���� ����
//Ŭ���̾�Ʈ ���� ����? ���� ���� �����س�����