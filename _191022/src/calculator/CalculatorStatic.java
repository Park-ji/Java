package calculator;

public class CalculatorStatic {
	static double pi = 3.14159;
	//static final double pi = 3.14159;
	//final�̶�� ���� ���̸�? ���� ������ �� ���� ==> ����� ����
	//�̸� �޸𸮿� �ö�� �ִ� static�� ���� ������������� final������ doubleŸ���� pi�� ����
	//static�� main�Լ��� ���ᰡ �Ǿ �޸𸮿� ��������
	
	static int plus(int x, int y) {
		return x+y;
	}
	static {
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
	}
	
	//String str = null;
	//str = "abc" + "def"; // �ڵ尡 ���ư��°��� Ŭ�������� �ʵ尡 �ƴ϶� �޼��忡�� �۵��� ������
	//������ String �տ� static�� �����ϸ� ����!
	//����? static���� �ִ� ���� �޸𸮿� �ö󰡹Ƿ� -> ���ǿ� �����ϴ� ���� �� -> �ڵ��� ������
	//static��� �ȿ��� �ڵ��� ��������
	
	
	//��,
	static String str = null;
//	String strdy = null;
	//static�̹Ƿ� class�ȿ����� ������ ���� �ƴ϶� ������ �޸𸮿� ����Ǿ��մ�(=Ram�ȿ� �ִ�) ������
	static {
		str = "abc" + "def"; //�׷��� �� ������ ��������!
//		strdy = "abc" + "def"; //strdy�� ���� �޸𸮿� ����Ǿ��ִ� ���� �ƴ϶�
		//���� ���·� �Ǿ� �����Ƿ� ������ �Ұ����Ѱ���!
		//this -> heap�� �ö�� ��ü�� �ǹ��� ==> ����, this.strDy�� �ȵ�!
		//heap�� �ö󰡱⵵ ���� �޸𸮿� �ø��� static�ȿ����� �翬�� this�� �ȵ�!
		int b = 1;
		int c = 1;
		int d = 1;
	}
	
	public static void main(String[] args) {
		double result1 = 10*10*CalculatorStatic.pi;
		int result2 = CalculatorStatic.plus(10, 20);
		//main�� ȣ��Ǳ� ���� �̹� �޸𸮿� static�� ����Ǿ��ֱ� ������  heap�� ���Ӱ� �޸� �Ҵ� �ϴ� ������ �������Ƿ�
		//�ӵ��� ����������, �޸𸮰� �����Ҽ� ����
		
		final int a = 100; //a�� ���̻� ���� �ٲ� �� ���� --> main�Լ��� ���ᰡ �Ǹ� a�� �����
		
	}

}
