package nested_class;

import nested_class.A.C; //이렇게 C클래스에 접근할수도 있음

public class Main {
	public static void main(String[] args) {
		A a = new A(); // 클래스 A가 heap메모리에 올라감 => classA에 있는 것을 다 사용할 수 있다는 말~
		
		//A.B b =  new A.B(); // B클래스가 종속되어 있는 곳? 클래스A가 객체화 되어있는 a안에 있음
		// instance member class
		A.B b = a.new B(); //a라는 객체안에 있는 클래스 B를 호출
		b.field1 = 20;
		b.methodB();
		
		//static member class
		A.C c = new A.C(); //C는 정적타입이므로 -> 클래스 A가 만들어지기 전에 메모리에 올라가 있는 상태 ==> 따라서, 굳이 어떤 객체를
		//만들고 사용하지 않고 direct로 사용해도 가능~
		
		
		a.c.field1 = 30;
		c.field1 = 30;
		c.methodC();
		c.field2 =40;
		A.C.field2 = 40; //이렇게 다가가면 됨 : static 필드 함수는 ==> direct로 다가가도 됨~
		//static 클래스안에 있는 static field member이므로
		c.methodC2();
		A.C.methodC2();
		
		a.methodA(); //로컬 클래스 객체 생성을 위한 메소드 호출
		
	}

}
