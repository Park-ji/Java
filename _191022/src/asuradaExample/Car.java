package asuradaExample;

public class Car {
	// �ʵ���� �ҹ���, Ŭ������ �빮��~
	String name;
	int cc;
	String maker;
	int curSpeed;
	int maxSpeed;
	boolean power;
	int gas;
	char mode;

	Car(String name, String maker) {
		this.name = name; //this : ���� �ҼӵǾ� �ִ� Ŭ���� ��ü�� �ǹ�(��, Car Ŭ������ �ִ� name�� �ǹ�? this.name) / this.name(Ŭ���� �ȿ� �ִ� name) = name(�ܺο��� ���� name)
		cc = 5000;
		this.maker = maker;
		curSpeed = 0;
		maxSpeed = 300;
		power = false;
		gas = 0;
		mode = 'N'; 
	}
	
	void transper(char mode) {
		if(power) {
		this.mode = mode;
		}
	}
	
	
	void charge(int gas) {
		this.gas+=gas;
	}
	
	void powerOn() {
		if(gas>0) this.power = true;
	}
	
	void powerOff()
	{
		this.power = false;
	}
	
	void run() {
		if (power&&(gas>=20)&&(mode=='D')) {
				curSpeed += 30;
				gas -= 20;
				if (curSpeed >= 300) {
					curSpeed = 300;
					gas-=20;
					System.out.println("�ִ�ӵ��Դϴ�.");
			}
		}
		
		else if(power&&(gas>=20)&&(mode=='R')) {
			curSpeed -=30;
			gas-=20;
		}
		
		
		else {
				if(mode!='D') System.out.println("D���� �ٲ��ּ���");
				if(0>=gas) System.out.println("������ ���������ּ���");
				if(!power) System.out.println("������ ���ּ���");			
		}
	}

	void stop() {
		transper('N');
		curSpeed -= 50;
		if (curSpeed < 0)
			curSpeed = 0;
	}
	
	void printSpeed() {
		System.out.println("���� �ӵ� = " + curSpeed);
	}

}
