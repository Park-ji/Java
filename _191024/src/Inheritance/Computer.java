package Inheritance;

public class Computer extends Calculator {
	int ch;
	double r;
	Computer(int ch, double r){
		this.ch = ch;
		this.r = r;
	}
	
	@Override//컴퓨터가 인식하기 편함 --> 적지않는다고해서 컴파일이 안되는 것은 아님
	double areaCircle(double r) {
		
		if (ch == 1) {
			System.out.println("Computer.areaCircle()");
			return Math.PI * r * r;// Math.PI --> 상수}
		} else
			return super.areaCircle(r);
		//super : 부모 객체를 가르킴
		//super.메서드 ==> 오버라이딩 되기 전의 함수를 의미
	}

}
