package goliath;

abstract class GallAbstract implements GtoAir, GtoGround {
	//abstract class�� �߻�޼��带 ������ �ֱ⶧���� �������̽��� �ִ� �Լ��� �������� �ʾƵ� ������ ���� ����~
	
	public abstract void upgrade();
	//Gclass���� �� �����Ҳ��� �ʹ� ����ȭ�̹Ƿ�~
	@Override
	public void attackGround() {
		System.out.println("attackGround()");
	}
	@Override
	public void attackAir() {
		System.out.println("attackAir()");
	}
	

}
