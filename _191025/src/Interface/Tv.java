package Interface;

public class Tv implements Remote,Remote2 {//implements : �����ϴ�
	
	private int volume;
	
	//interface���� �޼���� public abstract�� �����Ǿ� �����Ƿ�
	//���������ڰ� public�� �ƴϸ� ������ ��!
	public void turnOn() {
		System.out.println("���� ����");
	}
	public void turnOff() {
		System.out.println("���� ����");
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
