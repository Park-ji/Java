package Starcraft;

public class Unit {
	int hp;
	int mp;
	int attackAirLevel;
	int attackGroundLevel;
	String type = null;
	int armor;
	int speed;
	int x;
	int y;
	
	final void move(int x, int y) {//final사용해서 오버라이딩을 막음
		//평면 상에서 x,y
		if((x > 0)&&(y>0)&&(x<256)&&(y<256))
		this.x = x;
		this.y = y;
	}
	
	final void stop() {
		System.out.println("멈춥니다.");
	}
	
	void attack(Unit unit) {
		if(type.equals("air")) {
			unit.hp -= attackAirLevel;
		}
		else if(type.equals("ground")) {
			unit.hp -= attackGroundLevel;
		}
	}
	
	

}
