package _191101_io_net;

import java.io.IOException;

public class KeyboardTest {

	public static void main(String[] args) {
		//System.in.read(); //��ȯ Ÿ�� : int
		//error!
		//read�� inputstream�� �޼ҵ带 ���
		//read�� ����ο� throws IOException�� ������ ����
		//����ó���� ����ڰ� ���� �������(���� �ǹ� : ���� ���Ҳ��ϱ� �ʳװ� ��)
		
//		System.out.println("���� �ϳ��� �Է��ϼ���");
//		try {
//			//main�����ϸ� Ű���忡�� �Է��� �ޱ����� ��ٸ�
//			int result = System.in.read();
//			//Ű���忡�� �� �ϳ��� ���� �ϳ��� �Է��� �ް�
//			System.out.println(result);
//			//����Ϳ� ����Ѵ�
//			//ex, 'a'�Է½� '97'���
//			//����? ��ǻ�ʹ� ���������� �������� : ��, ���� �����
//			//cf, ����'0'���� �Է��� �� ��ǻ�ʹ� ���ڰ� �ƴ� ���ڷ� �� => 48�� ��µ�
//			System.out.println((char)result);
//			//int���� ����ȯ
//		}catch(IOException e) {
//			e.printStackTrace();
//			//���� e �߻���, �����ؼ� Stack�� �׿��ִ�(�޸𸮿� �׿��ִ�) ������ �˷���!
//			
//		}
//		
		//�ѹ��� �ƴ϶� ������ �ް� ������?
		try {
			int result = 0;
			while((result = System.in.read())!=-1) {
				//���� -1�� ����? Ű���� �Է��� �ߴ� ��ų��
				//Ű���� �Է� �ߴ� : ctrl+z
				//�ѱ��Է½� ? ���� ����(�Ѱ�)
				System.out.println((char) result);
				//println vs print
				//os�� �������϶� -> read���� buffer�� /n�Է½� : /n, /r�� ���� ����
			}//while end
		}catch(IOException e) {
			e.printStackTrace();
		}//catch end		
	}

}
