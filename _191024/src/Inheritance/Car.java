package Inheritance;

public class Car extends Horse { //부모 클래스
	String model;
	int curSpeed;
	
	Car(){
		System.out.println("Car() 생성자");
	}
	Car(String model){
		System.out.println("Car(model) 생성자");
		this.model = model;
	}
}
