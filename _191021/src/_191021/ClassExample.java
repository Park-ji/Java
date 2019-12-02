package _191021;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();
		
		System.out.println(car.maker); // 생성자가 new를 만날때 무조건 생성되므로!
		car.maker = "람보르기니";
		System.out.println(car.maker);
		System.out.println(car2.maker);
	}

}
