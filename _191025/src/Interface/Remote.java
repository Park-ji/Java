package Interface;

//interface�� �ִ� �޼��� ==> abstract �޼���
//interface�� �ִ� ��==> ���(static final)
public interface Remote {
	static final int MAX_VOLUME =10;
	int MIN_VOLUME = 0;
	
	//abstract �޼��� �̹Ƿ� ==> �������� Ŭ�������� ������ �����������!
	void turnOn();  //�ƹ��͵� ������ �־ --> abstract�� ������ �ִ� ��
	abstract void turnOff();
}

interface Remote2{
	static final int MAX_VOLUME =10;
	int MIN_VOLUME = 0;
	
	void setVolume(int volume);
	
}

