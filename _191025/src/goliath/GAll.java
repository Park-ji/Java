package goliath;

public interface GAll extends GtoAir, GtoGround {
	//interface�� �����ڰ� ����!
	void upgrade();

}

interface GtoAir{
	public abstract void attackAir();
}

interface GtoGround{
	void attackGround();
	
}
