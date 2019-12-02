package starCraft;

public class SCV {
	int hp = 50;
	int attackLevel = 10;
	int armor = 3;
	int refairLevel = 5;
	int x,y;//전역변수로 선언시, 0으로 초기화됨
		
	void attack(SCV scv) {
		if((this.x == scv.x)&&(this.y==scv.y)) scv.hp -= (this.attackLevel-scv.armor); //공격하려는 scv의 좌표와 공격하는 scv의 좌표가 같아야 공격이 가능하다.
		else System.out.println("공격할 수 없습니다.");
	}
	
	void refair(SCV scv) {
		if((this.x == scv.x)&&(this.y==scv.y)) scv.hp += this.refairLevel;
		else System.out.println("수리할 수 없습니다.");
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
