package calculator;

public class Calculator {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.minu(20,10));
	}
	
	//�������� Power --> Ŭ�����ȿ��� �� ���� ����
	boolean Power = false; //���򿡴� �����ڿ��� �ʱ�ȭ���� �ʵ尪���� �ʱ�ȭ �ϴ���~
	
	
	int add(int x, int y) {
		//���ú���, ��������(add�Լ��ȿ����� ���� ����)
		if(Power)
		return x+y;
		System.out.println("������ ���ּ���.");
		return 0;
	}
	
	int minu(int x, int y) {
		if(Power)
		return x-y;
		System.out.println("������ ���ּ���.");
		return 0;
	}
	
	int mux(int x, int y) {
		
		return x*y;
	}
	
	int div(int x, int y) {
		return x/y;
	}
	
	
	

}
