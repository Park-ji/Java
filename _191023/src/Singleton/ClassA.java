package Singleton;

public class ClassA {
	//ClassB b = new ClassB(); // 같은 패기지 내에 있으므로 가능~
	//ClassB에서 생성자를 private으로 선언해서 안되요~
	
	public static void main(String[] args) {
		ClassB b1 = ClassB.getInstance();
		ClassB b2 = ClassB.getInstance();
		
		//클래스B에서 객체를 하나만 만들었으므로 
		//b1과 b2는 같은 객체라고 할수있따~
		
		//주소값을 찍어보면 같아요~
		System.out.println(b1);
		System.out.println(b2);
	}
	
	//ClassB b = ClassB.getInstance();//static을 사용하면 객체 만들 필요없이 바로 사용가능하니까
	//여기서 ClassB안에 메서드를 static으로 선언하면 되죠~

}
