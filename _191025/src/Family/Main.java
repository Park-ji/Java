package Family;

public class Main {
	public static void main(String[] args) {
		Parent parent;
		Child child = new Child();
		//자동 형변환
		parent = new Child();//부모객체에 자식객체를 할당!
		//타입은 parent지만 안에 들어있는것은 Child객체
		//Child가 새롭게 필드값을 새롭게 정의해도 타입이 parent이기때문에
		//parent에 정의되어있는 만큼만 받을 수 있음
		//즉, Child의 field2 필드값과 method2 메소드값은 담기지않음(Parent에는 없으니까~)
		
		//당연한 결과~
		System.out.println(child.field1); //child에서 field1을 가지고옴
		child.method1();
		child.method2();
		
		//자동형변환
		System.out.println(parent.field1);//parent에서 field1을 가지고옴
		parent.method1();//Child가 Parent의 상속을 받고 있으므로 method1 실행 가능~
		//method는 child에서 오버라이드 한것은 가지고 옴
		//parent.method2();//error! : Parent가 가지고 있는 필드, 메소드값으로만 접근이 가능해~
		
		
		//강제 형변환
		//1. Child를 Parent타입으로 자동 형변환 되어있음
		//2. 되어있는 것을 다시 Child타입으로 다시 바꿀수 있음 -->강제형변환
		
		Child child2 = (Child)parent;
		System.out.println(child2.field1);
		child2.method1();
		child2.method2();//다시 Child타입으로 형변환 했으므로 --> method2에 접근이 가능하다~
		
	}


}
