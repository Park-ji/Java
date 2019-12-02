package Starcraft;

public class Medic extends Soldier{
	@Override
	void attack(Unit unit) {
		System.out.println("공격 불가");
	}
	
	@Override
	void stimpack() {
		System.out.println("매딕은 스팀팩을 사용할 수 없습니다.");
	}

}
