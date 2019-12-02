package asuradaExample;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("asurada","dio");
		System.out.println(car.name);
		System.out.println(car.maker);
//		car.run();
//		car.printSpeed();
//		car.power = true;
//		car.run();
//		car.printSpeed();
		car.charge(100);//기름을 채움
		car.powerOn();//시동
		car.mode='D';//기어넣고
		car.run();
		car.run();
		car.run();
		car.run();
		car.run();
		car.printSpeed();
		
	}

}

