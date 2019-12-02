package poly;

public class Car {
	Tire leftFront;
	Tire leftBack;
	Tire rightFront;
	Tire rightBack;

	// tire을 따로따로 선언~ : 전체적인 디자인
	Tire[] tire = { new Han("lf", 15), new Han("rf", 15), new Han("lb", 15), new Han("fb", 15) };
	// tire배열에 원하는 객체를 하나씩 넣어줘야함!

//	Car(){
//		leftFront = new Han();
//		leftBack = new Kumho();
//		rightFront = new Han();
//		rightBack = new Kumho();
//	} //이렇게 말고 배열에 넣음~

	void engin(int roll) {// engine이 한번 호출될때마다 타이어 한바퀴씩 돌음~
		for (int j = 0; j < roll; j++) {
			for (int i = 0; i < 4; i++) {
				tire[i].roll();
			}
		}

	}

}
