package nested_class;

import nested_class.A.C; //�̷��� CŬ������ �����Ҽ��� ����

public class Main {
	public static void main(String[] args) {
		A a = new A(); // Ŭ���� A�� heap�޸𸮿� �ö� => classA�� �ִ� ���� �� ����� �� �ִٴ� ��~
		
		//A.B b =  new A.B(); // BŬ������ ���ӵǾ� �ִ� ��? Ŭ����A�� ��üȭ �Ǿ��ִ� a�ȿ� ����
		// instance member class
		A.B b = a.new B(); //a��� ��ü�ȿ� �ִ� Ŭ���� B�� ȣ��
		b.field1 = 20;
		b.methodB();
		
		//static member class
		A.C c = new A.C(); //C�� ����Ÿ���̹Ƿ� -> Ŭ���� A�� ��������� ���� �޸𸮿� �ö� �ִ� ���� ==> ����, ���� � ��ü��
		//����� ������� �ʰ� direct�� ����ص� ����~
		
		
		a.c.field1 = 30;
		c.field1 = 30;
		c.methodC();
		c.field2 =40;
		A.C.field2 = 40; //�̷��� �ٰ����� �� : static �ʵ� �Լ��� ==> direct�� �ٰ����� ��~
		//static Ŭ�����ȿ� �ִ� static field member�̹Ƿ�
		c.methodC2();
		A.C.methodC2();
		
		a.methodA(); //���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		
	}

}
