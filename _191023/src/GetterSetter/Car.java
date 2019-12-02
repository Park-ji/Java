package GetterSetter;

public class Car {
	
	private int curSpeed;
	
	int getter() {
		return curSpeed;
	}
	
	void setter(int curSpeed) {
		this.curSpeed = curSpeed;
		
	}
	
	public static void main(String[] args) {
		Engineer engin = new Engineer(10);
		engin.control();
		
	}
}

class Engineer{
	
	Car car = new Car();
	Engineer(){}
	Engineer(int curSpeed){
		//Car car = new Car();
		car.setter(curSpeed);
	}
	void control() {
		//Car car = new Car();
		//car.curSpeed = 0; // private으로 접근제한 되므로 x
		//car.setcurSpeed(0);
		System.out.println(car.getter());
	}
}
