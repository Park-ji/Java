package Inheritance;

public class Car extends Horse { //�θ� Ŭ����
	String model;
	int curSpeed;
	
	Car(){
		System.out.println("Car() ������");
	}
	Car(String model){
		System.out.println("Car(model) ������");
		this.model = model;
	}
}
