package _191021;

public class Car {
	
	Car(){
		System.out.println("Car() 생성자");
		maker = "기아";
	}
	String maker = "현대";
	String carName = "소나타";
	
	void run(String key) {
		System.out.println("달린다.");
	}

}
