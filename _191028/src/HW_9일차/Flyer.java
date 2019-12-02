package HW_9ÀÏÂ÷;

public interface Flyer {
	int fast = 100;
	void fly();
	boolean isAnimal();
}

class Bird implements Flyer{
	public void fly() {
		System.out.println("Bird flying");
	}
	public boolean isAnimal() {
		return true;
	}
}

class Airplane implements Flyer{
	public void fly() {
		System.out.println("Airplane flying");
	}
	public boolean isAnimal() {
		return false;
	}
}

class FlyerUtil{
	static void show(Flyer f) {
		f.fly();
		System.out.println(f.isAnimal());
	}
}