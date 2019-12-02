package Interface;

//interface에 있는 메서드 ==> abstract 메서드
//interface에 있는 것==> 상수(static final)
public interface Remote {
	static final int MAX_VOLUME =10;
	int MIN_VOLUME = 0;
	
	//abstract 메서드 이므로 ==> 구현받은 클래스에서 무조건 정의해줘야해!
	void turnOn();  //아무것도 안적혀 있어도 --> abstract가 숩겨져 있는 것
	abstract void turnOff();
}

interface Remote2{
	static final int MAX_VOLUME =10;
	int MIN_VOLUME = 0;
	
	void setVolume(int volume);
	
}

