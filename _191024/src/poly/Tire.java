package poly;

public class Tire {
	String location; // 타이어의 위치
	String brand; // 브랜드
	int inch; // 타이어의 크기
	// int maxrotation을 상수처리하려고 -> static final 붙이고 변수명을 대문자로 바꿈
	// static final int MAX_ROTATION = 1000; // 마모도
	int maxRotation = 1000;
	// 즉, 1000바퀴 이상 돌면 바퀴를 갈아야 된다는 소리
	int curRotation; // 현재 몇바퀴 돌아가는지

	private Tire(String location) { // 이렇게 생성되게 하는 것을 막기위해서? private으로 선언
		this.location = location;
	}

	Tire(String location, String brand, int inch, int maxRotation) {
		this(location); // 생성자에서 생정자 만들기
		this.brand = brand;
		this.inch = inch;
		this.maxRotation = maxRotation;
	}

	boolean roll() {// 바퀴가 돌았음을 의미~
		curRotation++;
		if (curRotation >= maxRotation) {
			System.out.println(location + "타이어를 바꿔주세요.");
		}
		return true;
	}

}
