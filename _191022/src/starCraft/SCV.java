package starCraft;

public class SCV {
	int hp = 50;
	int attackLevel = 10;
	int armor = 3;
	int refairLevel = 5;
	int x,y;//���������� �����, 0���� �ʱ�ȭ��
		
	void attack(SCV scv) {
		if((this.x == scv.x)&&(this.y==scv.y)) scv.hp -= (this.attackLevel-scv.armor); //�����Ϸ��� scv�� ��ǥ�� �����ϴ� scv�� ��ǥ�� ���ƾ� ������ �����ϴ�.
		else System.out.println("������ �� �����ϴ�.");
	}
	
	void refair(SCV scv) {
		if((this.x == scv.x)&&(this.y==scv.y)) scv.hp += this.refairLevel;
		else System.out.println("������ �� �����ϴ�.");
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
