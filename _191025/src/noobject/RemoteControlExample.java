package noobject;

//�͸� ��ü : Ŭ������ �������� �ʰ� ��ü�� �����ϴ� ��� ==> ������ �Ұ����� Ŭ����(��ü�� 1�� ����� �뵵!)

public class RemoteControlExample {
	public static void main(String[] args) {
		//�͸�ü�� ���? �� �ѹ��� ��ü�� ����
		RemoteControl remote = new RemoteControl(){
			//���� �������̽��� �����ڰ� �Ұ����ѵ� �͸����� ������ ��ü �������
			//�͸�ü�� Ŭ������ �ƴ�
			public void setVolume(int volume) {
				System.out.println("���� : " + volume);
			}		
		}; //���⼭ ';'���ϸ� �ȵ� ==> ���� : �׳� ��ü�� ������ ���๮����� ����
		
		remote.setVolume(100);
		
	}

}
