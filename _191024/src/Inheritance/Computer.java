package Inheritance;

public class Computer extends Calculator {
	int ch;
	double r;
	Computer(int ch, double r){
		this.ch = ch;
		this.r = r;
	}
	
	@Override//��ǻ�Ͱ� �ν��ϱ� ���� --> �����ʴ´ٰ��ؼ� �������� �ȵǴ� ���� �ƴ�
	double areaCircle(double r) {
		
		if (ch == 1) {
			System.out.println("Computer.areaCircle()");
			return Math.PI * r * r;// Math.PI --> ���}
		} else
			return super.areaCircle(r);
		//super : �θ� ��ü�� ����Ŵ
		//super.�޼��� ==> �������̵� �Ǳ� ���� �Լ��� �ǹ�
	}

}
