package UserException;

public class UserException extends Exception {
	UserException(){
		//input�� �ƹ��͵� �ȹ޴� ������
	}
	UserException(String message){
		super(message);
		//�θ�Ŭ������ �޼��� ����
		//UserException�� ���� ������ ����
		//ex, printStackTrace()�Լ��� ��Ÿ��
	}
	void printError() {
		System.out.println("���� �߻�");
	}

}
