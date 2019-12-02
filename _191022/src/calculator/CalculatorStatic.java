package calculator;

public class CalculatorStatic {
	static double pi = 3.14159;
	//static final double pi = 3.14159;
	//final이라는 예약어를 붙이면? 값을 변경할 수 없음 ==> 상수로 만듦
	//미리 메모리에 올라와 있는 static에 값을 변경하지말라는 final예약어로 double타입의 pi가 생김
	//static은 main함수가 종료가 되어도 메모리에 남아있음
	
	static int plus(int x, int y) {
		return x+y;
	}
	static {
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
	}
	
	//String str = null;
	//str = "abc" + "def"; // 코드가 돌아가는것은 클래스에서 필드가 아니라 메서드에서 작동이 가능함
	//하지만 String 앞에 static을 선언하면 가능!
	//이유? static으로 넣는 순간 메모리에 올라가므로 -> 현실에 존재하는 것이 됨 -> 코딩이 가능함
	//static블록 안에서 코딩이 가능해짐
	
	
	//즉,
	static String str = null;
//	String strdy = null;
	//static이므로 class안에서라도 가상의 것이 아니라 실제로 메모리에 적재되어잇는(=Ram안에 있는) 변수임
	static {
		str = "abc" + "def"; //그래서 이 연산이 가능해짐!
//		strdy = "abc" + "def"; //strdy는 아직 메모리에 적재되어있는 것이 아니라
		//파일 형태로 되어 있으므로 연산이 불가능한것임!
		//this -> heap에 올라온 객체를 의미함 ==> 따라서, this.strDy도 안됨!
		//heap에 올라가기도 전에 메모리에 올리는 static안에서는 당연히 this가 안됨!
		int b = 1;
		int c = 1;
		int d = 1;
	}
	
	public static void main(String[] args) {
		double result1 = 10*10*CalculatorStatic.pi;
		int result2 = CalculatorStatic.plus(10, 20);
		//main이 호출되기 전에 이미 메모리에 static은 적재되어있긴 때문에  heap에 새롭게 메모리 할당 하는 과정이 없어지므로
		//속도는 빨라지지만, 메모리가 부족할수 있음
		
		final int a = 100; //a는 더이상 값을 바꿀 수 업음 --> main함수가 종료가 되면 a는 사라짐
		
	}

}
