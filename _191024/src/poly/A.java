package poly;

public class A {
	void methodA() {
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		

		A a1 = null;
		a = a1;
		a = b;
		//a = c;
		//a = d;
		//a = e;

		// �ڵ�����ȯ ==> �θ� �ڽ��� ������
		// Ÿ���� �ٸ����� �ڵ����� ���ؼ� ��
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		A a5 = new E();
		a.methodA();
		//a1.methodB(); //error! : a�� bŬ������ �������� methodB�� ������ �ʴ´� ==> ����: aŬ������ ������

		// �ڽ��� �θ� �ִ� ��ü�� �޴´�? ���� ����ȯ
		// B b1 = new A();//==> error!
		// ���� ����ȯ
		// �ѹ� �ڵ�����ȯ�� �Ǿ��� �͸� ���� ����ȯ�� ������
		//B b1 = (B)a; //error!
		//C c1 = (C)a; //error!
		// b1 = (B)c1;//error! : ��������ȯ�̶�� ������ ������ ���� x ==> ��Ӱ���(���Ӱ���)�� �ƴϹǷ� ��� x

		// ��������ȯ�� �����ٶ��� ������
		// Ŭ���� a<-b<-d / a<-c<-e �� ���// �� Ŭ������ method�� ������
		
		//���� ����ȯ �ϱ����� instanceof�� �˻��ϰ�(�ڵ�����ȯ�� ������ �ִ���) ��������ȯ�� �ϸ�? ���� �Ȼ���!!
		if(a instanceof B) {
		b = (B)a; // ��������ȯ�� �ϰ�
		b.methodA();
		b.methodB();
		}

	}

}

class B extends A {
	@Override
	void methodA() {
		System.out.println("AB");
	}

	void methodB() {
		System.out.println("B");
	}
}

class C extends A {
	void methodC() {
	}
}

class D extends B {
	void methodD() {
	}
}

class E extends C {
	void methodE() {
	}
}
