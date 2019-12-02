package _191101_io_net;

import java.net.InetAddress;
import java.net.UnknownHostException;


//getLocalHost()���� �߻��Ҽ� �ִ� ���ܸ� ���� Unknown~Exception�� ���� �ص� ������
//Exception�� ������ ���൵ ok ==> throws Exception
public class IPTest {
	public static void main(String[] args) throws UnknownHostException  {
		//1) cmd -> ipconfig /all ��  ip�ּ� Ȯ�� ==> windows(os)���� ����
		//2) java�� �̿��� ip�ּ� Ȯ��
		System.out.println("�� ��ǻ�� ip = "+ InetAddress.getLocalHost().getHostAddress() );
		//�� ��ǻ���� ip�� Ȯ���ϴ� static method

		
		//www.daum.net�� ������ �����ϰ� ������?
		//����ǻ�ʹ� Ŭ���̾�Ʈ�� ��
		//Ŭ���̾�Ʈ�� ������ �����ϰ� ������? ip, port�˾ƾ���
		//ip+port�� �ϳ��� ��� --> �ϳ��� �̸��� �ο��ϰ� ����� ���� : domain(�ߺ� x)
		//ex) www.daum.net : domain
		
		//�Ű����� host => domain�Է�
		//getAllByName : �ش� domain�� ���õȰ� �� ��~
		//���ͳ� ������ �Ǿ�� ����!
		InetAddress[] domains 
		= InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress i : domains) {
			System.out.println(i);
		}
		
		
	}
}

