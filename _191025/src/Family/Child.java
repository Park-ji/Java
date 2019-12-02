package Family;

public class Child extends Parent{
	int field1 = 30;
	//field1을 새롭게 재정의함 --> Parent에서 정의한 field1은 잊어버림~
	int field2 = 20;
	
	@Override
	//오버라이드는 힙에서 서로 주소값이 연결되어있음
	void method1() {
		System.out.println("Child.method1");
	}
	
	void method2() {
		System.out.println("Child.method2");
	}

}
