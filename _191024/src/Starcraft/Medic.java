package Starcraft;

public class Medic extends Soldier{
	@Override
	void attack(Unit unit) {
		System.out.println("���� �Ұ�");
	}
	
	@Override
	void stimpack() {
		System.out.println("�ŵ��� �������� ����� �� �����ϴ�.");
	}

}
