package abstract_class;

public abstract class Animal {
	
	String kind;
	
	Animal(){
		System.out.println("Animal() 호출");
	}
	
	abstract void Sound();
	//상속받는 자식클래스에서 무조건 선언해줘야하는 함수~
	
	
	
	
	public void breathe() {
		
	}

}
