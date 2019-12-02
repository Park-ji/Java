package nested_class;

public class A {
	
	A(){ //�����ڰ� ȣ���? ��ü�� �������
		System.out.println("A()");
	}
	
	B b = new B(); //new : ��ü ����(==> ������ ȣ��)
	C c = new C();
	
	//D d = new D(); //������ D�� ã�� ���� == Ŭ���� D�� ã�� ���� --> ���� ������ �ʴ� Ŭ���� ��� (����? ����� classA�� �ʵ尪�̹Ƿ�, DŬ������ methodA�� ȣ��Ǿ�� ������� --> local �����̹Ƿ�)
	
	class B{ // �ν��Ͻ� Ŭ����(�ܺο��� Ŭ������ ����� ������ �������� �ʴ� Ŭ����)
		B(){
			System.out.println("B()");
		}
		int field1; //�ν��Ͻ� �ʵ尪
		//static int field2; //Ŭ���� b�� �������� �ʴ��� �׳� ������ (����? static���� ����Ǿ������Ƿ�)
		void methodB() {}
		//static void methodB2(){} //Ŭ���� b�� �������� �ʴ��� �����ϴ� �ʵ� �޼���
	
	}
	
	//A,C�� ��� �ٳ��� �ǹ�~
	static class C{ // ���� Ŭ���� : static�̹Ƿ� classA�� �����Ǳ� ���� �̹� �޸𸮿� ����Ǿ��ִ� Ŭ�����̹Ƿ� : classC�ʵ忡���� static�ʵ尪�� ����Ҽ� �ִ�.
		C(){
			System.out.println("C()");
		}
		int field1;
		static int field2;
		void methodC() {}
		static void methodC2() {}
		
	}
	
	void methodA() {// �޼��� �ȿ� Ŭ���� �����~
		//methodA���� ����ϴ� classD�� ���� �Լ����� ��ü�� ���� ����ϴ� ���� x (����, �ؿ��� ��ü �������� �������Ѱ���)
		//methodA���� ����ϰ� ������ Ŭ���� : classD
		class D{
			D(){
				System.out.println("D()");
			}
			int field1;
//			static int field2; //methodA�� ��������� �ʾҴµ�(classA�� ��������� �ʾ����Ƿ�) static�ʵ尪�� ����� �� ����.
			void methodD() {}
//			static void methodD2() {}
		}
		
		D d = new D(); //���⼭ ��ü�� ���� 
		d.field1 = 3;
		d.methodD();
		System.out.println(d.field1);
		//���� vs ȣ��
	}
	

}
