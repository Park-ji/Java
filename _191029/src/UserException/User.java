package UserException;

public class User {
	
	
	
	
	//1. main���� => 2.run() ==> 3. i�� 5�� �Ǵ� ���� ���� �߻� =���� Ŭ���� �߻�&����  ==> 4. ������ throw�� throws�� ������(Ÿ���� ���ƾ���) ==> 5. ���� ������ catch�� ����(��ü�� ����! ex, e��ü) ==> 6. e.printstackTrace --> �����ڵ尡 ����
	//7. printStackTrace()�Լ��� ����Ŭ������ 'class UserException extends Exception'�� Exception�� �ִ� �Լ�
	
	public static void main(String[] args) {
		//������ �������� try-catch�� �޾ƾ���
		try {
		run();
		}catch(UserException e) {
			e.printStackTrace();
			//e.printError();
		}

	}
	
	//���ܸ� �������� ������
	//throw�� �����ؾߵǰ� heap�� ��ü�� �����ؼ� ������ �ϹǷ� new ����ϰ�
	//���� ������ run()�Լ��� throw���ְ� 
	//�׷��� ������ ������ try-catch�� ����	
	private static void run() throws UserException{
		for(int i=0; i<10;i++) {
			if(i==5) {//����Ÿ�̹��� �������� ��´�
				//1.
				//throw new UserException();//exception�߻�
				//��ǻ������ ������ ���ٰ�(userexception�� �߻��ߴٰ�) �����شٴ� �ǹ�
				//UserExcepiton�� Ŭ�����̹Ƿ� ��üȭ�� �ؼ� �Ѱ���� ��
				//���⼭ �߻��� ������ try-catch�� �޴��� thorw�� ���ؼ� ��������
				//���� 'throws Exception'���� ������ �ǰ�
				//'throws UserException'���� ������ ��
				
				//2.
				throw new UserException("i�� 5�϶� ������ �߻��Ǿ����ϴ�.");
			}
		}
	}

}


//��µ� ���� �޼���
//UserException.UserException
//printStackTrace()�� ���� ��
//at UserException.User.run(User.java:24)
//at UserException.User.main(User.java:14)


