package poly;

public class Car {
	Tire leftFront;
	Tire leftBack;
	Tire rightFront;
	Tire rightBack;

	// tire�� ���ε��� ����~ : ��ü���� ������
	Tire[] tire = { new Han("lf", 15), new Han("rf", 15), new Han("lb", 15), new Han("fb", 15) };
	// tire�迭�� ���ϴ� ��ü�� �ϳ��� �־������!

//	Car(){
//		leftFront = new Han();
//		leftBack = new Kumho();
//		rightFront = new Han();
//		rightBack = new Kumho();
//	} //�̷��� ���� �迭�� ����~

	void engin(int roll) {// engine�� �ѹ� ȣ��ɶ����� Ÿ�̾� �ѹ����� ����~
		for (int j = 0; j < roll; j++) {
			for (int i = 0; i < 4; i++) {
				tire[i].roll();
			}
		}

	}

}
