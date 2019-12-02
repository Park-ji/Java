package Inheritance;

//부모 객체가 먼저 생성되고 자식 객체가 그 다음에 생성된다.

public class BMW extends Car {//자식클래스
	boolean booster = false;
	
	BMW(){
		super("BMW5");
		System.out.println("BMW() 생성자");
	}
	
	public static void main(String[] args) {
		BMW bmw = new BMW();
		//1. 부모 객체가 먼저 생성되서 model, curSpeed를 만들고
		//2. 자식 객체가 생성되서 booster가 만들어진다.
		
		bmw.model = "BMW525";
		System.out.println(bmw.model);
		System.out.println(bmw.curSpeed);
	}
}

