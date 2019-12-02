package Singleton;


//Singleton : 싱글톤 예제
//생성자에 private을 붙이는 type~
public class ClassB {
	private ClassB() {} //생성자를 private으로 만듦
	//하지만 안쓸거 아니죠~ 안쓸꺼면 안만들었죠~
	//그래서 ClassB내부에서 객체를 만듦 --> 싱글턴~
	//외부에서 ClassB를 만들지 못해~ : 이유? private~
	
	 private static ClassB singletonB = new ClassB();
	 //ClassB를 생성을 하지 못하니까(외부에서) 객체를 만들지 않고 바로 사용하게 static!
	//객체를 하나 만들었으니까 이 객체를 다른 곳에서도 사용하게 메서드를 하나 만들어야해~
	
	static ClassB getInstance() {
		return singletonB;
	}

}
