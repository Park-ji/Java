package _191021;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();
		
		System.out.println(car.maker); // �����ڰ� new�� ������ ������ �����ǹǷ�!
		car.maker = "���������";
		System.out.println(car.maker);
		System.out.println(car2.maker);
	}

}
