package asuradaExample;

public class Car {
	// 필드명은 소문자, 클래스는 대문자~
	String name;
	int cc;
	String maker;
	int curSpeed;
	int maxSpeed;
	boolean power;
	int gas;
	char mode;

	Car(String name, String maker) {
		this.name = name; //this : 현재 소속되어 있는 클래스 객체를 의미(즉, Car 클래스에 있는 name을 의미? this.name) / this.name(클래스 안에 있는 name) = name(외부에서 들어온 name)
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
					System.out.println("최대속도입니다.");
			}
		}
		
		else if(power&&(gas>=20)&&(mode=='R')) {
			curSpeed -=30;
			gas-=20;
		}
		
		
		else {
				if(mode!='D') System.out.println("D모드로 바꿔주세요");
				if(0>=gas) System.out.println("가스를 충전시켜주세요");
				if(!power) System.out.println("전원을 켜주세요");			
		}
	}

	void stop() {
		transper('N');
		curSpeed -= 50;
		if (curSpeed < 0)
			curSpeed = 0;
	}
	
	void printSpeed() {
		System.out.println("현재 속도 = " + curSpeed);
	}

}
