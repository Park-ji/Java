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

		// 자동형변환 ==> 부모가 자식을 받을때
		// 타입이 다르지만 자동으로 변해서 들어감
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		A a5 = new E();
		a.methodA();
		//a1.methodB(); //error! : a에 b클래스가 들어가있지만 methodB는 생기지 않는다 ==> 이유: a클래스에 못들어가서

		// 자식이 부모에 있는 객체를 받는다? 강제 형변환
		// B b1 = new A();//==> error!
		// 강제 형변환
		// 한번 자동형변환이 되었던 것만 강제 형변환이 가능함
		//B b1 = (B)a; //error!
		//C c1 = (C)a; //error!
		// b1 = (B)c1;//error! : 강제형변환이라고 무조건 가능한 것은 x ==> 상속관계(직속관계)가 아니므로 사용 x

		// 강제형변환을 시켜줄때의 문제점
		// 클래스 a<-b<-d / a<-c<-e 인 경우// 각 클래스에 method가 있을때
		
		//강제 형변환 하기전에 instanceof로 검사하고(자동형변환을 한적이 있는지) 강제형변환을 하면? 에러 안생김!!
		if(a instanceof B) {
		b = (B)a; // 강제형변환을 하고
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
