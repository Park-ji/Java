package nested_class;

public class A {
	
	A(){ //생성자가 호출됨? 객체가 만들어짐
		System.out.println("A()");
	}
	
	B b = new B(); //new : 객체 생성(==> 생성자 호출)
	C c = new C();
	
	//D d = new D(); //생성자 D를 찾지 못함 == 클래스 D를 찾지 못함 --> 눈에 보이지 않는 클래스 취급 (이유? 여기는 classA의 필드값이므로, D클래스는 methodA가 호출되어야 만들어지 --> local 변수이므로)
	
	class B{ // 인스턴스 클래스(외부에서 클래스를 만들기 전에는 존재하지 않는 클래스)
		B(){
			System.out.println("B()");
		}
		int field1; //인스턴스 필드값
		//static int field2; //클래스 b가 존재하지 않더라도 그냥 존재함 (이유? static으로 선언되어있으므로)
		void methodB() {}
		//static void methodB2(){} //클래스 b가 존재하지 않더라도 존재하는 필드 메서드
	
	}
	
	//A,C랑 묶어서 다녀라는 의미~
	static class C{ // 정적 클래스 : static이므로 classA가 생성되기 전에 이미 메모리에 적재되어있는 클래스이므로 : classC필드에서는 static필드값을 사용할수 있다.
		C(){
			System.out.println("C()");
		}
		int field1;
		static int field2;
		void methodC() {}
		static void methodC2() {}
		
	}
	
	void methodA() {// 메서드 안에 클래스 만들기~
		//methodA에서 사용하는 classD는 메인 함수에서 객체를 만들어서 사용하는 것이 x (따라서, 밑에서 객체 생성까지 마무리한것임)
		//methodA에서 사용하고 끝내는 클래스 : classD
		class D{
			D(){
				System.out.println("D()");
			}
			int field1;
//			static int field2; //methodA가 만들어지지 않았는데(classA가 만들어지지 않았으므로) static필드값은 사용할 수 없다.
			void methodD() {}
//			static void methodD2() {}
		}
		
		D d = new D(); //여기서 객체를 만듦 
		d.field1 = 3;
		d.methodD();
		System.out.println(d.field1);
		//선언 vs 호출
	}
	

}
