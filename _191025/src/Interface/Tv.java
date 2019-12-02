package Interface;

public class Tv implements Remote,Remote2 {//implements : 구현하다
	
	private int volume;
	
	//interface에서 메서드는 public abstract가 생략되어 있으므로
	//접근제한자가 public이 아니면 에러가 뜸!
	public void turnOn() {
		System.out.println("전원 켜짐");
	}
	public void turnOff() {
		System.out.println("전원 꺼짐");
	}
	
	public void setVolume(final int volume) {
		if((volume>=Remote2.MIN_VOLUME)&&(volume<=Remote2.MAX_VOLUME))
		this.volume = volume;
	}
	
	int getVolume() {
		return volume;
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(10);
		System.out.println(tv.getVolume());
	}

}
