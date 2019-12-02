package _191022;

//import _191021._191021.*;


public class Train {
	//필드
	//필드값에는 다양한 타입값을 사용할수 있음(클래스도 가능~)
	String name = "KTX"; //클래스를 만들면 생기는 것
	byte by;
	char ch;
	short sh;
	int in;
	long lo;
	float fl;
	double dou;
	boolean bool;
	int[] arr;
	//Car car = new Car();
	
	
	//생성자
	//- 생성자는 안적어도 생김
	//- 코드에서 좋은 것? 직관적으로 보면 알수 있게
	Train(){
		//new로 만들어서 객체화할때 제일먼저 실행됨 ==> 초기화 하는 용도로 많이 사용!
		System.out.println("Train()");
		name = "ITX새마을";
		//필드값에서 "KTX"라고 정의했지만 생성자가 호출되면서 "ITX새마을"이라고 초기화됨~
	}
	Train(String s){
		name = s;
		System.out.println("input값이 있는 생성자가 실행되었습니다.");
	}
	
	
	//매서드
	String run() {
		return "기차가 달립니다.";
	}

}
