package Family;

public class Child extends Parent{
	int field1 = 30;
	//field1�� ���Ӱ� �������� --> Parent���� ������ field1�� �ؾ����~
	int field2 = 20;
	
	@Override
	//�������̵�� ������ ���� �ּҰ��� ����Ǿ�����
	void method1() {
		System.out.println("Child.method1");
	}
	
	void method2() {
		System.out.println("Child.method2");
	}

}
