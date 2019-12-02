package calculator;

public class Calculator {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.minu(20,10));
	}
	
	//전역변수 Power --> 클래스안에서 다 접근 가능
	boolean Power = false; //요즘에는 생성자에서 초기화보단 필드값으로 초기화 하더라~
	
	
	int add(int x, int y) {
		//로컬변수, 지역변수(add함수안에서만 접근 가능)
		if(Power)
		return x+y;
		System.out.println("전원을 켜주세요.");
		return 0;
	}
	
	int minu(int x, int y) {
		if(Power)
		return x-y;
		System.out.println("전원을 켜주세요.");
		return 0;
	}
	
	int mux(int x, int y) {
		
		return x*y;
	}
	
	int div(int x, int y) {
		return x/y;
	}
	
	
	

}
