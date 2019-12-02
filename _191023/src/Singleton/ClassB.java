package Singleton;


//Singleton : �̱��� ����
//�����ڿ� private�� ���̴� type~
public class ClassB {
	private ClassB() {} //�����ڸ� private���� ����
	//������ �Ⱦ��� �ƴ���~ �Ⱦ����� �ȸ������~
	//�׷��� ClassB���ο��� ��ü�� ���� --> �̱���~
	//�ܺο��� ClassB�� ������ ����~ : ����? private~
	
	 private static ClassB singletonB = new ClassB();
	 //ClassB�� ������ ���� ���ϴϱ�(�ܺο���) ��ü�� ������ �ʰ� �ٷ� ����ϰ� static!
	//��ü�� �ϳ� ��������ϱ� �� ��ü�� �ٸ� �������� ����ϰ� �޼��带 �ϳ� ��������~
	
	static ClassB getInstance() {
		return singletonB;
	}

}
