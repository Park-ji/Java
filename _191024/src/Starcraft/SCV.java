package Starcraft;

public class SCV extends Worker {
	void refair(Unit unit) {//상대편을 한명 잡아서 에너지를 채워줌
		unit.hp += 10;
	}
}
